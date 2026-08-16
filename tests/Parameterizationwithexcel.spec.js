const { test, expect } = require('@playwright/test');
const fs = require('fs');//This code imports Node.js's built-in File System (fs) module into your JavaScript script.
const XLSX = require('xlsx');
// npx playwright test tests/Parameterizationwithexcel.spec.js --project chromium --headed
//  loaded excel file
const excelPath = "./tests/testdata/data.xlsx";
const workbook = XLSX.readFile(excelPath);
const sheetName = workbook.SheetNames[0];
const workSheet = workbook.Sheets[sheetName];
const loginData = XLSX.utils.sheet_to_json(workSheet);

for (const {email,password,validity} of loginData) {
    test(`Loginexcel test for ${email} and ${password}`, async ({ page }) => {
        await page.goto('https://demowebshop.tricentis.com/login');
        // Fill login form
        await page.locator('#Email').fill(email);
        await page.locator('#Password').fill(password);
        await page.locator("input[value='Log in']").click();

        if (validity.toLowerCase() === 'valid') {
            const logoutLink = page.locator('a[href="/logout"]');
            await expect(logoutLink).toBeVisible({ timeout: 5000 });
        } else {
            const errorMessage = page.locator('.validation-summary-errors');
            await expect(errorMessage).toBeVisible({ timeout: 5000 });
        }
    });
}
    