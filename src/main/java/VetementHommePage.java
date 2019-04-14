import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VetementHommePage extends RedoutePage{
    public VetementHommePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
