const{test,expect}=require('@playwright/test');
//npx playwright test tests/Demoapptest.spec.js --project chromium --headed
test('orange Hrm',async({page})=>{
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
    await expect (page).toHaveURL('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
   const pagetitle=await page.title();
   console.log('pageTitle',pagetitle)
   //soft Assertion
   //await expect.soft(page).toHaveTitle('OrangeHRM1');
  await expect(page).toHaveTitle('OrangeHRM');
   //await page.locator("//input[@name='username']").fill('Admin');
   await page.getByPlaceholder('Username').fill('Admin');
   await page.fill("input[name='password']",'admin123');
   //await page.locator("//button[@type='submit']").click();
   await page.getByRole('button',{type:'submit'}).click();
   await page.waitForTimeout(5000);
   const logo=page.getByAltText('client brand banner');
   await expect(logo).toBeVisible();
   //for duplicates used exact:true
   await expect(page.getByText('Admin',{exact:true})).toBeVisible();
   //capture multiple elements
   const links=await page.$$('a');
   for(const link of links){
    const linktext=await link.textContent();
    console.log(linktext);
   }

})