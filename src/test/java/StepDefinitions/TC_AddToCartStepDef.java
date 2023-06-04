package StepDefinitions;

import com.apptest.PageObject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_AddToCartStepDef {
    @Given("User is able to login")
    public static void userIsAbleToLogin() {
        TC_LoginStepDef.userIsAbleToLoginPage();
        TC_LoginStepDef.userEnterUsernameAndPassword();
        TC_LoginStepDef.userClickLoginButton();
        TC_LoginStepDef.userLoginSuccessfullyAndRedirectedToInventoryPage();
    }

    @And("User is able to inventory page")
    public static void userIsAbleToInventoryPage() throws InterruptedException {
        InventoryPage.isInventoryPage();
    }

    @And("User search product based from low price")
    public static void userSearchProductBasedFromLowPrice() throws InterruptedException {
        InventoryPage.seachBasedFromLowPrice();
    }

    @And("User select product and redirected to product page")
    public static void userSelectProductAndRedirectedToProductPage() throws InterruptedException {
        InventoryPage.clickProduct();
    }


    @When("User click add to cart button")
    public static void userClickAddToCartButton() throws InterruptedException {
        InventoryPage.clickAddToCart();
    }

    @Then("User success add the product selected to shopping cart")
    public static void userSuccessAddTheProductSelectedToShoppingCart() throws InterruptedException {
        InventoryPage.isAddedToCart();
    }

}
