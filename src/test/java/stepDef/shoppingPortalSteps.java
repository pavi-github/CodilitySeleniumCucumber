package stepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signInPage;;

public class shoppingPortalSteps {

    WebDriver driver = null;
    signInPage signin;

    @Given("Login to shopping portal")
    public void login_to_shopping_portal() {

        String projectpath = System.getProperty("user.dir");
        System.out.println("The current path:" + projectpath);
        System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");

        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/");
        driver.manage().window().maximize();

        signin = new signInPage(driver);
        signin.signIn("pavishanmugam17@gmail.com", "Sairampavi@17");

    }

    @When("User search for T-shirt")
    public void user_search_for_t_shirt() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Add to the shopping cart")
    public void add_to_the_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Checkout and place the order")
    public void checkout_and_place_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Verify the Order")
    public void verify_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
