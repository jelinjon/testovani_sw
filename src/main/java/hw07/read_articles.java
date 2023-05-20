package hw07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class read_articles {
    public static void main(String[] args) throws InterruptedException {
        searchArticles();
    }

    public static void searchArticles() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/START/Downloads/jars na TESTOVANI/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        new POM_advancedSearch(driver)
                .openSite()
                .clickCookiesButton()
                .typeIntoAllWords("Page Object Model")
                .typeIntoAtLeastOneWord("Sellenium Testing")
                .clickSearchButton();
        new POM_search(driver)
                .dateSubmenuOpen()
                .typeStartYear("2023")
                .typeEndYear("2023")
                .submitButtonPress()
                .articleButtonPress();
        WebElement parent = driver.findElement(By.xpath("//ol[@id='results-list']"));
        List<WebElement> first5Results = parent.findElements(new By.ByClassName("title"));
        for (int i = 0; i < 5; i++) {
            first5Results.get(i).click();
            WebElement title = driver.findElement(new By.ByClassName("c-article-title"));
            String articleTitle = title.getText();
            WebElement doi_father = driver.findElement(new By.ByClassName("c-bibliographic-information__list-item c-bibliographic-information__list-item--doi"));
            WebElement doi = doi_father.findElement(new By.ByClassName("c-bibliographic-information__value"));
            String articleDoi = doi.getText();
            WebElement date = driver.findElement(By.xpath("//span[@class='c-bibliographic-information__value']//time[contains(text(),'20 January 2023')]"));
            String articleDate = date.getText();


        }
    }

}
