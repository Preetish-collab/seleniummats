const{test,expect}=require('@playwright/test')
//npx playwright test tests/scrollIntoView.spec.js --project chromium --headed
test('scrolloptions',async({page})=>{
await page.goto('https://www.flipkart.com/');
//Scroll to a Specific Element
//await page.locator('footer').scrollIntoViewIfNeeded();

//Scroll to the Absolute Bottom of the Page
//await page.evaluate(() => window.scrollTo(0, document.body.scrollHeight));

// Scroll by a Specific Number of Pixels
await page.mouse.wheel(0, 500); 
await page.waitForTimeout(4000)


})