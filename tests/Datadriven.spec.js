const { test, expect } = require('@playwright/test');
const testdata = JSON.parse(JSON.stringify(require("../Testdata.json")));
////npx playwright test tests/Datadriven.spec.js --project chromium --headed
//stringify-Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
//parse-Converts a JavaScript Object Notation (JSON) string into an object.

//Defining the Main Test Suite
test.describe('Datadriven logic test', function() {
  //Iterating Over Test Data
  for (const data of testdata) {
//Creates a dynamically named nested test group for each data item using template
    test.describe(`Login with users ${data.id}`, function() {
//Declaring an Individual Test
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

