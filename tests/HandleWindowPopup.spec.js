import { test, expect } from '@playwright/test';
import { chromium } from 'playwright';
//npx playwright test tests/HandleWindowPopup.spec.js --project chromium --headed
test('Handle Window Popup', async () => {
  const browser = await chromium.launch({ headless: false });
  const context = await browser.newContext();
  const page = await context.newPage();

  await page.goto('https://www.lambdatest.com/selenium-playground/window-popup-modal-demo');

  const popupPromise = page.waitForEvent('popup');
  await page.click('text=Follow On Twitter');
  const popup = await popupPromise;

  await popup.waitForLoadState();
  console.log('Popup title:', await popup.title());

  await expect(popup).toHaveURL(/twitter|x\.com/);
  await popup.close();
  await browser.close();
});
