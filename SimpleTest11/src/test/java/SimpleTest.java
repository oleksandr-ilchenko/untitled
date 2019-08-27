import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    WebDriver driver;

    @Before
    public void startBrowser()
    {
        driver = new ChromeDriver();
    }
    @After
    public void stopBrowser()
    {
        driver.quit();
    }

    @Test

    public void test()
    {
    driver.get("http://google.com");
    }
}
