package StepDefinitions;

import com.apptest.BaseClass;
import com.apptest.PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC_LoginStepDef extends BaseClass {
    @Given("User is able to login page")
    public static void userIsAbleToLoginPage() {
        LoginPage.validateLoginPage();
    }

    @And("User enter username and password")
    public static void userEnterUsernameAndPassword() {
        LoginPage.enterUsernameAndPassword();
    }

    @When("User click login button")
    public static void userClickLoginButton() {
        LoginPage.clickLoginButton();
    }

    @Then("User login successfully and redirected to inventory page")
    public static void userLoginSuccessfullyAndRedirectedToInventoryPage() {
        LoginPage.validateInventoryPage();
    }
}
