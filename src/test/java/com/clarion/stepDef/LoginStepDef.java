package com.clarion.stepDef;

import com.clarion.pages.HomePage;
import com.clarion.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("^user navigates to the login page of the clarion portal$")
    public void userNavigatesToTheLoginPageOfTheClarionPortal() throws IOException {
        loginPage.launchClarionPortal();

    }

    @When("^user provides username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userProvidesUsernameAsAndPasswordAs(String username, String password) throws Throwable {
    loginPage.textBox_EnterName(username);
    loginPage.textBox_EnterPassword(password);
    }

    @And("^click on submit button$")
    public void clickOnSubmitButton() {
        loginPage.click_submitButton();
    }

    @Then("^user should see the login validation error message as \"([^\"]*)\"$")
    public void userShouldSeeTheLoginValidationErrorMessageAs(String loginValidationErrorMessage) throws Throwable {
    loginPage.checkValidationMessageDisplayed(loginValidationErrorMessage);
    }

    @Then("^user should be navigated to home page successfully$")
    public void userShouldBeNavigatedToHomePageSuccessfully() throws InterruptedException {
        homePage.check_IsHomePageDisplayed();
    }

    @When("^user click on logout button$")
    public void userClickOnLogoutButton() {
        homePage.clickOnLogOutLink();
    }
}
