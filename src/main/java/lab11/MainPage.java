package lab11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    // pom na main page automationteststore
    private WebDriver driver;
    public MainPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
//        wait.until(ExpectedConditions.visibilityOf(loginOrRegisterAnchor));
        this.driver = driver;
    }

    public MainPage openEshop(){
        driver.get("https://automationteststore.com/");
        return this;
    }
    @FindBy(xpath = "//a[normalize-space()='Login or register']")
    private WebElement loginOrRegisterAnchor;

    public AccountLogin clickLoginOrRegister(){
        loginOrRegisterAnchor.click();
        return new AccountLogin(driver);
    }
}
