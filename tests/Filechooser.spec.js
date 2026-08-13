const { test, expect } = require('@playwright/test');
const path = require('path');
//npx playwright test tests/Filechooser.spec.js --project chromium --headed
test('upload a file using filechooser event', async ({ page }) => {
  // 1. Navigate to a page with a file upload input
  await page.goto('https://the-internet.herokuapp.com/upload');

  // 2. Set up the event listener BEFORE triggering the action
  const fileChooserPromise = page.waitForEvent('filechooser');

  // 3. Click the button/element that opens the native OS file picker dialog
  await page.locator('#file-upload').click();

  // 4. Await the filechooser event to capture the chooser instance
  const fileChooser = await fileChooserPromise;

  // 5. Attach the file(s) to the input
  const filePath = path.join(__dirname, '..','samplefile.pdf');
  await fileChooser.setFiles(filePath);

  // 6. Complete the workflow (e.g., click submit)
  await page.locator('#file-submit').click();

  // 7. Assert success
  await expect(page.locator('#uploaded-files')).toContainText('samplefile.pdf');
});