import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HommePage extends RedoutePage {

    @FindBy(xpath = "//*[@id=\"panel3\"]/div[1]/div[2]/a[2]")
    WebElement vetementHomme;

    public HommePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public VetementHommePage openVetementHomme(WebDriver driver) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(vetementHomme));
        vetementHomme.click();
        return new VetementHommePage(driver);
    }
}
