package pages;
import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signOut extends DriverManager {

    @FindBy(className = "logout")
    private WebElement link_signout;



    public void logout() {

        link_signout.click();
    }
}


