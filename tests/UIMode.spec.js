const{test,expect}=require('@playwright/test')
//npx playwright test tests/UIMode.spec.js --project chromium --headed
//npx playwright test tests/UIMode.spec.js --ui
test('uimode@smoke',async({page})=>{
 page.goto("https://www.demoblaze.com/");
 await page.waitForTimeout(5000);
 await expect(page).toHaveURL("https://www.demoblaze.com/");
 const pagetitle= await page.title();
 console.log("Page Title",pagetitle);
 await expect(page).toHaveTitle('STORE');
 await page.locator('#login7').click();
  await page.waitForTimeout(6000);
 await page.locator('#loginusername').pressSequentially('pavanol');
 await page.fill('#loginpassword','test@123');
 await page.waitForTimeout(5000);
 await page.locator("//button[normalize-space()='Log in']").click();
});
test('uimode@regression',async({page})=>{
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   const pagetitle= await page.title();
   await expect(page).toHaveTitle('OrangeHRM');
   console.log(pagetitle);
})