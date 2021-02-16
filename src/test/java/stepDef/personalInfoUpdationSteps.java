package stepDef;

import io.cucumber.java.en.When;
import pages.myaccountPage;


public class personalInfoUpdationSteps {

   myaccountPage accountPage = new myaccountPage();


    @When("User clicks on My Personal Information")
    public void user_clicks_on_my_personal_information() throws InterruptedException {

        accountPage.personalInfo();
    }

    @When("User updates the First Name")
    public void user_updates_the_first_name() {

        accountPage.updateName();
    }


}
