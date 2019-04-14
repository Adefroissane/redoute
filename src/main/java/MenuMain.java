import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuMain {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"menuMainContainer\"]/ul/li[2]/a/span")
    WebElement menuHomme;

    public MenuMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public HommePage openHommePage(WebDriver driver) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(menuHomme));
        menuHomme.click();
        return new HommePage (driver);
    }
}
