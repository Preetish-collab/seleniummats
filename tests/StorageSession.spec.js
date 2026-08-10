const {test, expect}=require('@playwright/test')
// test is used to define a test case.
// expect is used for assertions.
//npx playwright codegen --save-storage=auth.json //store auth.json file in your project
//npx playwright --load-storage=auth.json demoblaze.com //skip login from CLI
//npx playwright test tests/StorageSession.spec.js --project chromium --headed
test('demoblaze login',async({browser})=>{
    //({browser}) gives the test access to Playwright’s browser object.

    // Creates a new browser context.
    // A context is like an isolated browser session with its own cookies, storage, and session data.
    const context=await browser.newContext({
        // Loads saved browser session data from the file auth.json.
        // This helps the test reuse login information without logging in again.
        storageState: "./auth.json"
    })
    const page=await context.newPage();
    //Opens a new tab/page inside that browser context.
    await page.goto("https://demoblaze.com");
    await page.waitForTimeout(5000);
})