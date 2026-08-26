import {request, test} from '@playwright/test';
//npx playwright test Intercept.spec.ts --project=chromium --headed
test.skip('Continue request',async({page})=>{
await page.route('**/products.json',async(route)=>{
    const request=route.request();
    console.log('URL:', request.url());
    console.log('Method:', request.method());
    console.log('Headers:', request.headers());
    console.log('####Product API Intercepted####');
    await route.continue();
})
await page.goto('https://react-shopping-cart-67954.firebaseapp.com/');
await page.waitForTimeout(5000);
});

test.skip('Abort request',async({page})=>{
await page.route('**/products.json',async(route)=>{
   console.log('####Product API Blocked####');
    await route.abort();
})
await page.goto('https://react-shopping-cart-67954.firebaseapp.com/');
await page.waitForTimeout(5000);
});

test('Mocking API request',async({page})=>{
await page.route('**/products.json',async(route)=>{
    //Get real response first
    const response=await route.fetch();
    const body= await response.json();

    //Modify data keep only 3 products
    body.products= body.products.slice(0,3);

    //Send modify response back to UI
    await route.fulfill({
        response,
        body: JSON.stringify(body)
    });
    console.log('####Product API Mocked####');
});
await page.goto('https://react-shopping-cart-67954.firebaseapp.com/');
await page.waitForTimeout(5000);
});