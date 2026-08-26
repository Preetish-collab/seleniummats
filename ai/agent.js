const generatePlaywrightCode = require("./openaiClient");

function offlineCodeFor(task) {
  if (task === "Open google.com, search Playwright, click the first link and take a screenshot") {
    return `
      await page.goto("https://www.google.com");
      await page.locator("textarea[name='q'], input[name='q']").first().fill("Playwright");
      await page.keyboard.press("Enter");
      const firstLink = page.locator("a").first();
      if (await firstLink.count()) {
        await firstLink.click({ timeout: 10000 });
      }
      await page.screenshot({ path: "screenshots/playwright-search.png", fullPage: true });
    `;
  }

  return null;
}

async function runAgent(page, task) {
  let code;

  try {
    code = await generatePlaywrightCode(task);
  } catch (error) {
    if (!error.message.includes("OpenAI API quota is exhausted")) {
      throw error;
    }

    code = offlineCodeFor(task);
    if (!code) {
      throw error;
    }

    console.warn("OpenAI quota is exhausted; using the local fallback for this task.");
  }

  console.log("Generated Playwright Code:");
  console.log(code);

  const asyncFunction = new Function("page", `
    return (async () => {
      ${code}
    })();
  `);

  await asyncFunction(page);
}

module.exports = runAgent;