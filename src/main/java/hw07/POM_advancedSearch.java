package hw07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_advancedSearch {
    public ChromeDriver driver = new ChromeDriver();
    public POM_advancedSearch(){
        driver.get("https://link.springer.com/advanced-search");
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='all-words']")
    WebElement allWordsField;
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
}
