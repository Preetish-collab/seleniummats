const{test,expect,chromium}=require('@playwright/test');
//npx playwright test tests/DummyPages.spec.js --project chromium --headed
test('Dummy test',async()=>{
const browser=await chromium.launch();
const context=await browser.newContext();
const page1=await context.newPage();
const page2=await context.newPage();
const allPages=await context.pages();
console.log(allPages.length);
await page1.goto('https://rahulshettyacademy.com/AutomationPractice/');
await page2.goto('https://www.google.com/');
await page1.getByRole('link',{name:'Home'}).click();
await page2.getByRole('link',{name:'Gmail'}).click();
await expect(page1).toHaveURL('https://rahulshettyacademy.com/');
await expect(page2).toHaveURL('https://workspace.google.com/intl/en-US/gmail/');
await browser.close();

});