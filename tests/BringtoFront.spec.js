const { test, expect } = require('@playwright/test');
//npx playwright test tests/BringtoFront.spec.js --project chromium --headed
test('FrontPage', async ({ browser }) => {
  const context = await browser.newContext();
  const page1 = await context.newPage();
  const page2 = await context.newPage();
  await page1.goto('https://www.demoblaze.com');
  await page2.goto('https://www.google.com');
  await page1.bringToFront();
});