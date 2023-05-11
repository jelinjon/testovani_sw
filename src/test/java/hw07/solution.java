package hw07;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class solution {
    @Test
    public void function(){
        ChromeDriver driver = new ChromeDriver();
        POM_navigation pomNavigation = new POM_navigation(driver);
        pomNavigation.goToLogin();

        POM_login pomLogin = new POM_login(driver);
        pomLogin.emailField.sendKeys("aadada@example.com");
    }

    @Test
    public void homework(){
        ChromeDriver driver = new ChromeDriver();
        POM_navigation pomNavigation = new POM_navigation(driver);
    }
}
