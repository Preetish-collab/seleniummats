const fs = require("node:fs");
const path = require("node:path");

const root = path.resolve(__dirname, "..");
const testFile = path.join(root, "tests", "login.spec.js");
const appFile = path.join(root, "app", "index.html");

const testCode = fs.readFileSync(testFile, "utf8");
const appHtml = fs.readFileSync(appFile, "utf8");

const locatorMatch = testCode.match(/locator\("([^"]+)"\)\.click\(\)/);

if (!locatorMatch) {
  console.log("No clickable locator found to heal.");
  process.exit(0);
}

const brokenLocator = locatorMatch[1];

if (appHtml.includes(brokenLocator.replace("#", "id=\"") + "\"")) {
  console.log("The locator still exists in the app. No healing needed.");
  process.exit(0);
}

const candidates = [...appHtml.matchAll(/<button[^>]*data-testid="([^"]+)"[^>]*>([\s\S]*?)<\/button>/g)]
  .map((match) => {
    const testId = match[1];
    const label = match[2].replace(/\s+/g, " ").trim();
    return {
      selector: `[data-testid='${testId}']`,
      label
    };
  });

const signInCandidate = candidates.find((candidate) => /sign in|login|log in/i.test(candidate.label));
const healedLocator = signInCandidate?.selector;

if (!healedLocator) {
  console.log(`Could not find a safe replacement for ${brokenLocator}.`);
  process.exit(1);
}

const healedCode = testCode.replace(`locator("${brokenLocator}").click()`, `locator("${healedLocator}").click()`);
fs.writeFileSync(testFile, healedCode);

console.log("AI self-healing report");
console.log("----------------------");
console.log(`Broken locator: ${brokenLocator}`);
console.log(`Replacement: ${healedLocator}`);
console.log("Reason: the old button id no longer exists, but the visible Sign in button has a stable data-testid.");
console.log("");
console.log("Next step: run npm test again to confirm the healed test passes.");