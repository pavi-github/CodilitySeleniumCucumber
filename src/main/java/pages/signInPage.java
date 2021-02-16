package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInPage extends DriverManager {

    @FindBy(className = "login")
    private WebElement link_signin;

    @FindBy(name = "email")
    private WebElement txt_email;

    @FindBy(id = "passwd")
    private WebElement txt_password;

    @FindBy(name = "SubmitLogin")
    private WebElement but_SubmitLogin;



    public void signIn(String username, String password) {
        link_signin.click();
        txt_email.sendKeys(username);
        txt_password.sendKeys(password);
        but_SubmitLogin.click();
    }

}