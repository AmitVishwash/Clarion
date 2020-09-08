package com.clarion.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethod;
import utils.LogResults;
import utils.PropertyReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage  extends PageObject{
CommonMethod  commonMethod = new CommonMethod();
LogResults logResults= new LogResults();

    @FindBy(xpath = "//font[contains(text(),'Invalid Username/password')]")
    private WebElement login_ValidationErrorMessage;

    @FindBy(name = "txtUsername")
    private WebElement login_userNameTextBox;

    @FindBy(name = "txtPassword")
    private WebElement login_passwordTextBox;

    @FindBy(className = "button_white")
    private WebElement login_loginButon;


    public void textBox_EnterName(String name)
    {
        commonMethod.sendKeys(login_userNameTextBox,name);
    }


    public void textBox_EnterPassword(String password)
    {
        commonMethod.sendKeys(login_passwordTextBox,password);
    }

    public void click_submitButton()
    {
        commonMethod.click(login_loginButon);
    }


    public void launchClarionPortal() throws IOException {
       getDriver().get(new PropertyReader().getApplicationUrl());
        logResults.info("Application is Launched");
    }

    public void checkValidationMessageDisplayed(String loginValidationErrorMessage) {
        commonMethod.checkElementDisplayed(login_ValidationErrorMessage);
        commonMethod.checkTextPresent(login_ValidationErrorMessage,loginValidationErrorMessage);
    }
}
