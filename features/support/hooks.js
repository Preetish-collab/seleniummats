const { Given, When, Then, Before, After,BeforeStep, AfterStep, Status, setDefaultTimeout, BeforeAll } = require('@cucumber/cucumber');
const { chromium } = require('playwright');
const { OrangeHrm } = require('../page/OrangeHrm');
const { beforeEach, afterEach } = require('node:test');

setDefaultTimeout(120000);

let browser;
let context;
let page;
let orangehrmPage;
Before(async function () {
  console.log("Starting test execution: Launching browser...");

  this.browser = await chromium.launch({ headless: false });
  this.context = await this.browser.newContext();
  this.page = await this.context.newPage();
  this.orangehrmPage = new OrangeHrm(this.page);

  console.log("Browser context and OrangeHRM page object initialized successfully.");
});

After(async function () {
  console.log("Cleaning up: Closing browser...");

  if (this.browser) {
    await this.browser.close();
    console.log("Browser closed successfully.");
  }
});

// BeforeStep(async function () {
//   console.log('BeforeStep hook executed');
// });
// AfterStep(async function ({result}) {
//     if (result.status === Status.FAILED) {
//         const screenshot = await this.page.screenshot({ path: `screenshots/${Date.now()}.png`, fullPage: true });
//         this.attach(screenshot, 'image/png');
//         console.log('AfterStep hook executed - Screenshot captured for failed step');
//     }
 
// });
