@PromiseLog
Feature: Promises Log Functionality
@1
 Scenario Outline:1) Verify Error message after navigating to application url and clicking on submit button without filling username and password field
    Given user navigates to the login page of the clarion portal
    When user provides username as "<userName>" and password as "<password>"
    And click on submit button
    Then user should see the login validation error message as "<loginValidationErrorMessage>"

   Examples:
   |userName|password|loginValidationErrorMessage|
   |        |        |Invalid Username/password  |

   @2
   Scenario Outline: 2) Verify user is logged into the application successfully after providing correct username and password
     Given user navigates to the login page of the clarion portal
     When user provides username as "<userName>" and password as "<password>"
     And click on submit button
     Then user should be navigated to home page successfully

     Examples:
       |userName                                  |password       |
       |sanjeetk@clariontechnologies.co.in        |clarion        |

     @3&4
     Scenario Outline: 3) Add Promise and verify whether it has been added succesfully
       Given user navigates to the login page of the clarion portal
       When user provides username as "<userName>" and password as "<password>"
       And click on submit button
       Then user should be navigated to home page successfully
       When user clicks on LogPromise Link
       Then user should land on LogPromise home page
       When user selects "<promisefromDropdownValue>" from promisefrom dropdown value
       And user enters promise message as "<promiseMessage>"
       And user clicks on LogPromise button
       Then user should land on search PromisePage
       When user selects "<promisefromDropdownValue>" from promisefrom dropdown value
       And user click on search button
       Then user should see entry with the date of creation

       Examples:
         |userName                                  |password       |promisefromDropdownValue|promiseMessage|
         |sanjeetk@clariontechnologies.co.in        |clarion        |Sonali test             |Enter Promise |
@5
  Scenario Outline: 4) Verify user is able to log out from the application successfully after clicking on logout button
    Given user navigates to the login page of the clarion portal
    When user provides username as "<userName>" and password as "<password>"
    And click on submit button
    Then user should be navigated to home page successfully
    When user click on logout button
    Then user navigates to the login page of the clarion portal

    Examples:
      |userName                                  |password       |
      |sanjeetk@clariontechnologies.co.in        |clarion        |