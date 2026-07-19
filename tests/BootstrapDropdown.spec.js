const{test,expect}=require('@playwright/test');
//npx playwright test tests/BootstrapDropdown.spec.js --project chromium --headed
test('BootstrapDropdown',async({page})=>{
       await page.goto('https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html');
       await page.locator("//button[@id='menu1']").click();
       const options=await page.locator("//ul/li/a[@role='menuitem']");
      await expect(options).toHaveCount(4);
      const menuOptions = await page.$$("//ul/li/a[@role='menuitem']");
      for (let optionHandle of menuOptions) {
       let text = await optionHandle.textContent();
     //  console.log(text);
     if(text.includes('JavaScript')) {
        await optionHandle.click();
        break;
      }
    }
    await page.waitForTimeout(10000);
});
