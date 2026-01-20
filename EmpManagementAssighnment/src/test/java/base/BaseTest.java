package base;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static constants.FrameworkConstants.URL;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.initDriver();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
