const { test,expect } = require('@playwright/test');
//npx playwright test tests/APiUtils.spec.js --project chromium --headed
 test('@QW Security test request intercept', async ({ page }) => {
 
    //login and reach orders page
    await page.goto("https://rahulshettyacademy.com/client");
    await page.locator("#userEmail").fill("anshika@gmail.com");
    await page.locator("#userPassword").fill("Iamking@000");
    await page.locator("[value='Login']").click();
    //Waits for the web network traffic to settle down (networkidle),
    await page.waitForLoadState('networkidle');
    //explicitly pauses execution until the first product title element (.card-body b) is attached and visible in the DOM.
    await page.locator(".card-body b").first().waitFor();
    //Clicks the "My Orders" navigation button using a partial attribute match (routerlink*='myorders').
    await page.locator("button[routerlink*='myorders']").click();
    await page.route("https://rahulshettyacademy.com/api/ecom/order/get-orders-details?id=*",
    route => route.continue({ url: 'https://rahulshettyacademy.com/api/ecom/order/get-orders-details?id=621661f884b053f6765465b6' }))
    await page.locator("button:has-text('View')").first().click();
    await expect(page.locator("p").last()).toHaveText("You are not authorize to view this order");
 
 
 
 
 
 
 
 
})
