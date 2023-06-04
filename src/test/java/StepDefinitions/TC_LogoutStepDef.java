package StepDefinitions;

import com.apptest.PageObject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC_LogoutStepDef {
    @And("User click burger button")
    public void userClickBurgerButton() {
        InventoryPage.clickBurgerButton();
    }

    @When("User click logout button")
    public void userClickLogoutButton() {
        InventoryPage.clickLogoutButton();
    }

    @And("User successfully logout and redirected to login page")
    public void userSuccessfullyLogoutAndRedirectedToLoginPage() {
        TC_LoginStepDef.userIsAbleToLoginPage();
    }
}
