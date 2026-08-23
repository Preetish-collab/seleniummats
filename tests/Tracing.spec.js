
import { test, expect } from '@playwright/test';
//npx playwright test tests/Tracing.spec.js --project chromium --headed
//npx playwright show-trace test-results\Tracing-test-chromium\trace.zip
test('test', async ({ page }) => {
  await page.goto('https://www.demoblaze.com/index.html');
  await page.getByRole('link', { name: 'Log in' }).click();
  await page.locator('#loginusername').fill('pavanol');
  await page.locator('#loginpassword').fill('test@123');
  await page.getByRole('button', { name: 'Log in' }).click();
  await expect(page.locator('#logout2')).toBeVisible()
});