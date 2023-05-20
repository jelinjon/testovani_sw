package hw07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class POM_advancedSearch {
    public WebDriver driver;
    public POM_advancedSearch(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.driver = driver;
//        wait.until(ExpectedConditions.visibilityOf(cookiesButton));
    }

    public POM_advancedSearch openSite(){
        driver.get("https://link.springer.com/advanced-search");
        return this;
    }
    @FindBy(xpath = "//input[@id='all-words']")
    WebElement allWordsField;
    @FindBy(xpath = "//button[normalize-space()='Accept all cookies']")
    WebElement cookiesButton;

    @FindBy(xpath = "//input[@id='exact-phrase']")
    WebElement exactPhraseField;
    @FindBy(xpath = "//input[@id='least-words']")
    WebElement atLeastOneWordField;
    @FindBy(xpath = "//input[@id='without-words']")
    WebElement withoutWordsField;
    @FindBy(xpath = "//input[@id='title-is']")
    WebElement titleContainsField;
    @FindBy(xpath = "//input[@id='author-is']")
    WebElement authorEditorField;
    @FindBy(xpath = "//input[@id='facet-start-year']")
    WebElement startYearField;
    @FindBy(xpath = "//input[@id='facet-end-year']")
    WebElement endYearField;
    @FindBy(xpath = "//select[@id='date-facet-mode']")
    WebElement betweenYearSelect;
    @FindBy(xpath = "//input[@id='results-only-access-checkbox-advanced']")
    WebElement previewedCheckbox;
    @FindBy(xpath = "//button[@id='submit-advanced-search']")
    WebElement searchButton;
    @FindBy(xpath = "//select[@id='date-facet-mode']")
    WebElement yearSelect;


    public POM_advancedSearch clickCookiesButton(){
        this.cookiesButton.click();
        return this;
    }

    public POM_advancedSearch typeIntoAllWords(String text){
        this.allWordsField.sendKeys(text);
        return this;
    }

    public POM_advancedSearch typeIntoAtLeastOneWord(String text){
        this.atLeastOneWordField.sendKeys(text);
        return this;
    }

    public POM_advancedSearch selectIn(){
        this.yearSelect.click();
        return this;
    }

    public POM_advancedSearch typeIntoStartYear(String text){
        this.startYearField.sendKeys(text);
        return this;
    }

    public POM_advancedSearch clickSearchButton(){
        this.searchButton.click();
        return this;
    }
}
