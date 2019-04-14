import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedoutePage {
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"menuMain\"]")
    protected MenuMain menuMain;

    public RedoutePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        menuMain = new MenuMain(driver);
    }
    public MenuMain getMenuMain(){
        return menuMain;
    }
}
