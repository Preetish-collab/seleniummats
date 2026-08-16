const { test } = require('@playwright/test');
const XLSX = require('xlsx');
const path = require('path');
//npx playwright test tests/ReadDataExcelfile.spec.js --project chromium --headed
test('Read Excel and print to console', async () => {
  // 1. Resolve relative path to your Excel file
  const filePath = path.resolve(__dirname, '../tests/testData.xlsx');

  // 2. Read the workbook and target sheet
  const workbook = XLSX.readFile(filePath);
  const sheetName = workbook.SheetNames[0]; // Gets the first sheet
  const worksheet = workbook.Sheets[sheetName];

  // 3. Convert sheet data to JSON array of objects
  const records = XLSX.utils.sheet_to_json(worksheet);

  // 4. Print full sheet structure
  console.log('--- ALL EXCEL DATA ---');
  console.log(records);

  // 5. Iterate and print specific row values
  console.log('--- ROW BY ROW DATA ---');
  records.forEach((row, index) => {
    console.log(`Row ${index + 1}: Username = ${row.username}, Password = ${row.password}`);
  });
});