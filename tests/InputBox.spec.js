const{test,expect}=require('@playwright/test');

test('InputBox',async({page})=>{
       await page.goto('https://testautomationpractice.blogspot.com/');
       await expect(await page.locator("//input[@id='name']")).toBeVisible();
       await expect(await page.locator("//input[@id='name']")).toBeEnabled();
       await expect(await page.locator("//input[@id='name']")).toBeEmpty();
       await expect(await page.locator("//input[@id='name']")).toBeEditable();
      // await page.locator("//input[@id='name']").fill('Preetish');
      // await page.dispatchEvent("//input[@id='name']",'Preetish');
      await page.fill("//input[@id='name']",'Preetish');
       await page.waitForTimeout(5000);

})