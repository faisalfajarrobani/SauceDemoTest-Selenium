package StepDefinitions;

import com.apptest.PageObject.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_CheckoutStepDef {
    @And("User click cart icon")
    public void userClickCartIcon() {
        CheckoutPage.clickCartIcon();
    }

    @And("User have product in the shopping cart")
    public void userHaveProductInTheShoppingCart() throws InterruptedException {
        TC_AddToCartStepDef.userIsAbleToInventoryPage();
        TC_AddToCartStepDef.userSearchProductBasedFromLowPrice();
        TC_AddToCartStepDef.userSelectProductAndRedirectedToProductPage();
        TC_AddToCartStepDef.userClickAddToCartButton();
        TC_AddToCartStepDef.userSuccessAddTheProductSelectedToShoppingCart();
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() {
        CheckoutPage.clickCheckout();
    }

    @And("User enter some data to form")
    public void userEnterSomeDataToForm() {
        CheckoutPage.enterValueToFrome();
    }

    @And("User click continue button")
    public void userClickContinueButton() {
        CheckoutPage.clickContinue();
    }

    @And("User validate the product want to buy")
    public void userValidateTheProductWantToBuy() {
        CheckoutPage.validateProduct();
    }

    @When("User click finish button")
    public void userClickFinishButton() {
        CheckoutPage.clickFinish();
    }

    @Then("User successfully checkout and showing message")
    public void userSuccessfullyCheckoutAndShowingMessage() {
        CheckoutPage.validateSuccessCheckout();
    }

}
