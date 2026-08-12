import { test, expect } from '@playwright/test';
//npx playwright test tests/Brokenlinks.spec.js --project chromium --headed
test('validate broken link on the webpage', async ({ page }) => {
  await page.goto('https://demo.automationtesting.in/Static.html');

  // Get all href attributes
  const allLinksOnWebPage = await page.locator('a').all();
  const UniqueUrls = new Set();

  for (const link of allLinksOnWebPage) {
    const href = await link.getAttribute('href',{timeout:240000});
    
    console.log("href :"+href);
    if (href) {
      // Resolve relative URLs to absolute ones
      const absoluteUrl = new URL(href, page.url()).href;
      console.log("absoluteUrl:"+absoluteUrl);
      
      // Filter for http/https and ignore duplicates
      if (absoluteUrl.startsWith('http')) {
        UniqueUrls.add(absoluteUrl);
        console.log("absoluteUrl:"+absoluteUrl);
      }
    }
  }

 
  // Validate each URL
  for (const url of UniqueUrls) {
    try {
      // Use HEAD or GET request to check status
      console.log("url :"+url);
      const response = await page.request.get(url);

      
      console.log("response:"+response.status());
      
      // Use soft assertions to collect all broken links without stopping the test
      expect.soft(response.ok(), `Broken link found: ${url} (Status: ${response.status()})`).toBeTruthy();
    } catch (error) {
      console.error(`Error checking ${url}:`, error);
    }
  }
});