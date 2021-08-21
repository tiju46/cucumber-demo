Feature: User Account Creation
  Scenario: New user Creating Account
    Given user is on sign in page
    When user enters email address
    |pttiju@gmail.com|
    Then user clicks on Create an Account button
#    Then user selects Title
#    Then user enters form details First name Last name Email Password
#    |tom|thomas|pttiju@gmail.com|abcd123|