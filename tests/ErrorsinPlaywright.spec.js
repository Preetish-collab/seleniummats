import { test, expect } from '@playwright/test';
//npx playwright test tests/ErrorsinPlaywright.spec.js --project chromium --headed
test('handling timeout error', async ({ page }) => {
  await page.goto('https://google.com');

  // Throws TimeoutError: waiting for locator('#submit-button') to be visible
  try {
    await page.click('#submit-button', { timeout: 2000 });
  } catch (error) {
    if (error.name === 'TimeoutError') {
      console.error('Element took too long to become clickable.');
    }
  }
});