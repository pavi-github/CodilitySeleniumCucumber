package stepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signInPage;
import pages.searchPage;
import pages.shoppingCartSummaryPage;
import pages.signOut;
public class shoppingPortalSteps {

    WebDriver driver = null;
    signInPage signin;
    searchPage search;
    shoppingCartSummaryPage shopping;
    signOut logout;


    @Given("User logged in to the Shopping Portal")
    public void user_logged_in_to_the_shopping_portal() {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/");
        driver.manage().window().maximize();

        signin = new signInPage(driver);
        signin.signIn("pavishanmugam17@gmail.com", "Sairampavi@17");
    }
    @When("User adds the selected T-Shirt for checkout")
    public void user_adds_the_selected_t_shirt_for_checkout() throws InterruptedException {
        search = new searchPage(driver);
        search.TShirt_selected();

    }

    @When("User fills all required fields to place the order")
    public void user_fills_all_required_fields_to_place_the_order() {
        shopping = new shoppingCartSummaryPage(driver);
        shopping.placingOrder();

    }

    @Then("Verify the Order History for the placed order")
    public void verify_the_order_history_for_the_placed_order() {

    }
    @Then("User signed out from the page")
    public void user_signed_out_from_the_page() {
      logout = new signOut(driver);
      logout.logout();
    }
}