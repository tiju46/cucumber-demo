Feature: OrangeHrm Login Page

Scenario Outline: Check user able to login

Given user is on OrangeHrm Login Page
When page title is OrangeHrm
Then user enters "<username>" and "<password>"
Then user clicks on login button
  Examples:
    |username|password|
    |admin   |admin123|