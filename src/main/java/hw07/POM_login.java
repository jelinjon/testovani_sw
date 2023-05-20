package hw07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class POM_login {
    public WebDriver driver;

    public POM_login(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(emailField));
    }

    public POM_login openLogin(){
        driver.get("https://link.springer.com/signup-login");
        return this;
    }
    @FindBy(xpath = "//input[@id='login-box-email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='login-box-pw']")
    WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

}
