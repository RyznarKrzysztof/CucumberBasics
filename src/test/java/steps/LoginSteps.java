package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.User;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.List;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base){
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        base.driver.get("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I enter the following data for login$")
    public void iEnterTheFollowingDataForLogin(DataTable table) {

        LoginPage loginPage = new LoginPage(base.driver);
        List<User> users = table.asList(User.class);

        for (User user : users){
            loginPage.setLogin(user.userName)
                     .setPassword(user.password)
                     .clickLoginButotn();
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        LoginPage loginPage = new LoginPage(base.driver);
        loginPage.clickLoginButotn();

    }

    @Then("^I should see the userForm page$")
    public void iShouldSeeTheUserFormPage() throws Throwable {
        //Assert.assertTrue(base.driver.findElement(By.cssSelector("input[id='Initial']")).isDisplayed());
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);
    }

}
