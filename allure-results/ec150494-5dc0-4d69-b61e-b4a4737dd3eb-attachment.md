# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Download.spec.js >> Download file
- Location: tests\Download.spec.js:3:1

# Error details

```
Error: locator.click: Error: strict mode violation: getByText('Download') resolved to 13 elements:
    1) <a href="FileDownload.html">File Download</a> aka getByText('File Download', { exact: true })
    2) <h2>File Download Demo for Automation</h2> aka getByRole('heading', { name: 'File Download Demo for' })
    3) <a type="button" class="btn btn-primary" href="https://github.com//sakinala/AutomationTesting/raw/master/samplefile.pdf">Download</a> aka getByRole('link', { name: 'Download' })
    4) <div class="panel-heading">…</div> aka getByText('Generated Text File to')
    5) <p>By default Download link will be hidden.</p> aka getByText('By default Download link will').first()
    6) <p>…</p> aka getByText('You need to enter data in the').first()
    7) <p>…</p> aka getByText('Data entered in the below textarea will be download with file name \'info.txt\'')
    8) <a download="info.txt" id="link-to-download">Download</a> aka locator('#link-to-download')
    9) <div class="panel-heading">…</div> aka getByText('Generated PDF File to')
    10) <p>By default Download link will be hidden.</p> aka getByText('By default Download link will').nth(1)
    ...

Call log:
  - waiting for getByText('Download')

```

