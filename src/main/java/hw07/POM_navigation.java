package hw07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_navigation {
    public ChromeDriver driver;
    public POM_navigation(){
        driver = new ChromeDriver();
        driver.get("https://link.springer.com/");
        PageFactory.initElements(driver, this);
    }
    public POM_navigation(ChromeDriver driver){
        driver.get("https://link.springer.com/");
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cross-nav cross-nav--wide']//a[@class='register-link flyout-caption']")
    WebElement loginLink;
    @FindBy(xpath = "//img[@alt='Search Options']")
    WebElement advancedButton;
    @FindBy(xpath = "//a[@id='advanced-search-link']")
    WebElement advancedSearchButton;

    public void goToLogin(){
        loginLink.click();
    }

    public void goToAdvancedSearch(){
        advancedButton.click();
        advancedSearchButton.click();
    }
}
