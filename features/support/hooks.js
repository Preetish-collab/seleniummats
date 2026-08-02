// const { Given, When, Then, Before, After,BeforeStep,AfterStep,Status } = require('@cucumber/cucumber');
// const { chromium } = require('playwright');
// const { OrangeHrm } = require('../page/OrangeHrm');


// let browser;
// let context;
// let page;
// let orangehrmPage;
// Before(async function () {
//  // this.setDefaultTimeout(120000);
//   this.browser = await chromium.launch({ headless: true });
//   this.context = await this.browser.newContext();
//   this.page = await this.context.newPage();
//   this.orangehrmPage = new OrangeHrm(this.page);
// });

// After(async function () {
//   if (this.browser) {
//     await this.browser.close();
//   }
// });

// BeforeStep(async function () {
//   //set default timeout for each step
//  // this.setDefaultTimeout(12000);
// });
// AfterStep(async function ({result}) {
//     if (result.status === Status.FAILED) {
//         const screenshot = await this.page.screenshot({ path: `screenshots/${Date.now()}.png`, fullPage: true });
//         this.attach(screenshot, 'image/png');
//     }
 
// });
