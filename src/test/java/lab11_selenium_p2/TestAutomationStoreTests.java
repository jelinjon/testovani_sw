package lab11_selenium_p2;

import lab11.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationStoreTests {
    @Test
    public void registrationTest(){
        System.setProperty("webdriver.chrome.driver","C:/Users/START/Downloads/jars na TESTOVANI/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        new MainPage(driver)
                .openEshop()
                .clickLoginOrRegister()
                .clickContinue()
                .typeFirstName("Petr");
    }
}
