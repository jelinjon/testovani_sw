package lab11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='AccountFrm_firstname']")
    WebElement firstNameInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_lastname")
    WebElement lastNameInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_email")
    WebElement emailInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_address_1")
    WebElement addressInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_city")
    WebElement cityInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_postcode")
    WebElement postCodeInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_loginname")
    WebElement loginNameInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_password")
    WebElement passwordInput;
    @FindBy(how = How.CSS , using = "#AccountFrm_agree")
    WebElement agreeButton;
    @FindBy(how = How.CSS , using = "button[title='Continue']")
    WebElement continueButton;
    @FindBy(how = How.CSS , using = "#AccountFrm_country_id")
    Select countrySelect;
    @FindBy(how = How.CSS , using = "#AccountFrm_zone_id")
    Select regionSelect;

//    @FindBy(how = How.CSS , using = "")
//    WebElement ;

    public RegistrationPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
    }

    public RegistrationPage typeFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }
    public RegistrationPage typeLastName(String lastName){
        lastNameInput.sendKeys(lastName);
        return this;
    }
    public RegistrationPage typeEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }
    public RegistrationPage typeAddress(String address){
        addressInput.sendKeys(address);
        return this;
    }
    public RegistrationPage typeCity(String city){
        cityInput.sendKeys(city);
        return this;
    }
    public RegistrationPage typePostCode(String postcode){
        postCodeInput.sendKeys(postcode);
        return this;
    }
    public RegistrationPage typeLoginName(String loginName){
        loginNameInput.sendKeys(loginName);
        return this;
    }
    public RegistrationPage typePassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }
    public RegistrationPage selectCountry(String country){
        countrySelect.selectByVisibleText(country);
        return this;
    }
    public RegistrationPage selectRegion(String region){
        regionSelect.selectByVisibleText(region);
        return this;
    }
}
