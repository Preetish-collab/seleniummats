const { test, expect } = require('@playwright/test');
const fs = require('fs');
const {parse}  = require('csv-parse/sync');
// npx playwright test tests/Parameterisationwithcsv.spec.js --project chromium --headed
//  reading testdata from csv
const csvPath="./tests/testdata/data.csv";
const fileContent=fs.readFileSync(csvPath,'utf-8');
const records=parse(fileContent,
                   {
                     columns:true,
                     skip_empty_lines:true,
                     relax_quotes:true
                    }
                    )

    for (const data of records) {
    test(`Logincsv test for ${data.email} and ${data.password}`, async ({ page }) => {
        await page.goto('https://demowebshop.tricentis.com/login');
        // Fill login form
        await page.locator('#Email').fill(data.email);
        await page.locator('#Password').fill(data.password);
        await page.locator("input[value='Log in']").click();

        if (data.validity.toLowerCase() === 'valid') {
            const logoutLink = page.locator('a[href="/logout"]');
            await expect(logoutLink).toBeVisible({ timeout: 5000 });
        } 
        else {
            const errorMessage = page.locator('.validation-summary-errors');
            await expect(errorMessage).toBeVisible({ timeout: 5000 });
        }
    });
}
    