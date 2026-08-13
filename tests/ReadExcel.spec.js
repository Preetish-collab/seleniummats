const { test, expect } = require('@playwright/test');
const XLSX = require('xlsx');
const path = require('path');

//npx playwright test tests/ReadExcel.spec.js --project chromium --headed
// 1. Construct the file path
const filePath = path.join(__dirname, 'testData.xlsx');

// 2. Read the Excel workbook
const workbook = XLSX.readFile(filePath);

// 3. Select the first worksheet
const sheetName = workbook.SheetNames[0];
const worksheet = workbook.Sheets[sheetName];

// 4. Convert sheet rows to JSON
const testData = XLSX.utils.sheet_to_json(worksheet);

// 5. Iterate through each line (row)
for (const row of testData) {
  test(`Login test for ${row.username}`, async ({ page }) => {
    await page.goto("https://www.demoblaze.com/");
    await page.locator('#login2').click();
    await page.locator('#loginusername').fill(row.username);
    await page.locator('#loginpassword').fill(row.password);
    
  });
}