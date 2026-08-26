const promptTemplate = (task) => `
You are a Playwright automation expert.

Convert the following task into Playwright JavaScript code.
Use only Playwright page object methods like:
- page.goto()
- page.fill()
- page.click()
- page.press()
- page.screenshot()

Rules:
- Only return JavaScript Playwright code.
- Do not return explanation.
- Use await before each Playwright action.
- Save screenshot in screenshots folder.

Task:
${task}
`;

module.exports = promptTemplate;