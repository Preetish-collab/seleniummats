// Generated from: tests\features\OrangeHRM.feature
import { test } from "playwright-bdd";

test.describe('OrangeHRM Login Page validation', () => {

  test('Checking login for a valid scenario', async ({ Given, When, Then }) => { 
    await Given('I launch orangehrm app url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"'); 
    await When('I enter a valid username "Admin"'); 
    await Given('I enter a protected password "admin123"'); 
    await Given('I logout from the orangehrm app'); 
    await Then('I close the browser'); 
  });

});

// == technical section ==

test.beforeEach('BeforeEach Hooks', ({ $runScenarioHooks, page }) => $runScenarioHooks('before', { page }));

test.use({
  $test: [({}, use) => use(test), { scope: 'test', box: true }],
  $uri: [({}, use) => use('tests\\features\\OrangeHRM.feature'), { scope: 'test', box: true }],
  $bddFileData: [({}, use) => use(bddFileData), { scope: "test", box: true }],
});

const bddFileData = [ // bdd-data-start
  {"pwTestLine":6,"pickleLine":2,"tags":[],"steps":[{"pwStepLine":7,"gherkinStepLine":3,"keywordType":"Context","textWithKeyword":"Given I launch orangehrm app url \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"","stepMatchArguments":[{"group":{"start":27,"value":"\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"","children":[{"start":28,"value":"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","children":[{}]},{"children":[{}]}]},"parameterTypeName":"string"}]},{"pwStepLine":8,"gherkinStepLine":4,"keywordType":"Action","textWithKeyword":"When I enter a valid username \"Admin\"","stepMatchArguments":[{"group":{"start":25,"value":"\"Admin\"","children":[{"start":26,"value":"Admin","children":[{}]},{"children":[{}]}]},"parameterTypeName":"string"}]},{"pwStepLine":9,"gherkinStepLine":5,"keywordType":"Context","textWithKeyword":"Given I enter a protected password \"admin123\"","stepMatchArguments":[{"group":{"start":29,"value":"\"admin123\"","children":[{"start":30,"value":"admin123","children":[{}]},{"children":[{}]}]},"parameterTypeName":"string"}]},{"pwStepLine":10,"gherkinStepLine":6,"keywordType":"Context","textWithKeyword":"Given I logout from the orangehrm app","stepMatchArguments":[]},{"pwStepLine":11,"gherkinStepLine":7,"keywordType":"Outcome","textWithKeyword":"Then I close the browser","stepMatchArguments":[]}]},
]; // bdd-data-end