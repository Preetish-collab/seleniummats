const { chromium } = require('playwright');
const { test, expect } = require('@playwright/test');
//npx playwright test tests/ChromeDevtoolsProtocol.spec.js --project chromium --headed
test.only('Cdp session', async ({page}) => {
  const browser = await chromium.launch();
 const client = await page.context().newCDPSession(page);
// Enable the Performance domain
await client.send('Performance.enable');
await page.goto('https://google.com');
const { metrics } = await client.send('Performance.getMetrics');
metrics.forEach((metric) => {
  console.log(`${metric.name}: ${metric.value}`);
});
await browser.close();
});

test('simulate network conditions', async ({ page }) => {
  const browser = await chromium.launch();
  const client = await page.context().newCDPSession(page);
  await client.send('Network.emulateNetworkConditions', {
    offline: false,
    latency: 400, // ms
    downloadThroughput: (400 * 1024) / 8, // 400 kbps
    uploadThroughput: (400 * 1024) / 8,   // 400 kbps
    connectionType: 'cellular3g',
  });
  // Take a snapshot of the JavaScript heap
  await client.send('HeapProfiler.enable');
  client.on('HeapProfiler.addHeapSnapshotChunk', (chunk) => {
    // Process or save heap snapshot stream data
    process.stdout.write(chunk.chunk);
  });

  await client.send('HeapProfiler.takeHeapSnapshot', { reportProgress: false });
  await page.goto('https://toolsqa.com');
});