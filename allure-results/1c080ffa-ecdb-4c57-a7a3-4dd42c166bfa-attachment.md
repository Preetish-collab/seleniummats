# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Parameterisationwithcsv.spec.js >> Login test for  "" and undefined
- Location: tests\Parameterisationwithcsv.spec.js:17:5

# Error details

```
Error: page.goto: Target page, context or browser has been closed
Call log:
  - navigating to "https://demowebshop.tricentis.com/login", waiting until "load"

```

# Test source

```ts
  1  | const { test, expect } = require('@playwright/test');
  2  | const fs = require('fs');
  3  | const {parse}  = require('csv-parse/sync');
  4  | // npx playwright test tests/Parameterisationwithcsv.spec.js --project chromium --headed
  5  | //  reading testdata from csv
  6  | const csvPath="./tests/testdata/data.csv";
  7  | const fileContent=fs.readFileSync(csvPath,'utf-8');
  8  | const records=parse(fileContent,
  9  |                    {
  10 |                      columns:true,
  11 |                      skip_empty_lines:true,
  12 |                      relax_quotes:true
  13 |                     }
  14 |                     )
  15 | 
  16 |     for (const data of records) {
  17 |     test(`Login test for ${data.email} and ${data.password}`, async ({ page }) => {
> 18 |         await page.goto('https://demowebshop.tricentis.com/login');
     |                    ^ Error: page.goto: Target page, context or browser has been closed
  19 |         // Fill login form
  20 |         await page.locator('#Email').fill(data.email);
  21 |         await page.locator('#Password').fill(data.password);
  22 |         await page.locator("input[value='Log in']").click();
  23 | 
  24 |         if (data.validity.toLowerCase() === 'valid') {
  25 |             const logoutLink = page.locator('a[href="/logout"]');
  26 |             await expect(logoutLink).toBeVisible({ timeout: 5000 });
  27 |         } 
  28 |         else {
  29 |             const errorMessage = page.locator('.validation-summary-errors');
  30 |             await expect(errorMessage).toBeVisible({ timeout: 5000 });
  31 |         }
  32 |     });
  33 | }
  34 |     
```