const{test,expect}=require('@playwright/test');
//npx playwright test tests/Clock.spec.js --project chromium --headed
test('displays static date on page load', async ({ page }) => {
  // Set time before loading the application
  await page.clock.install({ time: new Date('2024-01-01T09:00:00') });
  await page.goto('https://commitquality.com/practice-clock');
  await page.waitForTimeout(6000);
  await expect(page.getByTestId('clock')).toContainText('9:00');
  
});

test('pause time page load', async ({ page }) => {
  // Set time before loading the application
   await page.goto('https://commitquality.com/practice-clock');
   await page.pause();
  await page.clock.pauseAt('2026-08-27T09:00:00');
  await page.waitForTimeout(6000);
    await page.pause();
  
});
test('resume time page load', async ({ page }) => {
  // Set time before loading the application
  await page.goto('https://commitquality.com/practice-clock');
  await page.pause();
  await page.clock.pauseAt('2026-08-27T09:00:00');
  await page.waitForTimeout(6000);
  await page.clock.resume();
  await page.pause();
  
});
test('time fastforward page load', async ({ page }) => {
  // Set time before loading the application
  await page.clock.install();
  await page.goto('https://commitquality.com/practice-clock');
  await page.pause();
  await page.clock.fastForward("05:00");
  await page.waitForTimeout(6000);
  await expect(page.getByText("YOU WON... GO SUBSCRIBE TO COMMIT QUALITY")).toBeVisible();
  await page.pause();
});
