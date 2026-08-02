Feature: OrangeHRM Login Page validation
@Regression
Scenario Outline: Checking login for a valid scenario
  Given I launch orangehrm app url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  When  I enter a valid username "<username>"
  Given I enter a protected password "<password>"
  Given I logout from the orangehrm app
  Then  I close the browser

  Examples:
    | username | password  |
    | Admin    | admin123  |
    | Admin    | admin123 |

@Smoke
Scenario Outline: Checking login for a valid scenario
  Given I launch orangehrm app url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  When  I enter a valid username "<username>"
  Given I enter a protected password "<password>"
  Given I logout from the orangehrm app
  Then  I close the browser

  Examples:
    | username | password  |
    | Admin    | admin123  |
    | Admin    | admin123 |

# npx cucumber-js tests/features/**/*.feature
#npx cucumber-js features/OrangeHRM.feature --parallel 2 --exit
#npx cucumber-js features/OrangeHRM.feature --parallel 2 --exit --format html:cucumber-report.html
#npx cucumber-js --tags "@Regression" --retry 1 --exit --format html:cucumber-report.html
