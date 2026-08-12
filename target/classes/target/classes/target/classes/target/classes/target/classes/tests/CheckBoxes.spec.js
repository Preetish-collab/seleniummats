const{test,expect}=require('@playwright/test');
//npx playwright test tests/CheckBoxes.spec.js --project chromium --headed
test('CheckBoxes',async({page})=>{
       await page.goto('https://testautomationpractice.blogspot.com/');
       await page.locator("//input[@id='sunday'and @type='checkbox']").check();
      // await page.waitForTimeout(10000);
       //single checkbox
      await expect (await page.locator("//input[@id='sunday'and @type='checkbox']")).toBeChecked();
      await expect(await page.locator("//input[@id='sunday'and @type='checkbox']").isChecked()).toBeTruthy();
      await expect(await page.locator("//input[@id='sunday'and @type='checkbox']").isChecked()).toBe(true);
      await expect(await page.locator("//input[@id='monday'and @type='checkbox']").isChecked()).toBeFalsy();
        //await page.waitForTimeout(10000);
        //multiple checkboxes
        const checkboxes=[
           " //input[@id='sunday'and @type='checkbox']",
           " //input[@id='monday'and @type='checkbox']",
           " //input[@id='tuesday'and @type='checkbox']"

        ];
        for(const checkbox of checkboxes){
            await page.locator(checkbox).check();
           }

            for(const checkbox of checkboxes){
            if(await page.locator(checkbox).isChecked()){
             
                await page.locator(checkbox).uncheck();
            }
           }
        await page.waitForTimeout(10000);
       
})