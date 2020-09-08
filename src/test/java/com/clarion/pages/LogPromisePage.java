package com.clarion.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethod;
import utils.LogResults;

import java.util.concurrent.TimeUnit;

public class LogPromisePage extends PageObject {
    CommonMethod commonMethod = new CommonMethod();
    LogResults logResults = new LogResults();



    @FindBy(className = "large_black")
    private WebElement logPromise_HeaderTitle;

    @FindBy(id = "btnSubmit")
    private WebElement logPromise_logPromiseSubmitButton;

    @FindBy(name = "btnReset")
    private WebElement logPromise_ResetButton;

    @FindBy(name = "btnCancel")
    private WebElement logPromise_cancelButton;

    @FindBy(xpath = "//td[contains(text(),'Both fields are mandatory')]")
    private WebElement logPromise_mandatoryFieldsMessage;

    @FindBy(id = "txtPromise")
    private WebElement logPromise_promiseTextBox;

    @FindBy(name = "cboEmp")
    private WebElement logPromise_promiseDropdown;


    public void check_IsLogPromisePageDisplayed() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        commonMethod.checkElementDisplayed(logPromise_HeaderTitle);
        commonMethod.checkElementDisplayed(logPromise_logPromiseSubmitButton);
        commonMethod.checkElementDisplayed(logPromise_ResetButton);
        commonMethod.checkElementDisplayed(logPromise_cancelButton);
        commonMethod.checkElementDisplayed(logPromise_mandatoryFieldsMessage);
        commonMethod.checkElementDisplayed(logPromise_promiseDropdown);
        commonMethod.checkElementDisplayed(logPromise_promiseTextBox);
        logResults.info("Log Promise Page is displayed");


    }

    public void selectValue_PromiseFromDropdown(String valueToBeSelected) {
        commonMethod.selectvalueFromDropdown(logPromise_promiseDropdown,valueToBeSelected);
    }

    public void enterPromiseMessage(String promiseMessage) {
        commonMethod.sendKeys(logPromise_promiseTextBox,promiseMessage);
    }

    public void clickOnLogPromiseButton() {
        commonMethod.click(logPromise_logPromiseSubmitButton);
    }
}
