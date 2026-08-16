const { test, expect } = require('@playwright/test');
const XLSX = require('xlsx');
const path = require('path');
//npx playwright test tests/ExcelReader.spec.js --project chromium --headed
// 1. Helper function to read Excel rows as JSON objects
function readExcelData(filePath, sheetName) {
  const absolutePath = path.resolve(__dirname, filePath);
  const workbook = XLSX.readFile(absolutePath);
  const worksheet = workbook.Sheets[sheetName];
  
  // Converts rows to key-value objects using Row 1 as headers
  return XLSX.utils.sheet_to_json(worksheet);
}

// 2. Load the excel file data before tests run
const testCases = readExcelData('../tests/testData.xlsx', 'Sheet1');

// 3. Generate dynamic data-driven tests
for (const record of testCases) {
  test(`Login test for user: ${record.username}`, async ({ page }) => {
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
    // Access properties matching the column names in your Excel file
    await page.fill("//input[@name='username']", record.username);
    await page.fill("//input[@name='password']", record.password);
    await page.getByRole('button',{type:'submit'});

    
  });
}