```
Error: page.waitForEvent: Test ended.
=========================== logs ===========================
waiting for event "download"
============================================================
```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - banner [ref=e2]:
    - generic [ref=e5]:
      - link "image not displaying" [ref=e7] [cursor=pointer]:
        - /url: http://www.automationtesting.in
        - img "image not displaying" [ref=e8]
      - heading "Automation Demo Site" [level=1] [ref=e10]
    - navigation [ref=e11]:
      - list [ref=e14]:
        - listitem [ref=e15]:
          - link "Home" [ref=e16] [cursor=pointer]:
            - /url: Index.html
        - listitem [ref=e17]:
          - link "Register" [ref=e18] [cursor=pointer]:
            - /url: Register.html
        - listitem [ref=e19]:
          - link "WebTable" [ref=e20] [cursor=pointer]:
            - /url: WebTable.html
        - listitem [ref=e21]:
          - link "SwitchTo" [ref=e22] [cursor=pointer]:
            - /url: SwitchTo.html
          - generic [ref=e23]: 
        - listitem [ref=e24]:
          - link "Widgets" [ref=e25] [cursor=pointer]:
            - /url: Widgets.html
          - generic [ref=e26]: 
        - listitem [ref=e27]:
          - link "Interactions" [ref=e28] [cursor=pointer]:
            - /url: Interactions.html
          - generic [ref=e29]: 
        - listitem [ref=e30]:
          - link "Video" [ref=e31] [cursor=pointer]:
            - /url: SwitchTo.html
          - generic [ref=e32]: 
        - listitem [ref=e33]:
          - link "WYSIWYG" [ref=e34] [cursor=pointer]:
            - /url: WYSIWYG.html
          - generic [ref=e35]: 
        - listitem [ref=e36]:
          - link "More" [ref=e37] [cursor=pointer]:
            - /url: "#"
          - generic [ref=e38]: 
        - listitem [ref=e39]:
          - link "Practice Site" [ref=e40] [cursor=pointer]:
            - /url: http://practice.automationtesting.in/
    - insertion [ref=e42]:
      - generic [ref=e45]:
        - heading "These are topics related to the article that might interest you" [level=2] [ref=e47]: Discover more
        - link "Content Management" [ref=e48] [cursor=pointer]:
          - generic "Content Management" [ref=e49]
          - img [ref=e51]
        - link "Data Management" [ref=e53] [cursor=pointer]:
          - generic "Data Management" [ref=e54]
          - img [ref=e56]
        - link "Computer Drives & Storage" [ref=e58] [cursor=pointer]:
          - generic "Computer Drives & Storage" [ref=e59]
          - img [ref=e61]
  - generic [ref=e63]:
    - generic [ref=e66]:
      - heading "File Download Demo for Automation" [level=2] [ref=e67]
      - link "Download" [ref=e69] [cursor=pointer]:
        - /url: https://github.com//sakinala/AutomationTesting/raw/master/samplefile.pdf
      - generic [ref=e70]:
        - generic [ref=e71]:
          - text: Generated Text File to Download
          - link "Factory Automation" [ref=e72] [cursor=pointer]:
            - img [ref=e74]
            - text: Factory Automation
        - generic [ref=e76]:
          - paragraph [ref=e77]: By default Download link will be hidden.
          - generic:
            - insertion:
              - iframe [ref=e79]:
                
          - paragraph [ref=e80]:
            - text: You need to enter
            - link "data" [ref=e81] [cursor=pointer]:
              - /url: "#"
              - img [ref=e82]
              - text: data
            - text: in the textarea and click on 'Generate File' button to activate download link.
          - paragraph [ref=e84]:
            - link "Data" [ref=e85] [cursor=pointer]:
              - /url: "#"
              - img [ref=e86]
              - text: Data
            - text: entered in the below textarea will be download with file name 'info.txt'.
          - generic [ref=e88]:
            - generic [ref=e89]: "Enter Data:"
            - textbox [ref=e90]
            - generic [ref=e91]: 1000 characters remaining
          - button "Generate File" [disabled] [ref=e92]
          - insertion [ref=e94]:
            - generic [ref=e97]:
              - heading "These are topics related to the article that might interest you" [level=2] [ref=e99]: Discover more
              - link "Word Games" [ref=e100] [cursor=pointer]:
                - generic "Word Games" [ref=e101]
                - img [ref=e103]
              - link "Dictionaries & Encyclopedias" [ref=e105] [cursor=pointer]:
                - generic "Dictionaries & Encyclopedias" [ref=e106]
                - img [ref=e108]
              - link "Business & Productivity Software" [ref=e110] [cursor=pointer]:
                - generic "Business & Productivity Software" [ref=e111]
                - img [ref=e113]
      - generic [ref=e115]:
        - generic [ref=e116]:
          - text: Generated PDF File to Download
          - link "Computer Drives & Storage" [ref=e117] [cursor=pointer]:
            - img [ref=e119]
            - text: Computer Drives & Storage
        - generic [ref=e121]:
          - paragraph [ref=e122]: By default Download link will be hidden.
          - paragraph [ref=e123]: You need to enter data in the textarea and click on 'Generate File' button to activate download link.
          - paragraph [ref=e124]: Data entered in the below textarea will be download with file name 'info.pdf'.
          - generic [ref=e125]:
            - generic [ref=e126]: "Enter Data:"
            - textbox [ref=e127]
            - generic:
              - insertion:
                - iframe [ref=e129]:
                  
            - generic [ref=e130]: 1000 characters remaining
          - generic:
            - insertion:
              - iframe [ref=e132]:
                
          - button "Generate File" [disabled] [ref=e133]
    - generic [ref=e135]:
      - insertion [ref=e138]:
        - generic [ref=e141]:
          - heading "These are topics related to the article that might interest you" [level=2] [ref=e143]: Discover more
          - link "Factory Automation" [ref=e144] [cursor=pointer]:
            - generic "Factory Automation" [ref=e145]
            - img [ref=e147]
          - link "data" [ref=e149] [cursor=pointer]:
            - generic "data" [ref=e150]
            - img [ref=e152]
          - link "Data" [ref=e154] [cursor=pointer]:
            - generic "Data" [ref=e155]
            - img [ref=e157]
      - insertion [ref=e161]:
        - generic [ref=e164]:
          - heading "These are topics related to the article that might interest you" [level=2] [ref=e166]: Discover more
          - link "Programming" [ref=e167] [cursor=pointer]:
            - generic "Programming" [ref=e168]
            - img [ref=e170]
          - link "Reference" [ref=e172] [cursor=pointer]:
            - generic "Reference" [ref=e173]
            - img [ref=e175]
          - link "Computers & Electronics" [ref=e177] [cursor=pointer]:
            - generic "Computers & Electronics" [ref=e178]
            - img [ref=e180]
      - insertion [ref=e184]:
        - generic [ref=e187]:
          - heading "These are topics related to the article that might interest you" [level=2] [ref=e189]: Discover more
          - link "Software" [ref=e190] [cursor=pointer]:
            - generic "Software" [ref=e191]
            - img [ref=e193]
          - link "Computer Science" [ref=e195] [cursor=pointer]:
            - generic "Computer Science" [ref=e196]
            - img [ref=e198]
          - link "Development Tools" [ref=e200] [cursor=pointer]:
            - generic "Development Tools" [ref=e201]
            - img [ref=e203]
    - generic [ref=e207]:
      - generic [ref=e208]:
        - text: "\"@ 2016\""
        - link "Automation Testing" [ref=e209] [cursor=pointer]:
          - /url: "#"
        - text: "\"All Rights Reserved.\""
      - generic [ref=e210]:
        - link "" [ref=e211] [cursor=pointer]:
          - /url: https://www.facebook.com/automationtesting2016/
          - generic [ref=e212]: 
        - link "" [ref=e213] [cursor=pointer]:
          - /url: https://twitter.com/krishnasakinala
          - generic [ref=e214]: 
        - link "" [ref=e215] [cursor=pointer]:
          - /url: https://www.linkedin.com/nhome/?trk=hb_signin
          - generic [ref=e216]: 
        - link "" [ref=e217] [cursor=pointer]:
          - /url: https://plus.google.com/105286300926085335367
          - generic [ref=e218]: 
        - link "" [ref=e219] [cursor=pointer]:
          - /url: https://www.youtube.com/channel/UCmQRa3pWM9zsB474URz8ESg
          - generic [ref=e220]: 
```

# Test source

```ts
  1  | const {test, expect}= require('@playwright/test')
  2  | //npx playwright test tests/Download.spec.js --project chromium --headed
  3  | test ('Download file', async ({page})=>{
  4  | 
  5  |    await page.goto('https://demo.automationtesting.in/FileDownload.html');
> 6  |    const downloadPromise = page.waitForEvent('download');
     |                                 ^ Error: page.waitForEvent: Test ended.
  7  | 
  8  | // 2. Perform the action that triggers the download
  9  | await page.getByText('Download').click();
  10 | 
  11 | // 3. Await the download process
  12 | const download = await downloadPromise;
  13 | 
  14 | // 4. Save the file to your desired destination
  15 | await download.saveAs('E:\\Play Wright\\playWrighttest\\tests\\downloads\\' + download.suggestedFilename());
  16 | });
  17 | 
```