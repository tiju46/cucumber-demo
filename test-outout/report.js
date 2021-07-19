$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/addauser/IdeaProjects/cucumberdemo/src/main/java/Feature/loginPage.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login Page",
  "description": "",
  "id": "orangehrm-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check user able to login",
  "description": "",
  "id": "orangehrm-login-page;check-user-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on OrangeHrm Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "page title is OrangeHrm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "orangehrm-login-page;check-user-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "orangehrm-login-page;check-user-able-to-login;;1"
    },
    {
      "cells": [
        "admin",
        "admin123"
      ],
      "line": 11,
      "id": "orangehrm-login-page;check-user-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Check user able to login",
  "description": "",
  "id": "orangehrm-login-page;check-user-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on OrangeHrm Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "page title is OrangeHrm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdef.user_is_on_OrangeHrm_Login_Page()"
});
formatter.result({
  "duration": 26092351755,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.page_title_is_OrangeHrm()"
});
formatter.result({
  "duration": 33381449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 25
    }
  ],
  "location": "loginstepdef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 320354103,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1012229024,
  "status": "passed"
});
});