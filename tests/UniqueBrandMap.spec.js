const { test, expect } = require('@playwright/test');
//npx playwright test tests/UniqueBrandMap.spec.js --project chromium --headed
test.only('Set example', async ({ page }) => {

  await page.goto('https://www.flipkart.com/');
   const searchProduct= await page.locator('//input[@placeholder="Search for Products, Brands and More"]').first();
    await searchProduct.fill('laptop');
    await searchProduct.press('Enter');
    await page.waitForTimeout(5000)

  const allBrands = await page.locator(".RG5Slk").allTextContents();
  console.log(allBrands)

  const brandNames = allBrands.map(product => product.split(' ')[0]);
  console.log(brandNames);

  const uniqueBrands = new Set(brandNames);
  console.log(uniqueBrands)
});;