package pages;
import locators.CreateEmpPageLocators;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class CreateEmpPage {

    private WebDriver driver;
    private ElementUtils elementUtils;
    public CreateEmpPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
    }

    public EmployeeListPage createEmployee(String name, String salary,
                                           String duration, String email,
                                           String grade) {

        elementUtils.enterText(CreateEmpPageLocators.NAME, name);
        elementUtils.enterText(CreateEmpPageLocators.SALARY, salary);
        elementUtils.enterText(CreateEmpPageLocators.DURATION, duration);
        elementUtils.selectByText(CreateEmpPageLocators.GRADE, grade);
        elementUtils.enterText(CreateEmpPageLocators.EMAIL, email);
        elementUtils.click(CreateEmpPageLocators.CREATE_BTN);

        return new EmployeeListPage(driver);
    }
}

