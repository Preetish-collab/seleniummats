const { test, expect } = require('@playwright/test');
const logger = require('./LoggerUtil');

//npx playwright test tests/UIMode.spec.js --project chromium --headed
//npx playwright test tests/UIMode.spec.js --ui
test('uimode@smoke',async({page})=>{
 page.goto("https://www.demoblaze.com/");
 logger.info("Navigated to the demoblaze website");
 await expect(page).toHaveURL("https://www.demoblaze.com/");
 const pagetitle= await page.title();
 console.log("Page Title",pagetitle);
 await expect(page).toHaveTitle('STORE');
 logger.info("Page title verified successfully");
 await page.locator('#login2').click();
  await page.waitForTimeout(6000);
 await page.locator('#loginusername').pressSequentially('pavanol');
 await page.fill('#loginpassword','test@123');
 await page.waitForTimeout(5000);
 await page.locator("//button[normalize-space()='Log in']").click();
 logger.info("User logged in successfully");
});
test('uimode@regression',async({page})=>{
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   logger.info("Navigated to the OrangeHRM website");
   const pagetitle= await page.title();
   await expect(page).toHaveTitle('OrangeHRM');
   logger.info("Page title verified successfully");
   console.log(pagetitle);
})