$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/testcases.feature");
formatter.feature({
  "name": "Promises Log Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PromiseLog"
    }
  ]
});
formatter.scenarioOutline({
  "name": "1) Verify Error message after navigating to application url and clicking on submit button without filling username and password field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@1"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user provides username as \"\u003cuserName\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see the login validation error message as \"\u003cloginValidationErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "loginValidationErrorMessage"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Invalid Username/password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "1) Verify Error message after navigating to application url and clicking on submit button without filling username and password field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PromiseLog"
    },
    {
      "name": "@1"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.userNavigatesToTheLoginPageOfTheClarionPortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides username as \"\" and password as \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userProvidesUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.clickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the login validation error message as \"Invalid Username/password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.userShouldSeeTheLoginValidationErrorMessageAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "2) Verify user is logged into the application successfully after providing correct username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user provides username as \"\u003cuserName\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "sanjeetk@clariontechnologies.co.in",
        "clarion"
      ]
    }
  ]
});
formatter.scenario({
  "name": "2) Verify user is logged into the application successfully after providing correct username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PromiseLog"
    },
    {
      "name": "@2"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.userNavigatesToTheLoginPageOfTheClarionPortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides username as \"sanjeetk@clariontechnologies.co.in\" and password as \"clarion\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userProvidesUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.clickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.userShouldBeNavigatedToHomePageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "3) Add Promise and verify whether it has been added succesfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@3\u00264"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user provides username as \"\u003cuserName\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on LogPromise Link",
  "keyword": "When "
});
formatter.step({
  "name": "user should land on LogPromise home page",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects \"\u003cpromisefromDropdownValue\u003e\" from promisefrom dropdown value",
  "keyword": "When "
});
formatter.step({
  "name": "user enters promise message as \"\u003cpromiseMessage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on LogPromise button",
  "keyword": "And "
});
formatter.step({
  "name": "user should land on search PromisePage",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects \"\u003cpromisefromDropdownValue\u003e\" from promisefrom dropdown value",
  "keyword": "When "
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see entry with the date of creation",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "promisefromDropdownValue",
        "promiseMessage"
      ]
    },
    {
      "cells": [
        "sanjeetk@clariontechnologies.co.in",
        "clarion",
        "Sonali test",
        "Enter Promise"
      ]
    }
  ]
});
formatter.scenario({
  "name": "3) Add Promise and verify whether it has been added succesfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PromiseLog"
    },
    {
      "name": "@3\u00264"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.userNavigatesToTheLoginPageOfTheClarionPortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides username as \"sanjeetk@clariontechnologies.co.in\" and password as \"clarion\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userProvidesUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.clickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.userShouldBeNavigatedToHomePageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on LogPromise Link",
  "keyword": "When "
});
formatter.match({
  "location": "LogPromiseStepDef.userClicksOnLogPromiseLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on LogPromise home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogPromiseStepDef.userShouldLandOnLogPromiseHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Sonali test\" from promisefrom dropdown value",
  "keyword": "When "
});
formatter.match({
  "location": "LogPromiseStepDef.userSelectsFromPromisefromDropdownValue(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters promise message as \"Enter Promise\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogPromiseStepDef.userEntersPromiseMessageAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on LogPromise button",
  "keyword": "And "
});
formatter.match({
  "location": "LogPromiseStepDef.userClicksOnLogPromiseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on search PromisePage",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPromiseStepDef.userShouldLandOnSearchPromisePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Sonali test\" from promisefrom dropdown value",
  "keyword": "When "
});
formatter.match({
  "location": "LogPromiseStepDef.userSelectsFromPromisefromDropdownValue(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchPromiseStepDef.userClickOnSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see entry with the date of creation",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPromiseStepDef.userShouldSeeEntryWithTheDateOfCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "4) Verify user is able to log out from the application successfully after clicking on logout button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@5"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user provides username as \"\u003cuserName\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "When "
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "sanjeetk@clariontechnologies.co.in",
        "clarion"
      ]
    }
  ]
});
formatter.scenario({
  "name": "4) Verify user is able to log out from the application successfully after clicking on logout button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PromiseLog"
    },
    {
      "name": "@5"
    }
  ]
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.userNavigatesToTheLoginPageOfTheClarionPortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides username as \"sanjeetk@clariontechnologies.co.in\" and password as \"clarion\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userProvidesUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.clickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to home page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.userShouldBeNavigatedToHomePageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.userClickOnLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the login page of the clarion portal",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.userNavigatesToTheLoginPageOfTheClarionPortal()"
});
formatter.result({
  "status": "passed"
});
});