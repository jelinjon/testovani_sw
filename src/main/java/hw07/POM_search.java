package hw07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_search {
    public ChromeDriver driver;
    public POM_search(){
        driver = new ChromeDriver();
        driver.get("https://link.springer.com/search");
        PageFactory.initElements(driver, this);
    }
    public POM_search(ChromeDriver driver){
        driver.get("https://link.springer.com/search");
        PageFactory.initElements(driver, this);
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

}
