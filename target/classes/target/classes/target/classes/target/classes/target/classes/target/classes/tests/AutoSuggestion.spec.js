const{test,expect}=require('@playwright/test');
//npx playwright test tests/AutoSuggestion.spec.js --project chromium --headed
test('AutoSuggestion',async({page})=>{
       await page.goto('https://www.redbus.in/');
     //  await page.waitForSelector("//div[contains(@class,'srcDestWrapper') ])[1]");
       await page.locator("#srcinput").fill('Delhi');
       
     //  await page.waitForSelector("//div[contains(@class,'listHeader_')]");
         const options=await page.$$("//div[contains(@class,'listHeader___')]");
         console.log("Total options are: ",options.length);
         for(let optionHandle of options) {
            await page.waitForTimeout(3000);
            let text = await optionHandle.textContent();
            console.log(text);     
         } 
 await page.waitForTimeout(10000);
})
