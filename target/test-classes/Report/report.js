$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Verifing the Adactin login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validation of Adactin login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Enter the Valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" And Click login button",
  "keyword": "When "
});
formatter.step({
  "name": "User verify the Login page Displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "digitalindia",
        "987654321"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch the Adactin Web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition.user_Launch_the_Adactin_Web_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of Adactin login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Enter the Valid \"digitalindia\" and \"987654321\" And Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenition.user_Enter_the_Valid_and_And_Click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the Login page Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.user_verify_the_Login_page_Displayed()"
});
formatter.result({
  "status": "passed"
});
});