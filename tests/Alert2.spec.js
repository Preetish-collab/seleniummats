const { test, expect } = require('@playwright/test');
//npx playwright test tests/Alert2.spec.js --project chromium --headed
test('Alert2', async ({ page }) => {
  await page.goto('https://demo.automationtesting.in/Alerts.html');
  page.on('dialog', async dialog => {
    // Verify type of dialog
    expect(dialog.type()).toContain('alert');
    // verify message of alert
    expect(dialog.message()).toContain('I am an alert box!');
    //click on alert ok button
    await dialog.accept();
  });
  await page.click('xpath=//*[@id="OKTab"]/button');
  await page.waitForTimeout(6000);
});

test.only('Confirm Alert with OK and Cancel', async ({ page }) => {
  await page.goto('https://demo.automationtesting.in/Alerts.html');
  page.on('dialog', async dialog => {
    // Verify type of dialog
    expect(dialog.type()).toContain('confirm');
    // verify message of alert
    expect(dialog.message()).toContain('Press a Button !');
    //click on alert ok button
    await dialog.dismiss();
  });
  await page.click('xpath=//*[@id="CancelTab"]/button');
  await page.waitForTimeout(6000);
});