# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Download.spec.js >> Download file
- Location: tests\Download.spec.js:3:1

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: page.waitForEvent: Test timeout of 30000ms exceeded.
=========================== logs ===========================
waiting for event "download"
============================================================
```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - main [ref=e2]:
    - generic [ref=e3]:
      - heading "file-examples.com" [level=1] [ref=e5]
      - heading "Verifying you are human. This may take a few seconds." [level=2] [ref=e6]
      - paragraph [ref=e7]: This website uses a security service to protect against malicious bots. This page is displayed while the website verifies you are not a bot.
  - contentinfo [ref=e14]:
    - generic [ref=e16]:
      - generic [ref=e18]:
        - text: "Ray ID:"
        - code [ref=e19]: a244dc7719c2ce3e
      - generic [ref=e20]:
        - generic [ref=e21]:
          - text: Performance and Security by
          - link "Cloudflare, opens in a new tab" [ref=e22] [cursor=pointer]:
            - /url: https://www.cloudflare.com?utm_source=challenge&utm_campaign=m
            - text: Cloudflare
        - link "Privacy, opens in a new tab" [ref=e24] [cursor=pointer]:
          - /url: https://www.cloudflare.com/privacypolicy/
          - text: Privacy
```

# Test source

```ts
  1  | const {test, expect}= require('@playwright/test')
  2  | //npx playwright test tests/Download.spec.js --project chromium --headed
  3  | test ('Download file', async ({page})=>{
  4  | 
  5  |    await page.goto('https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/');
> 6  |    const downloadPromise = page.waitForEvent('download');
     |                                 ^ Error: page.waitForEvent: Test timeout of 30000ms exceeded.
  7  | 
  8  | // 2. Perform the action that triggers the download
  9  | await page.getByText('Download sample pdf file').click();
  10 | 
  11 | // 3. Await the download process
  12 | const download = await downloadPromise;
  13 | 
  14 | // 4. Save the file to your desired destination
  15 | await download.saveAs('E:\\Play Wright\\playWrighttest\\tests\\downloads\\' + download.suggestedFilename());
  16 | });
  17 | 
```