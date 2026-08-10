const { test, expect } = require('@playwright/test');
//npx playwright test tests/COlorProperty.spec.js --project chromium --headed
// test('Colorproperty', async ({ page }) => {
//   await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');

//   const buttonLocator = page.locator("//div[@class='oxd-form-actions orangehrm-login-action']//button");
//   await expect(buttonLocator).toBeVisible();

//   // Read computed background color and compare with tolerance to handle minor rendering differences
//   const bg = await buttonLocator.evaluate(el => getComputedStyle(el).backgroundColor);
//   const nums = bg.match(/\d+/g).map(Number);
//   const [r, g, b] = nums;
//   const expected = [255, 123, 29];
//   const tol = 3; // allow small differences across browsers/OS
//   expect(Math.abs(r - expected[0])).toBeLessThanOrEqual(tol);
//   expect(Math.abs(g - expected[1])).toBeLessThanOrEqual(tol);
//   expect(Math.abs(b - expected[2])).toBeLessThanOrEqual(tol);
// });



test('Verify element text and background color', async ({ page }) => {
  await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');

  const button = page.locator("//button[text()=' Login ']");

  // Check text color (returns rgb format from computed style)
  await expect(button).toHaveCSS('color', 'rgb(255, 255, 255)');
  console.log('text color matched');

  // Check background color
  await expect(button).toHaveCSS('background-color', 'rgb(255, 123, 29)');
  console.log('background color matched')
});