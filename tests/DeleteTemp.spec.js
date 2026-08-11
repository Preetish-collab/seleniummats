import { test, expect } from '@playwright/test';
import fs from 'fs';
import path from 'path';
//npx playwright test tests/DeleteTemp.spec.js 
const TEMP_DIR = path.join(__dirname, 'temp_test_files');

test.beforeAll(async () => {
  // Create temp directory before tests start if it doesn't exist
  if (!fs.existsSync(TEMP_DIR)) {
    fs.mkdirSync(TEMP_DIR);
  }
});

// test.afterAll(async () => {
//   // Delete the entire temp folder and its contents after all tests finish
//   if (fs.existsSync(TEMP_DIR)) {
//     fs.rmSync(TEMP_DIR, { recursive: true, force: true });
//   }
// });

test('Create and cleanup temp file', async ({ page }) => {
  const filePath = path.join(TEMP_DIR, 'sample.txt');
  fs.writeFileSync(filePath, 'Temporary data');

  // Test logic here...
});