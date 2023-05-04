package hw07;

import org.junit.jupiter.api.Test;

public class selenium_navigation_test {
    POM_navigation pomNavigation;

    @Test
    public void navigationToLoginTest(){
        pomNavigation = new POM_navigation();
        pomNavigation.goToLogin();
    }
    @Test
    public void navigationToAdvancedSearchTest(){
        pomNavigation = new POM_navigation();
        pomNavigation.goToAdvancedSearch();
    }

}
