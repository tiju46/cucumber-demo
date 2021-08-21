$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/addauser/IdeaProjects/cucumberdemo/src/main/java/Feature/createpost.feature");
formatter.feature({
  "line": 1,
  "name": "Conversation",
  "description": "",
  "id": "conversation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User login to ADDA and post conversation",
  "description": "",
  "id": "conversation;user-login-to-adda-and-post-conversation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on ADDA Resident page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#    When  User click on fab icon to select conversation"
    }
  ],
  "line": 5,
  "name": "User enter title and description",
  "rows": [
    {
      "cells": [
        "title",
        "description"
      ],
      "line": 6
    },
    {
      "cells": [
        "TestPost204",
        "Testdescription204"
      ],
      "line": 7
    },
    {
      "cells": [
        "TestPost514",
        "Testdescription514"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "conversationpost.User_is_on_ADDA_Resident_page()"
});
formatter.result({
  "duration": 23356952213,
  "status": "passed"
});
formatter.match({
  "location": "conversationpost.user_enter_title_and_description(DataTable)"
});
formatter.result({
  "duration": 27845166891,
  "status": "passed"
});
formatter.match({
  "location": "conversationpost.close_the_Browser()"
});
formatter.result({
  "duration": 282901220,
  "status": "passed"
});
});