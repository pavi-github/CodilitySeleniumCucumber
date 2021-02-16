package stepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.myaccountPage;


public class personalInfoUpdationSteps {
    WebDriver driver = null;
    myaccountPage accountpage;

    @When("User clicks on My Personal Information")
    public void user_clicks_on_my_personal_information() throws InterruptedException {

        accountpage = new myaccountPage(driver);
        accountpage.personalInfo();
    }

    @When("User updated the First Name")
    public void user_updated_the_first_name() {

        accountpage.updateName();
    }


}
