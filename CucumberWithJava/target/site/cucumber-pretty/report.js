$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "  In order to do internet banking\n  As a valid Para Bank customer\n  I want to login successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am in the login page of Para Bank application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter valid \u003cusername\u003e and \u003cpassword\u003e with \u003cuserFullName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should be taken to the Overview page",
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
        "password",
        "userFullName"
      ]
    },
    {
      "cells": [
        "\"john\"",
        "\"demo\"",
        "\"John Smith\""
      ]
    },
    {
      "cells": [
        "\"john\"",
        "\"demo\"",
        "\"John Smith\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the login page of Para Bank application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.Steps.iAmInTheLoginPageOfParaBankApplication() in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"john\" and \"demo\" with \"John Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.Steps.i_enter_valid_credentials(String,String,String) in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the Overview page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Steps.i_should_be_taken_to_the_Overview_page() in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the login page of Para Bank application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.Steps.iAmInTheLoginPageOfParaBankApplication() in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"john\" and \"demo\" with \"John Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.Steps.i_enter_valid_credentials(String,String,String) in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the Overview page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Steps.i_should_be_taken_to_the_Overview_page() in file:/C:/Users/Dusan/Gitreps/TAU/CucumberWithJava/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});