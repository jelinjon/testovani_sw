package hw07;

import org.openqa.selenium.chrome.ChromeDriver;

public class read_articles {
    static ChromeDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        search_articles();
    }
    public static void search_articles() throws InterruptedException {
        POM_advancedSearch pomAdvancedSearch = new POM_advancedSearch(driver);
        pomAdvancedSearch.allWordsField.sendKeys("Page Object Model");
        pomAdvancedSearch.atLeastOneWordField.sendKeys("Sellenium Testing");
    }

}
