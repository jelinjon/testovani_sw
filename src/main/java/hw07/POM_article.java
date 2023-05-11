package hw07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_article {
    public ChromeDriver driver = new ChromeDriver();
    public POM_article(){
        driver.get("");
        //todo dynamic link
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='js-context-bar-sticky-point-desktop']//span[@class='c-pdf-download__text'][normalize-space()='Download PDF']")
    WebElement downloadPDFButton;

    @FindBy(xpath = "//a[normalize-space()='Cite this article']")
    WebElement citeLink;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;

}
