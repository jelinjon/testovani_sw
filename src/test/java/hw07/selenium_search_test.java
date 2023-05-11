package hw07;

import org.junit.jupiter.api.Test;

public class selenium_search_test {
    POM_search pomSearch;

    @Test
    public void searchtest1(){
        pomSearch = new POM_search();
        pomSearch.searchField.sendKeys("test");
        pomSearch.searchButton.click();
        pomSearch.datePublishSubmenu.click();
    }
}
