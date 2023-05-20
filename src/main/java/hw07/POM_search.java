package hw07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class POM_search {
    public WebDriver driver;

    public POM_search(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
//        wait.until(ExpectedConditions.visibilityOf(datePublishSubmenu));
    }

    public POM_search gotoSearch(){
        driver.get("https://link.springer.com/search");
        return this;
    }
    @FindBy(xpath = "//input[@id='query']")
    WebElement searchField;
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchButton;
    @FindBy(xpath = "//a[normalize-space()='Newest First']")
    WebElement newestButton;
    @FindBy(xpath = "//a[normalize-space()='Oldest First']")
    WebElement oldestButton;
    @FindBy(xpath = "//div[normalize-space()='Date Published']")
    WebElement datePublishSubmenu;
    @FindBy(xpath = "//select[@id='date-facet-mode']")
    WebElement dateBetweenIn;
    @FindBy(xpath = "//input[@id='start-year']")
    WebElement startYearField;
    @FindBy(xpath = "//input[@id='end-year']")
    WebElement endYearField;
    @FindBy(xpath = "//input[@id='date-facet-submit']")
    WebElement submitButton;
    @FindBy(xpath = "//span[normalize-space()='Article']")
    WebElement contentTypeArticle;


    public POM_search dateSubmenuOpen() throws InterruptedException {
        this.datePublishSubmenu.click();
        Thread.sleep(2000);

        return this;
    }
    public POM_search typeStartYear(String text){
        this.startYearField.clear();
        this.startYearField.sendKeys(text);
        return this;
    }
    public POM_search typeEndYear(String text){
        this.endYearField.clear();
        this.endYearField.sendKeys(text);
        return this;
    }
    public POM_search submitButtonPress(){
        this.submitButton.click();
        return this;
    }

    public POM_search articleButtonPress(){
        this.contentTypeArticle.click();
        return this;
    }

//    public POM_search (){
//        return this;
//    }

}
