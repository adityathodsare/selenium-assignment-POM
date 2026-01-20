package tests;


import base.BaseTest;
import org.testng.annotations.Test;
import pages.CreateEmpPage;
import pages.EmployeeListPage;
import pages.HomePage;
import pages.LoginPage;

public class CreateEmployeeTest extends BaseTest {

    @Test
    public void createEmployeeTest() {
        HomePage home = new HomePage(driver);
        LoginPage login = home.clickLogin();

        home = login.login("admin", "password");

        EmployeeListPage empList = home.clickEmployeeList();
        CreateEmpPage createEmp = empList.clickCreateNew();

        createEmp.createEmployee("Aditya", "25000", "20", "aditya@xyz.com", "Middle");
    }
}

