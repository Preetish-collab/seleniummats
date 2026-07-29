const{test,expect}=require('@playwright/test')
//npx playwright test tests/test.spec.js --project chromium --headed
test('Testweb',async({page})=>{
 page.goto("https://www.demoblaze.com/");
 await page.waitForTimeout(5000);
 await expect(page).toHaveURL("https://www.demoblaze.com/");
 const pagetitle= await page.title();
 console.log("Page Title",pagetitle);
 await expect(page).toHaveTitle('STORE');
 await page.locator('#login2').click();
  await page.waitForTimeout(6000);
 await page.locator('#loginusername').pressSequentially('pavanol');
 await page.fill('#loginpassword','test@123');
 await page.waitForTimeout(5000);
 //await page.getByRole('button',{type:'button'}).click();
 await page.locator("//button[normalize-space()='Log in']").click();
 await page.waitForTimeout(6000);
 //await expect(page.getByText('Welcome pavanol')).toBeVisible();
 await expect.soft(page.getByText('Welcome pavanol',{exact:'true'})).toBeVisible();
 //Fetching links
 const links=await page.$$('a');
 for(const link of links){
    const linktext=await link.textContent();
    console.log(linktext);
 }

 //fetching products
 const products=await page.$$("//div[@id='tbodyid']//h4/a");
 for(const product of products){
    const productName=await product.textContent();
    console.log(productName);
 }
 await page.click("//a[@id='logout2']");
 console.log("Application Loggedout");
})