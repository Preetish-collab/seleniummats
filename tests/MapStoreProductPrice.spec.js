const { test, expect } = require('@playwright/test');
//npx playwright test tests/MapStoreProductPrice.spec.js --project chromium --headed
test.only('Set example', async ({ page }) => {

  await page.goto('https://www.flipkart.com/');
   const searchProduct= await page.locator('//input[@placeholder="Search for Products, Brands and More"]').first();
    await searchProduct.fill('laptop');
    await searchProduct.press('Enter');
    await page.waitForTimeout(5000)
    const productCards= await page.locator('.k7wcnx');
    const tcount= await productCards.count();
    console.log(tcount);
     const productMap = new Map();

   for(let i=0; i<tcount; i++)
 {
  const card =  productCards.nth(i);
const nameLocator = card.locator(".RG5Slk");
const priceLocator = card.locator(".hZ3P6w.DeU9vF");

const nameText = (await nameLocator.textContent())?.trim().split(' ')[0];
const priceText = (await priceLocator.textContent())?.trim();

if(nameText && priceText)
{
  productMap.set(nameText, priceText)
}
 }
console.log('Product Map is', productMap)
const someProduct = "HP";
if(productMap.has(someProduct))
{
  console.log(`${someProduct} price is ${productMap.get(someProduct)}`);
}

for(const [product, price] of productMap)
{
  console.log(`product : ${product}, price : ${price}`)
}
});


