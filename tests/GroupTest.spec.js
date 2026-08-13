const{test,expect}=require('@playwright/test');
//npx playwright test tests/GroupTest.spec.js --project chromium --headed
// test.describe('includes three test',async()=>{
// test('test1',async({page})=>{
//     await page.goto('https://www.demoblaze.com/');
//     await expect(page).toHaveURL('https://www.demoblaze.com/')
//     const pagetitle=page.title();   
//     await expect(page).toHaveTitle('STORE');
//     console.log(pagetitle);
//     await page.close();
// });
// test('test2',async({page})=>{
//    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    const pagetitle= await page.title();
//    await expect(page).toHaveTitle('OrangeHRM');
//    console.log(pagetitle);
//     await page.close();
// });
// test('test3',async({page})=>{
//     await page.goto("https://playwright.dev/docs/api/class-test");
//    await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//    const pagetitle= await page.title();
//    await expect(page).toHaveTitle('Playwright Test | Playwright');
//    console.log(pagetitle);
//    await page.close();
// });
// });

// test.describe('three tagged tests', {
//   tag: '@smoke',
// }, () => {
// test('test1',async({page})=>{
//     await page.goto('https://www.demoblaze.com/');
//     await expect(page).toHaveURL('https://www.demoblaze.com/')
//     const pagetitle= await page.title();   
//     await expect(page).toHaveTitle('STORE');
//     console.log(pagetitle);
//     await page.close();
// });
// test('test2',async({page})=>{
//    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    const pagetitle= await page.title();
//    await expect(page).toHaveTitle('OrangeHRM');
//    console.log(pagetitle);
//     await page.close();
// });
// test('test3',async({page})=>{
//     await page.goto("https://playwright.dev/docs/api/class-test");
//    await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//    const pagetitle= await page.title();
//    await expect(page).toHaveTitle('Playwright Test | Playwright');
//    console.log(pagetitle);
//    await page.close();
// });
// });
// test.describe('two annotated tests', {
//   annotation: {
//     type: 'issue',
//     description: 'https://github.com/microsoft/playwright/issues/23180',
//   },
// }, () => {
//   test('one', async ({ page }) => {
//    await page.goto("https://www.demoblaze.com/");
//    console.log('issueone');
//   });

//   test('two', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//    console.log('issuetwo');
//   });
// });

// test.describe.configure({ mode: 'parallel' });
// test('runs in parallel 1', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//     console.log("parallel1");
// });
// test('runs in parallel 2', async ({ page }) => {
//      await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//      console.log("parallel2");
// });

// // Tests in this file run in order. Retries, if any, run independently.
// test.describe.configure({ mode: 'default' });
// test('runs first', async ({ page }) => {});
// test('runs second', async ({ page }) => {});

//Running serially is not recommended. It is usually better to make your tests isolated, so they can be run independently.
//  test.describe.configure({ mode: 'serial' });
// test('runs in serialorder', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//     console.log("serial1");
// });
// test('runs in parallel 2', async ({ page }) => {
//      await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//      console.log("serial2");
// });

//Each test in the file will be retried twice if mismatch and have a timeout of 20 seconds.

// test.describe('Tests with Retries', () => {
//   test.describe.configure({ retries: 2, timeout: 20000 });
  
//   test('runs first', async ({ page }) => {
//        await page.goto("https://www.demoblaze.com/");
//        await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//        console.log("first");
//   });
  
//   test('runs second', async ({ page }) => {
//       await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//       await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//         console.log("second");
//   });
// });

//Run multiple describes in parallel, but tests inside each describe in order.
// test.describe.configure({ mode: 'parallel' });

// test.describe('A, runs in parallel with B', () => {
//   test.describe.configure({ mode: 'default' });
//   test('in order A1', async ({ page }) => {});
//   test('in order A2', async ({ page }) => {});
// });

// test.describe('B, runs in parallel with A', () => {
//   test.describe.configure({ mode: 'default' });
//   test('in order B1', async ({ page }) => {});
//   test('in order B2', async ({ page }) => {});
// });

//  test.describe.fixme Declares a test group similarly to test.describe(). Tests in this group are marked as "fixme" and will not be executed.
// test.describe.fixme('broken tests that should be fixed', () => {
//   test('runs first', async ({ page }) => {
//        await page.goto("https://www.demoblaze.com/");
//        await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//        console.log("first");
//   });
  
//   test('runs second', async ({ page }) => {
//       await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//       await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//         console.log("second");
//   });
// });

//test.describe.only Declares a focused group of tests. If there are some focused tests or suites, all of them will be run but nothing else.
// test.describe.only('focused group', () => {
//   test('in the focused group', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//        await expect (page).toHaveURL("https://www.demoblaze.com/");
//        console.log("focused group");
//   });
// });
// test('not in the focused group', async ({ page }) => {
//   await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//       await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//         console.log("not in focused group");
// });

//test.describe.skip Declares a skipped test group, similarly to test.describe(). Tests in the skipped group are never run.
// test.describe.skip('skipped group', () => {
//    test('test1 in the skipped group', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//        await expect (page).toHaveURL("https://www.demoblaze.com/");
//        console.log("test1 skipped group");
//   });
//   test('test2 in the skipped group', async ({ page }) => {
//        await page.goto("https://playwright.dev/docs/api/class-test");
//        await expect (page).toHaveURL("https://playwright.dev/docs/api/class-test");
//       console.log("test2 skipped group");
//   });

// });

// test('not in the skipped group', async ({ page }) => {
//   await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//       await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//         console.log("not in the skipped group");
// });

// //you can use test.fail.only to focus on a specific test that is expected to fail. This is particularly useful when debugging a failing test or working on a specific issue.
// test.fail.only('focused failing test', async ({ page }) => {
//   await page.goto("https://www.demoblaze.com/");
//        await expect (page).toHaveURL("https://www.demoblaze.com/");
//        console.log("failing this test");
// });
// test('not in the focused group', async ({ page }) => {
//    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//       await expect (page).toHaveURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
// });

//Returns information about the currently running test. This method can only be called during the test execution, otherwise it throws.
// test('testinfo', async ({ page }) => {
//     await page.goto("https://www.demoblaze.com/");
//     await expect (page).toHaveURL("https://www.demoblaze.com/");
//     await test.info().attach('screenshot', {
//     body: await page.screenshot(),
//     contentType: 'image/png',
    
//   });
//});


