Feature: Login functionality for Swag labs website

  Background:
    Given user launches the website

  Scenario Outline: To verify login functionality using valid credentials
    Given user entered "<username>" and "<password>"
    When user clicks on login button
    Then user validates the title of the page "<title>"
  Examples:
    | username      | password     | title     |
    | standard_user | secret_sauce | Swag Labs |