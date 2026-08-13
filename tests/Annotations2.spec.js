import { test, expect } from '@playwright/test';
//npx playwright test tests/Annotations2.spec.js --project chromium --headed
// 1. test.skip(): Marks the test as skipped (it won't be executed)
test.skip('Skipped test', async ({ page }) => {
  await page.goto('https://playwright.dev');
});

// 2. Conditional skip: Skips only on WebKit (Safari)
test('Skip on WebKit', async ({ page, browserName }) => {
  test.skip(browserName === 'webkit', 'This feature is not supported on Safari');
  await page.goto('https://playwright.dev');
});

// 3. test.fail(): Declares that the test is expected to fail.
// If it passes, Playwright will mark it as failed.
test('Expected failure test', async ({ page }) => {
  test.fail();
  await page.goto('https://playwright.dev');
  await expect(page).toHaveTitle('Wrong Title');
});

// 4. test.fixme(): Marks test as broken; will be skipped until fixed
test.fixme('Needs fixing', async ({ page }) => {
  await page.goto('https://playwright.dev');
});

// 5. test.slow(): Triples the test timeout for slow operations
test('Slow test execution', async ({ page }) => {
  test.slow();
  await page.goto('https://playwright.dev');
});

// 6. test.only(): Runs ONLY this test (useful for local debugging)
/*
test.only('Run only this test', async ({ page }) => {
  await page.goto('https://playwright.dev');
});
*/