package utils;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class  CommonMethod extends PageObject {
    LogResults logResults = new LogResults();
    public static String promise_Message = null;
    int counter = 0;

    public void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
        promise_Message = value;
    }

    public void click(WebElement element) {
        try {
            if (element.isEnabled()) {
                element.click();
            }
        } catch (Exception e) {
            logResults.info("Not able to click the element- " + e.getMessage());
        }
    }

    public void checkElementDisplayed(WebElement element) {
        try {
            if (element.isDisplayed()) {
                logResults.info("Element with the text " + element.getText() + " is displayed");
            } else {
                Assert.fail("Element is not displayed");
            }
        } catch (Exception e) {
            Assert.fail("Element is not displayed- " + e.getMessage());
        }
    }

    public void checkTextPresent(WebElement element, String message) {
        Assert.assertEquals(message, element.getText());
    }

    public void selectvalueFromDropdown(WebElement element, String optionToBeSelected) {
        Select select = new Select(element);

        List<WebElement> listOfDropDownvalues = element.findElements(By.tagName("option"));
        for (WebElement value : listOfDropDownvalues) {
            if (optionToBeSelected.equalsIgnoreCase(value.getText().trim().toString())) {
                select.selectByVisibleText(optionToBeSelected);
            }
        }
        if (select.getFirstSelectedOption().getText().trim().toString().equalsIgnoreCase(optionToBeSelected))
            logResults.info("Value " + optionToBeSelected + " has been selected successfully");
        else
            Assert.fail("Expected " + optionToBeSelected + " And Actual Selection was " + select.getFirstSelectedOption().getText());
    }

    public void clickElementUntilEnabled(WebElement element) {

        try {
            while (element.isEnabled()) {
                element.click();
                checkPromiseDetails();
            }
        }
        catch (Exception e) {
            checkPromiseDetails();
        }
    }

    private void checkPromiseDetails() {

        try {
            WebElement element = getDriver().findElement(By.xpath("//td[contains(text()," + "'" + CommonMethod.promise_Message + "'" + ")" + "]"));

            if (element.isDisplayed()) {
                System.out.println("Promise has been added successfully and it is diaplayed on " + counter + 1 + " page");


            }
        }catch (Exception e)
        {
            logResults.info(e.getMessage());
        }
    }
}