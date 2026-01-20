package pages;
import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;


public class HomePage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
    }

    public LoginPage clickLogin() {
        elementUtils.click(HomePageLocators.LOGIN_LINK);
        return new LoginPage(driver);
    }

    public EmployeeListPage clickEmployeeList() {
        elementUtils.click(HomePageLocators.EMPLOYEE_LIST_LINK);
        return new EmployeeListPage(driver);
    }
}

