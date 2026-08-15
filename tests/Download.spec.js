const {test, expect}= require('@playwright/test')
//npx playwright test tests/Download.spec.js --project chromium --headed
test ('Download file', async ({page})=>{

   await page.goto('https://demo.automationtesting.in/FileDownload.html');
      const downloadPromise = page.waitForEvent('download');

  // 2. Perform the action that triggers the download
 await page.locator("(//a[text()='Download'])[1]").click();

  // 3. Await the download process
   const download = await downloadPromise;
// const [download] = await Promise.all([
//   page.waitForEvent('download'), // Wait for the download event
//   page.locator("(//a[text()='Download'])[1]").click() // Trigger the download
// ]);

// 4. Save the file to your desired destination
await download.saveAs('E:\\Play Wright\\playWrighttest\\tests\\downloads\\' + download.suggestedFilename());

// 5. Take a screenshot of the browser showing the completed state
  await page.screenshot({ path: 'screenshots/download-success.png', fullPage: true });
});
