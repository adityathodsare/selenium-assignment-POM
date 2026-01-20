package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {

    private WebDriver driver;
    private WaitUtils waitUtils;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public void enterText(By locator, String text) {
        waitUtils.waitForVisible(locator).clear();
        waitUtils.waitForVisible(locator).sendKeys(text);
    }

    public void click(By locator) {
        waitUtils.waitForClickable(locator).click();
    }

    public void selectByText(By locator, String value) {
        Select select = new Select(waitUtils.waitForVisible(locator));
        select.selectByVisibleText(value);
    }
}

