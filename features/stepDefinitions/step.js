const { Given, When, Then, Before, After,BeforeStep,AfterStep,Status } = require('@cucumber/cucumber');
const { chromium } = require('playwright');
const { OrangeHrm } = require('../page/OrangeHrm');

let browser;
let context;
let page;
let orangehrmPage;

Before(async function () {
  browser = await chromium.launch({ headless: false });
  context = await browser.newContext();
  page = await context.newPage();
  orangehrmPage = new OrangeHrm(page);
});

Given('I launch orangehrm app url {string}', async function (url) {
  await orangehrmPage.launchURL(url);
});

When('I enter a valid username {string}', async function (username) {
  await orangehrmPage.enterUsername(username);
});

Given('I enter a protected password {string}', async function (password) {
  await orangehrmPage.enterPassword(password);
  await orangehrmPage.clickloginButton();
});

Given('I logout from the orangehrm app', async function () {
  await orangehrmPage.clicklogoutdropDown();
  await orangehrmPage.clicklogoutButton();
});

Then('I close the browser', async function () {
  if (browser) await browser.close();
});
