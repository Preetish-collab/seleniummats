# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: APiUtils.spec.js >> @QW Security test request intercept
- Location: tests\APiUtils.spec.js:3:2

# Error details

```
Error: locator.waitFor: Target page, context or browser has been closed
Call log:
  - waiting for locator('.card-body b').first() to be visible

```

# Test source

```ts
  1  | const { test,expect } = require('@playwright/test');
  2  | //npx playwright test tests/APiUtils.spec.js --project chromium --headed
  3  |  test('@QW Security test request intercept', async ({ page }) => {
  4  |  
  5  |     //login and reach orders page
  6  |     await page.goto("https://rahulshettyacademy.com/client");
  7  |     await page.locator("#userEmail").fill("anshika@gmail.com");
  8  |     await page.locator("#userPassword").fill("Iamking@000");
  9  |     await page.locator("[value='Login']").click();
  10 |     //Waits for the web network traffic to settle down (networkidle),
  11 |     await page.waitForLoadState('networkidle');
  12 |     //explicitly pauses execution until the first product title element (.card-body b) is attached and visible in the DOM.
> 13 |     await page.locator(".card-body b").first().waitFor();
     |                                                ^ Error: locator.waitFor: Target page, context or browser has been closed
  14 |     //Clicks the "My Orders" navigation button using a partial attribute match (routerlink*='myorders').
  15 |     await page.locator("button[routerlink*='myorders']").click();
  16 |     await page.route("https://rahulshettyacademy.com/api/ecom/order/get-orders-details?id=*",
  17 |     route => route.continue({ url: 'https://rahulshettyacademy.com/api/ecom/order/get-orders-details?id=621661f884b053f6765465b6' }))
  18 |     await page.locator("button:has-text('View')").first().click();
  19 |     await expect(page.locator("p").last()).toHaveText("You are not authorize to view this order");
  20 |  
  21 |  
  22 |  
  23 |  
  24 |  
  25 |  
  26 |  
  27 |  
  28 | })
  29 | 
```