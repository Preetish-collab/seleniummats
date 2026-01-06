Feature: Test Orange HRM Login Functionality

#  Background: I am on the Orange HRM login page
#     When     I enter valid "<username>" and "<password>"
#     And      I click on the login button
 @Smoke
  Scenario Outline: Successful login with valid credentials
    Given  I am on the Orange HRM login page
    When   I enter valid "<username>" and "<password>"
    And    I click on the login button
    Then   I should be redirected to the dashboard page

    Examples:
      | username | password |
      | Admin    | admin123 |



@Regression
  Scenario Outline: Unsuccessful login with invalid credentials
    Given  I am on the Orange HRM login page
    When   I enter valid "<username>" and "<password>"
    And    I click on the login button
    Then   I should not be redirected to the dashboard page

    Examples:
      | username | password |
      | Admin1   | admin456 |