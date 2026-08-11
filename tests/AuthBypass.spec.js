const { test, expect } = require('@playwright/test');
//npx playwright test tests/AuthBypass.spec.js --project chromium --headed

test('Authskip', async ({ page }) => {
  console.log('message1');
  await page.goto('https://demoblaze.com');
  const links = await page.$$('a');
  for (const link of links) {
    const linkText = await link.textContent();
    console.log(linkText);
  }
});

test('Authskip2', async ({ page }) => {
  console.log('message2');
  await page.goto('https://demoblaze.com');
  const products = await page.$$("//div[@id='tbodyid']//h4/a");
  for (const product of products) {
    const productName = await product.textContent();
    console.log(productName);
  }
});

test('Authskip3', async ({ page }) => {
  console.log('message3');
  await page.goto('https://demoblaze.com');
 
});