const { Given, When, Then } = require('@cucumber/cucumber');

Given('I launch orangehrm app url {string}', async function (url) {
  await this.orangehrmPage.launchURL(url);
});

When('I enter a valid username {string}', async function (username) {
  await this.orangehrmPage.enterUsername(username);
});

Given('I enter a protected password {string}', async function (password) {
  await this.orangehrmPage.enterPassword(password);
  await this.orangehrmPage.clickloginButton();
});

Given('I logout from the orangehrm app', async function () {
  await this.orangehrmPage.clicklogoutdropDown();
  await this.orangehrmPage.clicklogoutButton();
});

Then('I close the browser', async function () {
  if (this.browser) await this.browser.close();
});
