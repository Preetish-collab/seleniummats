const{test,expect}=require('@playwright/test');
//npx playwright test tests/RadioButton.spec.js --project chromium --headed
test('RadioButton',async({page})=>{
       await page.goto('https://testautomationpractice.blogspot.com/');
       await page.locator("//input[@id='male']").check();
     // await page.check("//input[@value='male']");
        await page.waitForTimeout(10000);
      await expect (await page.locator("//input[@id='male']")).toBeChecked();
      await expect(await page.locator("//input[@id='male']").isChecked()).toBeTruthy();
      await expect(await page.locator("//input[@id='male']").isChecked()).toBe(true);
      await expect(await page.locator("//input[@id='female']").isChecked()).toBeFalsy();
        await page.waitForTimeout(10000);
})