const { test, expect } = require('@playwright/test');
import { ReportingApi } from '@reportportal/agent-js-playwright';
//npx playwright test tests/ReportPortal.spec.js --project chromium --headed

test('Reportportal',async({page},testInfo)=>{
ReportingApi.addAttributes([{ key: 'feature', value: 'dashboard' }]);
 page.goto("https://www.demoblaze.com/");
 ReportingApi.info('Navigated to home page');
 await expect(page).toHaveURL("https://www.demoblaze.com/");
 const pagetitle= await page.title();
 console.log("Page Title",pagetitle);
 await expect(page).toHaveTitle('STORE');
 await page.locator('#login2').click();
 await page.waitForTimeout(6000);
 await page.locator('#loginusername').pressSequentially('pavanol');
 await page.fill('#loginpassword','test@123');
 await page.waitForTimeout(5000);
 await page.locator("//button[normalize-space()='Log in']").click();
 const screenshot = await page.screenshot();
  await testInfo.attach('screenshot', { body: screenshot, contentType: 'image/png' });
 ReportingApi.info('User logged in successfully');

});
