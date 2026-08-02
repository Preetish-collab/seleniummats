# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Parameterisationwithcsv.spec.js >> Login test for invalid.taylor1234@example.com and undefined
- Location: tests\Parameterisationwithcsv.spec.js:17:5

# Error details

```
Error: locator.fill: value: expected string, got undefined
```

# Page snapshot

```yaml
- generic [ref=e2]:
  - generic [ref=e3]:
    - generic [ref=e4]:
      - link "Tricentis Demo Web Shop" [ref=e6] [cursor=pointer]:
        - /url: /
        - img "Tricentis Demo Web Shop" [ref=e7]
      - list [ref=e10]:
        - listitem [ref=e11]:
          - link "Register" [ref=e12] [cursor=pointer]:
            - /url: /register
        - listitem [ref=e13]:
          - link "Log in" [ref=e14] [cursor=pointer]:
            - /url: /login
        - listitem [ref=e15]:
          - link "Shopping cart (0)" [ref=e16] [cursor=pointer]:
            - /url: /cart
            - generic [ref=e17]: Shopping cart
            - generic [ref=e18]: (0)
        - listitem [ref=e19]:
          - link "Wishlist (0)" [ref=e20] [cursor=pointer]:
            - /url: /wishlist
            - generic [ref=e21]: Wishlist
            - generic [ref=e22]: (0)
      - generic [ref=e24]:
        - status [ref=e25]
        - textbox [ref=e26]: Search store
        - button "Search" [ref=e27] [cursor=pointer]
    - list [ref=e29]:
      - listitem [ref=e30]:
        - link "Books" [ref=e31] [cursor=pointer]:
          - /url: /books
      - listitem [ref=e32]:
        - link "Computers" [ref=e33] [cursor=pointer]:
          - /url: /computers
      - listitem [ref=e34]:
        - link "Electronics" [ref=e35] [cursor=pointer]:
          - /url: /electronics
      - listitem [ref=e36]:
        - link "Apparel & Shoes" [ref=e37] [cursor=pointer]:
          - /url: /apparel-shoes
      - listitem [ref=e38]:
        - link "Digital downloads" [ref=e39] [cursor=pointer]:
          - /url: /digital-downloads
      - listitem [ref=e40]:
        - link "Jewelry" [ref=e41] [cursor=pointer]:
          - /url: /jewelry
      - listitem [ref=e43]:
        - link "Gift Cards" [ref=e44] [cursor=pointer]:
          - /url: /gift-cards
    - generic:
      - generic [ref=e45]:
        - generic [ref=e46]:
          - strong [ref=e48]: Categories
          - list [ref=e50]:
            - listitem [ref=e51]:
              - link "Books" [ref=e52] [cursor=pointer]:
                - /url: /books
            - listitem [ref=e53]:
              - link "Computers" [ref=e54] [cursor=pointer]:
                - /url: /computers
            - listitem [ref=e55]:
              - link "Electronics" [ref=e56] [cursor=pointer]:
                - /url: /electronics
            - listitem [ref=e57]:
              - link "Apparel & Shoes" [ref=e58] [cursor=pointer]:
                - /url: /apparel-shoes
            - listitem [ref=e59]:
              - link "Digital downloads" [ref=e60] [cursor=pointer]:
                - /url: /digital-downloads
            - listitem [ref=e61]:
              - link "Jewelry" [ref=e62] [cursor=pointer]:
                - /url: /jewelry
            - listitem [ref=e63]:
              - link "Gift Cards" [ref=e64] [cursor=pointer]:
                - /url: /gift-cards
        - generic [ref=e65]:
          - strong [ref=e67]: Manufacturers
          - list [ref=e69]:
            - listitem [ref=e70]:
              - link "Tricentis" [ref=e71] [cursor=pointer]:
                - /url: /tricentis
        - generic [ref=e72]:
          - strong [ref=e74]: Newsletter
          - generic [ref=e76]:
            - text: "Sign up for our newsletter:"
            - textbox [ref=e78]
            - button "Subscribe" [ref=e80] [cursor=pointer]
      - generic [ref=e82]:
        - heading "Welcome, Please Sign In!" [level=1] [ref=e84]
        - generic [ref=e85]:
          - generic [ref=e86]:
            - generic [ref=e87]:
              - strong [ref=e89]: New Customer
              - generic [ref=e90]: By creating an account on our website you will be able to shop faster, be up to date on an orders status, and keep track of the orders you have previously made.
              - button "Register" [ref=e92] [cursor=pointer]
            - generic [ref=e93]:
              - strong [ref=e95]: Returning Customer
              - generic [ref=e97]:
                - generic [ref=e98]:
                  - generic [ref=e99]: "Email:"
                  - textbox "Email:" [active] [ref=e100]: invalid.taylor1234@example.com
                - generic [ref=e101]:
                  - generic [ref=e102]: "Password:"
                  - textbox "Password:" [ref=e103]
                - generic [ref=e104]:
                  - checkbox "Remember me?" [ref=e105]
                  - generic [ref=e106]: Remember me?
                  - link "Forgot password?" [ref=e108] [cursor=pointer]:
                    - /url: /passwordrecovery
                - button "Log in" [ref=e110] [cursor=pointer]
          - generic [ref=e111]:
            - heading "About login / registration" [level=2] [ref=e113]
            - paragraph [ref=e115]: Put your login / registration information here. You can edit this in the admin site.
  - generic [ref=e116]:
    - generic [ref=e117]:
      - generic [ref=e118]:
        - heading "Information" [level=3] [ref=e119]
        - list [ref=e120]:
          - listitem [ref=e121]:
            - link "Sitemap" [ref=e122] [cursor=pointer]:
              - /url: /sitemap
          - listitem [ref=e123]:
            - link "Shipping & Returns" [ref=e124] [cursor=pointer]:
              - /url: /shipping-returns
          - listitem [ref=e125]:
            - link "Privacy Notice" [ref=e126] [cursor=pointer]:
              - /url: /privacy-policy
          - listitem [ref=e127]:
            - link "Conditions of Use" [ref=e128] [cursor=pointer]:
              - /url: /conditions-of-use
          - listitem [ref=e129]:
            - link "About us" [ref=e130] [cursor=pointer]:
              - /url: /about-us
          - listitem [ref=e131]:
            - link "Contact us" [ref=e132] [cursor=pointer]:
              - /url: /contactus
      - generic [ref=e133]:
        - heading "Customer service" [level=3] [ref=e134]
        - list [ref=e135]:
          - listitem [ref=e136]:
            - link "Search" [ref=e137] [cursor=pointer]:
              - /url: /search
          - listitem [ref=e138]:
            - link "News" [ref=e139] [cursor=pointer]:
              - /url: /news
          - listitem [ref=e140]:
            - link "Blog" [ref=e141] [cursor=pointer]:
              - /url: /blog
          - listitem [ref=e142]:
            - link "Recently viewed products" [ref=e143] [cursor=pointer]:
              - /url: /recentlyviewedproducts
          - listitem [ref=e144]:
            - link "Compare products list" [ref=e145] [cursor=pointer]:
              - /url: /compareproducts
          - listitem [ref=e146]:
            - link "New products" [ref=e147] [cursor=pointer]:
              - /url: /newproducts
      - generic [ref=e148]:
        - heading "My account" [level=3] [ref=e149]
        - list [ref=e150]:
          - listitem [ref=e151]:
            - link "My account" [ref=e152] [cursor=pointer]:
              - /url: /customer/info
          - listitem [ref=e153]:
            - link "Orders" [ref=e154] [cursor=pointer]:
              - /url: /customer/orders
          - listitem [ref=e155]:
            - link "Addresses" [ref=e156] [cursor=pointer]:
              - /url: /customer/addresses
          - listitem [ref=e157]:
            - link "Shopping cart" [ref=e158] [cursor=pointer]:
              - /url: /cart
          - listitem [ref=e159]:
            - link "Wishlist" [ref=e160] [cursor=pointer]:
              - /url: /wishlist
      - generic [ref=e161]:
        - heading "Follow us" [level=3] [ref=e162]
        - list [ref=e163]:
          - listitem [ref=e164]:
            - link "Facebook" [ref=e165] [cursor=pointer]:
              - /url: http://www.facebook.com/nopCommerce
          - listitem [ref=e166]:
            - link "Twitter" [ref=e167] [cursor=pointer]:
              - /url: https://twitter.com/nopCommerce
          - listitem [ref=e168]:
            - link "RSS" [ref=e169] [cursor=pointer]:
              - /url: /news/rss/1
          - listitem [ref=e170]:
            - link "YouTube" [ref=e171] [cursor=pointer]:
              - /url: http://www.youtube.com/user/nopCommerce
          - listitem [ref=e172]:
            - link "Google+" [ref=e173] [cursor=pointer]:
              - /url: https://plus.google.com/+nopcommerce
    - generic [ref=e174]:
      - text: Powered by
      - link "nopCommerce" [ref=e175] [cursor=pointer]:
        - /url: http://www.nopcommerce.com/
    - generic [ref=e176]: Copyright © 2026 Tricentis Demo Web Shop. All rights reserved.
```

