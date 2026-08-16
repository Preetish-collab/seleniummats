const{test,expect}=require('@playwright/test')
//npx playwright test tests/Amazon.spec.js --project chromium --headed
//$->document.querySelector inside the page and returns a single ElementHandle
//$$->document.querySelectorAll inside the page and returns an array of ElementHandle objects matching the selector
//But in modern playwright don't use this Replace $ with page.locator() /Replace $$ with locator.all()
test('AmazonPage',async({page})=>{
    await page.goto('https://www.flipkart.com/');
    
    //const links=await page.$$('a');
    const links=await page.locator('a').all();
    for (const link of links){
        const linkname=await link.textContent();
        console.log(linkname);
        if (linkname.includes('Mobiles')){
            await link.click();
            break;
        }
    }
})