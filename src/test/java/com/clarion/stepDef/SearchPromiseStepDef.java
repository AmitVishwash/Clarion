package com.clarion.stepDef;

import com.clarion.pages.SearchPromisePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchPromiseStepDef {
    SearchPromisePage searchPromisePage= new SearchPromisePage();

    @Then("^user should land on search PromisePage$")
    public void userShouldLandOnSearchPromisePage() {
        searchPromisePage.is_SearchPromisePageDisplayed();
    }

    @And("^user click on search button$")
    public void userClickOnSearchButton() {
        searchPromisePage.clickOnSearchButton();
    }

    @Then("^user should see entry with the date of creation$")
    public void userShouldSeeEntryWithTheDateOfCreation() {
        searchPromisePage.verify_IfPromiseEntryAdded();

    }
}
