import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatisation {

    WebDriver driver;

    @Before
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.laredoute.fr/");
    }

    @After
    public void teardown() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test
    public void automatisation()
    {
        RedoutePage redoute = new RedoutePage(driver);
        HommePage hommePage = redoute.getMenuMain().openHommePage(driver);
        VetementHommePage vetementHomme = hommePage.openVetementHomme(driver);

    }
}