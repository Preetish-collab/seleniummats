const{test,expect}=require('@playwright/test');
//npx playwright test tests/Multiselect.spec.js --project chromium --headed
test('Multiselect',async({page})=>{
       await page.goto('https://testautomationpractice.blogspot.com/');
       //select multiple options from multiselect dropdown
     //  await page.selectOption('#colors', ['Red','blue','green']);
     //const options=await page.locator('#colors option');
     //await expect(options).toHaveCount(7);
//      const options=await page.$$('#colors option');
//      await expect(options.length).toBe(7);
const content=await page.locator('#colors').textContent();
await expect(content.includes('Red')).toBeTruthy();
await expect(content.includes('Blue')).toBeTruthy();
await expect(content.includes('Green')).toBeTruthy();

      await page.waitForTimeout(5000);

})