import { test, expect } from '@playwright/test';
//npx playwright test tests/ShadowDom.spec.js --project chromium --headed
test('shadowdom', async ({ page }) => {
  await page.goto('https://letcode.in/shadow');
  await page.fill("#fname","preetish");
//   page.waitForTimeout(3000);
})