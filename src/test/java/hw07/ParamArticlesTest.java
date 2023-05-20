package hw07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ParamArticlesTest {
    ArrayList<String> params;
    WebDriver driver;
    @BeforeEach
    public void setUp() throws InterruptedException {
        read_articles readArticles = new read_articles();
        params =  readArticles.getResults();
        System.setProperty("webdriver.chrome.driver","C:/Users/START/Downloads/jars na TESTOVANI/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @ParameterizedTest(name = "xd")
    @CsvSource({"Page Object Model, Sellenium Testing, 2023"})
    public void Test1(String allWords, String atLeastOneWord, String year) throws InterruptedException {

        new POM_advancedSearch(driver)
                .openSite()
                .clickCookiesButton()
                .typeIntoAllWords(allWords)
                .typeIntoAtLeastOneWord(atLeastOneWord)
                .clickSearchButton();
        new POM_search(driver)
                .dateSubmenuOpen()
                .typeStartYear(year)
                .typeEndYear(year)
                .submitButtonPress()
                .articleButtonPress();

        WebElement parent = driver.findElement(By.xpath("//ol[@id='results-list']"));
        List<WebElement> first5Results = parent.findElements(new By.ByClassName("title"));
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            first5Results.get(i).click();
            WebElement title = driver.findElement(new By.ByClassName("c-article-title"));
            String articleTitle = title.getText();
            WebElement doi_father = driver.findElement(new By.ByClassName("c-bibliographic-information__list-item c-bibliographic-information__list-item--doi"));
            WebElement doi = doi_father.findElement(new By.ByClassName("c-bibliographic-information__value"));
            String articleDoi = doi.getText();
            WebElement date = driver.findElement(By.xpath("//span[@class='c-bibliographic-information__value']//time[contains(text(),'20 January 2023')]"));
            String articleDate = date.getText();
            results.add(articleTitle);
            results.add(articleDoi);
            results.add(articleDate);
    }
        for (int i = 0; i < params.size(); i++) {
            Assertions.assertEquals(params.get(i), results.get(i));
        }
    }
}
