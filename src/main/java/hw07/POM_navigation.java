package hw07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class POM_navigation {
    public WebDriver driver;

    public POM_navigation(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(advancedButton));
    }

    public POM_navigation openNavigation(){
        driver.get("https://link.springer.com/");
        return this;
    }
    @FindBy(xpath = "//div[@class='cross-nav cross-nav--wide']//a[@class='register-link flyout-caption']")
    WebElement loginLink;
    @FindBy(xpath = "//img[@alt='Search Options']")
    WebElement advancedButton;
    @FindBy(xpath = "//a[@id='advanced-search-link']")
    WebElement advancedSearchButton;

}
