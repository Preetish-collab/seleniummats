const{test,expect}=require('@playwright/test');
//npx playwright test tests/Dropdown.spec.js --project chromium --headed
test('Dropdown',async({page})=>{
       await page.goto('https://testautomationpractice.blogspot.com/');
       //await page.locator("//select[@id='country']").selectOption({label:'India'});
      // await page.locator("#country").selectOption('India');
     //   await page.locator("#country").selectOption({value:'uk'});
      //    await page.locator("#country").selectOption({index:4});//france
   //   await page.selectOption("#country", 'India');

     //  await page.waitForTimeout(5000);
     const dropdown=page.locator("#country option");
     await expect(dropdown).toHaveCount(10);
     const options=await page.$$('#country option')
     console.log("Total options in dropdown are: "+options.length);
     const content=await page.locator('#country').textContent();
     await expect(content.includes('India')).toBeTruthy(); 
     let status=false;
     for(const option of options){
       // const text=await option.textContent();
       // console.log(text);
       let value=await option.textContent();
       if(value.includes('India')){
        status=true;
        break;
       }
     }  
     expect(status).toBeTruthy(); 
     await page.waitForTimeout(10000);
})
