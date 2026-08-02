# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: SingleDimensionalArray.spec.js >> search testlogin test laptop
- Location: tests\SingleDimensionalArray.spec.js:7:1

# Error details

```
Error: expect(locator).toContainText(expected) failed

Locator: locator('h2 a').first()
Expected substring: "laptop"
Received string:    "$25 Virtual Gift Card"
Timeout: 5000ms

Call log:
  - Expect "soft toContainText" with timeout 5000ms
  - waiting for locator('h2 a').first()
    13 × locator resolved to <a href="/25-virtual-gift-card">$25 Virtual Gift Card</a>
       - unexpected value "$25 Virtual Gift Card"

```

```yaml
- link "$25 Virtual Gift Card":
  - /url: /25-virtual-gift-card
```

# Test source

```ts
  1  | const{test,expect}=require('@playwright/test');
  2  | //npx playwright test tests/SingleDimensionalArray.spec.js --project chromium --headed
  3  | //testdata
  4  | const searchItems = ['laptop','Gift card','martphone'];
  5  | for(const item of searchItems)
  6  | {
  7  | test(`search testlogin test ${item}`,async({page})=>{
  8  | await page.goto('https://demowebshop.tricentis.com/');
  9  | await page.locator('#small-searchterms').fill(item);
  10 | await page.locator("input[value='Search store']").click();
> 11 | await expect.soft(page.locator('h2 a').nth(0)).toContainText(item, {ignoreCase:true});
     |                                                ^ Error: expect(locator).toContainText(expected) failed
  12 | });
  13 | }
```