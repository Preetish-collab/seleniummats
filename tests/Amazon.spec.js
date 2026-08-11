const{test,expect}=require('@playwright/test')
//npx playwright test tests/Amazon.spec.js --project chromium --headed
test('AmazonPage',async({page})=>{
    await page.goto('https://www.flipkart.com/');
    
    const links=await page.$$('a');
    for (const link of links){
        const linkname=await link.textContent();
        console.log(linkname);
        if (linkname.includes('Mobiles')){
            await link.click();
            break;
        }
    }
})