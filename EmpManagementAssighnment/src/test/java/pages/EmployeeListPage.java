package pages;
import locators.EmployeeListPageLocators;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;



public class EmployeeListPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
    }

    public CreateEmpPage clickCreateNew() {
        elementUtils.click(EmployeeListPageLocators.CREATE_NEW_LINK);
        return new CreateEmpPage(driver);
    }
}


