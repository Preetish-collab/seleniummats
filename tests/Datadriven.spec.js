const { test, expect } = require('@playwright/test');
const testdata = JSON.parse(JSON.stringify(require("../Testdata.json")));
////npx playwright test tests/Datadriven.spec.js --project chromium --headed

test.describe('Datadriven logic test', function() {
  for (const data of testdata) {
    test.describe(`Login with users ${data.id}`, function() {
      test(`Datadriventest ${data.id}`, async ({ page }) => {
        await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        await page.getByPlaceholder('username').fill(data.username);
        await page.getByPlaceholder('password').fill(data.password);
        //  await page.getByPlaceholder('address').fill(data.address.area);
        //  await page.getByPlaceholder('interest').fill(data.interest[0]);
      });
    });
  }
});

