package hw07;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_login {
    public ChromeDriver driver;
    public POM_login(){
        driver = new ChromeDriver();
        driver.get("https://link.springer.com/signup-login");
        PageFactory.initElements(driver, this);
    }
    public POM_login(ChromeDriver driver){
        driver.get("https://link.springer.com/signup-login");
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='login-box-email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='login-box-pw']")
    WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    public void logIn(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
//        loginButton.click();
    }
}
