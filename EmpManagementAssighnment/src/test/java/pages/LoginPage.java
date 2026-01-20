package pages;
import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class LoginPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
    }

    public HomePage login(String username, String password) {
        elementUtils.enterText(LoginPageLocators.USERNAME, username);
        elementUtils.enterText(LoginPageLocators.PASSWORD, password);
        elementUtils.click(LoginPageLocators.REMEMBER);
        elementUtils.click(LoginPageLocators.LOGIN_BTN);
        return new HomePage(driver);
    }
}

