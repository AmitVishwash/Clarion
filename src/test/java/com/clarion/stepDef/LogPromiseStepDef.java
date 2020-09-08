package com.clarion.stepDef;

import com.clarion.pages.HomePage;
import com.clarion.pages.LogPromisePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogPromiseStepDef {
    HomePage homePage = new HomePage();
    LogPromisePage logPromisePage = new LogPromisePage();
    @When("^user clicks on LogPromise Link$")
    public void userClicksOnLogPromiseLink() {
        homePage.clickOnLogPromiseLink();
    }

    @Then("^user should land on LogPromise home page$")
    public void userShouldLandOnLogPromiseHomePage() throws InterruptedException {
        logPromisePage.check_IsLogPromisePageDisplayed();
    }

    @When("^user selects \"([^\"]*)\" from promisefrom dropdown value$")
    public void userSelectsFromPromisefromDropdownValue(String valueToBeSelected) throws Throwable {
        logPromisePage.selectValue_PromiseFromDropdown(valueToBeSelected);

    }

    @And("^user enters promise message as \"([^\"]*)\"$")
    public void userEntersPromiseMessageAs(String promiseMessage) throws Throwable {
     logPromisePage.enterPromiseMessage(promiseMessage);
    }

    @And("^user clicks on LogPromise button$")
    public void userClicksOnLogPromiseButton() {
        logPromisePage.clickOnLogPromiseButton();
    }
}
