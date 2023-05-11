package selenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFirstTest {
    public ChromeDriver driver;
    @BeforeEach
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/START/Downloads/jars na TESTOVANI/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationteststore.com/index.php?rt=account/create");
    }
    @Test
    public void firstTest(){

        driver.findElement(By.cssSelector("#AccountFrm_firstname")).sendKeys("Jožin");
        driver.findElement(By.cssSelector("#AccountFrm_lastname")).sendKeys("asdasdasd");
        driver.findElement(By.cssSelector("#AccountFrm_email")).sendKeys("asdasdasd@example.com");
        driver.findElement(By.cssSelector("#AccountFrm_address_1")).sendKeys("asdasdasd");
        driver.findElement(By.cssSelector("#AccountFrm_city")).sendKeys("asdasdasd");
        driver.findElement(By.cssSelector("#AccountFrm_postcode")).sendKeys("25207");
        driver.findElement(By.cssSelector("#AccountFrm_loginname")).sendKeys("ASDSasdasd");
        driver.findElement(By.cssSelector("#AccountFrm_password")).sendKeys("asdFAFSdasd");

        // lepsi metoda cekani na ancteni stranky (explicitni cekani)
//        WebElement firstResultl = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Continue']")));

        Select countrySelect = new Select(driver.findElement(By.cssSelector("#AccountFrm_country_id")));
        countrySelect.selectByVisibleText("Czech Republic");
        Select regionSelect = new Select(driver.findElement(By.cssSelector("#AccountFrm_zone_id")));
        regionSelect.selectByVisibleText("Jihocesky");

        driver.findElement(By.cssSelector("#AccountFrm_agree")).click();
        driver.findElement(By.cssSelector("button[title='Continue']")).click();

//        driver.quit(); // dobry davat after all
    }

    @Test
    public void secondTest(){

    }
}
