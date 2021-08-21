Feature: Conversation
  Scenario: User login to ADDA and post conversation
    Given User is on ADDA Resident page
#    When  User click on fab icon to select conversation
   When  User enter title and description
    | title | description |
    | TestPost204 | Testdescription204 |
    | TestPost514 | Testdescription514|
    Then  close the Browser