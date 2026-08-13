import{test,expect} from '@playwright/test'
//npx playwright test tests/Tags2.spec.js --project chromium --headed --grep "@smoke"
//npx playwright test tests/Tags2.spec.js --project chromium --headed --grep "@regression"
//npx playwright test tests/Tags2.spec.js --project chromium --headed --grep "@smoke|@regression"
//npx playwright test tests/Tags2.spec.js --project chromium --headed --grep "(?=.*@regression)(?=.*@smoke)"

test('Tagtest1',{tag:'@smoke',},async({page})=>{
    await page.goto("https://www.demoblaze.com/");
   await expect (page).toHaveURL("https://www.demoblaze.com/");
   const pagetitle= await page.title();
   await expect(page).toHaveTitle('STORE');
   console.log(pagetitle);
})
test('Tagtest2',{tag:'@regression',},async({page})=>{
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   const pagetitle= await page.title();
   await expect(page).toHaveTitle('OrangeHRM');
   console.log(pagetitle);
})
test('Tagtest3',{tag:['@regression','@smoke']},async({page})=>{
    await page.goto("https://playwright.dev/docs/api/class-test");
   await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
   const pagetitle= await page.title();
   await expect(page).toHaveTitle('Playwright Test | Playwright');
   console.log(pagetitle);
})