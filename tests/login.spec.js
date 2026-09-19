const { test, expect } = require("@playwright/test");
//npx playwright test tests/login.spec.js --project chromium --headed
test("demoblazelogin", async ({ page }) => {
  await page.goto("https://www.demoblaze.com/");
   await page.locator("#login2").click();
   await page.waitForTimeout(4000);
  await page.locator("#loginusername").pressSequentially('pavanol');
 await page.fill('#loginpassword','test@123');
await page.waitForTimeout(4000);
  // Broken on purpose for the demo: the app used to have id="login-button".
  await page.locator("//button[normalize-space()='Log in']").click();

  await expect.soft(page.getByText('Welcome pavanol',{exact:'true'})).toBeVisible();
});