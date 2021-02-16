package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class shoppingPortalSteps {

    signInPage signIn = new signInPage();
    searchPage search = new searchPage();
    shoppingCartSummaryPage shopping = new shoppingCartSummaryPage();
    signOut logout = new signOut();


    @Given("User logged in to the Shopping Portal")
    public void user_logged_in_to_the_shopping_portal() {
        signIn.signIn("pavishanmugam17@gmail.com", "Sairampavi@17");
    }


    @When("User adds the selected T-Shirt for checkout")
    public void user_adds_the_selected_t_shirt_for_checkout() {
        search.TShirt_selected();

    }

    @When("User fills all required fields to place the order")
    public void user_fills_all_required_fields_to_place_the_order() {
        shopping.placingOrder();

    }

    @Then("Verify the Order History for the placed order")
    public void verify_the_order_history_for_the_placed_order() {
        shopping.verifyOrder();

    }

    @Then("User signs out from the page")
    public void user_signs_out_from_the_page() {
        logout.logout();
    }
}