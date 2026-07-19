const{test,expect}=require('@playwright/test');
//npx playwright test tests/Hookstest.spec.js --project chromium --headed
let page;
test.beforeEach(async({browser})=>{
    page=await browser.newPage()
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
    //login
    await page.getByPlaceholder('Username').fill('Admin');
    await page.fill("input[name='password']",'admin123');
    await page.locator("//button[@type='submit']").click();
});

test.afterEach(async()=>{
//logout
await page.locator("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']").click();
await page.locator("//a[text()='Logout']").click();
   });

test('MyHomePage',async()=>{
    //homepage
    const links=await page.$$('a');
   for(const link of links){
    const linktext=await link.textContent();
    console.log(linktext);
   }
});

test('Myinfo',async()=>{
    
    //myinfo link
    await page.locator("//span[normalize-space()='My Info']").click();
    await page.waitForTimeout(5000)
    await page.locator("(//button[@type='submit'])[1]").click();
    await page.waitForTimeout(5000)
    await page.locator("(//button[@type='submit'])[2]").click();
    await page.waitForTimeout(5000)
});


