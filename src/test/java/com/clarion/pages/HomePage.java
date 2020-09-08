package com.clarion.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethod;
import utils.LogResults;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageObject {

CommonMethod commonMethod = new CommonMethod();
LogResults logResults = new LogResults();

    @FindBy(xpath = "//b[contains(text(),'HOME')]")
    private WebElement homeMenuLink;

    @FindBy(xpath = "//b[contains(text(),'HELP')]")
    private WebElement helpMenuLink;

    @FindBy(xpath = "//b[contains(text(),'LOGOUT')]")
    private WebElement logOutMenuLink;

    @FindBy(xpath = "//a[contains(text(),'Log Promise')]")
    private WebElement logPromiseLink;

    @FindBy(xpath = "//a[contains(text(),'Promises From')]")
    private WebElement PromiseFromLink;

    @FindBy(xpath = "//a[contains(text(),'Promises To')]")
    private WebElement PromiseToLink;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    private WebElement MyAccountLink;


public void check_IsHomePageDisplayed() throws InterruptedException {
    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    commonMethod.checkElementDisplayed(homeMenuLink);
    commonMethod.checkElementDisplayed(helpMenuLink);
    commonMethod.checkElementDisplayed(logOutMenuLink);
    commonMethod.checkElementDisplayed(logPromiseLink);
    commonMethod.checkElementDisplayed(PromiseFromLink);
    commonMethod.checkElementDisplayed(PromiseToLink);
    commonMethod.checkElementDisplayed(MyAccountLink);
    logResults.info("Home Page is displayed");


}

    public void clickOnLogPromiseLink() {
    commonMethod.click(logPromiseLink);
    }

    public void clickOnLogOutLink()
    {
        commonMethod.click(logOutMenuLink);
    }
}
