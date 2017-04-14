package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.Matchers.is;

public class ActionsWithWebElements {
    private WebDriver driver;
    private Logger logger;
    private WebDriverWait webDriverWait15;
    private WebDriverWait webDriverWait20;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
        webDriverWait15 = new WebDriverWait(driver, 15);
        webDriverWait20 = new WebDriverWait(driver, 20);
    }

    public void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    public void enterText(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
    }

    public boolean isElementPresent(WebElement element) {
        boolean isElementPresent = false;
        try {
            isElementPresent = webDriverWait20.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return isElementPresent;
    }

    public boolean checkTextInElement(WebElement element, String expectedText) {
        boolean checkTextInElement = false;
        try {
            checkTextInElement = webDriverWait15.until(ExpectedConditions.visibilityOf(element)).getText().equals(expectedText);
        } catch (Exception e) {
            logger.error("Can not check text in element");
            Assert.fail("Can not check text in element");
        }
        return checkTextInElement;
    }

    public void checkTextInElement(String locator, String expectedText) {
        try {
            String textFromElement = driver.findElement(By.xpath(locator)).getText();
            Assert.assertThat("Text in element not matched", textFromElement, is(expectedText));
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public String getTextFromElement(WebElement element) {
        String textFromElement = "";
        try {
            textFromElement = webDriverWait15.until(ExpectedConditions.visibilityOf(element)).getText();
        } catch (Exception e) {
            logger.error("Can not get text from element");
            Assert.fail("Can not get text from element");
        }
        return textFromElement;
    }

    public void selectDropdownText(WebElement dropDownElement, String textForSelection) {
        try {
            Select optionsFromDD = new Select(dropDownElement);
            optionsFromDD.selectByVisibleText(textForSelection);
            logger.info(textForSelection + " text was selected in DropDown");
        } catch (Exception e) {
            logger.error("Can not work with dropdown element");
            Assert.fail("Can not work with dropdown element");
        }
    }

    public void selectDropdownValue(WebElement dropDownElement, String valueForSelection) {
        try {
            Select optionsFromDD = new Select(dropDownElement);
            optionsFromDD.selectByValue(valueForSelection);
            logger.info(valueForSelection + " value was selected in DropDown");
        } catch (Exception e) {
            logger.error("Can not work with dropdown element");
            Assert.fail("Can not work with dropdown element");
        }
    }

}