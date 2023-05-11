package lab11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountLogin {
    private WebDriver driver;
    @FindBy(xpath = "//i[@class='fa fa-check fa']")
    private WebElement continueButton;
    public AccountLogin(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(continueButton));
    }

    public RegistrationPage clickContinue(){
        continueButton.click();
        return new RegistrationPage(driver);
    }
}