# Test source

```ts
  1  | const { test, expect } = require('@playwright/test');
  2  | const fs = require('fs');
  3  | const {parse}  = require('csv-parse/sync');
  4  | // npx playwright test tests/Parameterisationwithcsv.spec.js --project chromium --headed
  5  | //  reading testdata from csv
  6  | const csvPath="./tests/testdata/data.csv";
  7  | const fileContent=fs.readFileSync(csvPath,'utf-8');
  8  | const records=parse(fileContent,
  9  |                    {
  10 |                      columns:true,
  11 |                      skip_empty_lines:true,
  12 |                      relax_quotes:true
  13 |                     }
  14 |                     )
  15 | 
  16 |     for (const data of records) {
  17 |     test(`Login test for ${data.email} and ${data.password}`, async ({ page }) => {
  18 |         await page.goto('https://demowebshop.tricentis.com/login');
  19 |         // Fill login form
  20 |         await page.locator('#Email').fill(data.email);
> 21 |         await page.locator('#Password').fill(data.password);
     |                                         ^ Error: locator.fill: value: expected string, got undefined
  22 |         await page.locator("input[value='Log in']").click();
  23 | 
  24 |         if (data.validity.toLowerCase() === 'valid') {
  25 |             const logoutLink = page.locator('a[href="/logout"]');
  26 |             await expect(logoutLink).toBeVisible({ timeout: 5000 });
  27 |         } 
  28 |         else {
  29 |             const errorMessage = page.locator('.validation-summary-errors');
  30 |             await expect(errorMessage).toBeVisible({ timeout: 5000 });
  31 |         }
  32 |     });
  33 | }
  34 |     
```