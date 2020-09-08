package com.clarion.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethod;
import utils.LogResults;

import java.util.concurrent.TimeUnit;

public class SearchPromisePage extends PageObject {
    CommonMethod commonMethod= new CommonMethod();
    LogResults logResults = new LogResults();

    @FindBy(name = "cboEmp")
    private WebElement logPromise_promiseDropdown;

    @FindBy(xpath = "//font[contains(text(),'Promise added successfully')]")
    private WebElement promise_SuccessfullAdditionMessage;

    @FindBy(xpath = "//font[contains(text(),'Promise already exists')]")
    private WebElement promise_promiseAlreadyExistMessage;


    @FindBy(name = "btnSearch")
    private WebElement promiseSearch_searchButton;

    @FindBy(name = "btnReset")
    private WebElement promiseSearch_resetButton;
    @FindBy(name = "btnShowAll")
    private WebElement promiseSearch_ShowAllButton;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    private WebElement promiseSearch_NextButton;


    public void is_SearchPromisePageDisplayed()
    {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        commonMethod.checkElementDisplayed(logPromise_promiseDropdown);
        commonMethod.checkElementDisplayed(promise_promiseAlreadyExistMessage);
        commonMethod.checkElementDisplayed(promiseSearch_searchButton);
        commonMethod.checkElementDisplayed(promiseSearch_resetButton);
        commonMethod.checkElementDisplayed(promiseSearch_ShowAllButton);
        logResults.info("Search Promise Page is displayed");
    }


    public void clickOnSearchButton() {
        commonMethod.click(promiseSearch_searchButton);
    }

    public void verify_IfPromiseEntryAdded() {
        commonMethod.clickElementUntilEnabled(promiseSearch_NextButton);
    }
}
