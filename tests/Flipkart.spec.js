const{test,expect}=require('@playwright/test')
//npx playwright test tests/Flipkart.spec.js --project chromium --headed
//$->document.querySelector inside the page and returns a single ElementHandle
//$$->document.querySelectorAll inside the page and returns an array of ElementHandle objects matching the selector
//But in modern playwright don't use this Replace $ with page.locator() /Replace $$ with locator.all()
test('FlipkartPage',async({page})=>{
    await page.goto('https://www.flipkart.com/');
    
    //const links=await page.$$('a');
    // const links=await page.locator('a').all();
    // for (const link of links){
    //     const linkname=await link.textContent();
    //     console.log(linkname);
        // if (linkname.includes('Mobiles')){
        //     await link.click();
        //     break;
        // }
    //}
    const searchProduct= await page.locator('//input[@placeholder="Search for Products, Brands and More"]').first();
    await searchProduct.fill('Iphone14');
    await searchProduct.press('Enter');
    const productName=await page.locator('//div[text()="Apple iPhone 14 ((PRODUCT)RED, 256 GB)"]');
    ////div[text()='Apple iPhone 14 ((PRODUCT)RED, 256 GB)']/parent::div/parent::div/child::div[@class='col col-5-12 mao5dl']/descendant::div[@class='hZ3P6w DeU9vF']
    const productPrice = productName.locator('xpath=../../div[@class="col col-5-12 mao5dl"]//div[@class="hZ3P6w DeU9vF"]');
    console.log('product name: ',await productName.textContent());
    console.log('product price: ',await productPrice.textContent());
    
    
    
})