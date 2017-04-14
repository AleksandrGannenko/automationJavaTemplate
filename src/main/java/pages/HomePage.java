package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "123")
    private WebElement someNewElement;

    @FindBy(css = "321")
    private WebElement someOtherText;

    public void openHomePage() {
        openURL("www.google.com.ua");
    }

}