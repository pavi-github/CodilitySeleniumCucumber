package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage {

    protected WebDriver driver;
    private By link_signin= By.className("login");
    private By txt_email=By.name("email");
    private By txt_password=By.id("passwd");
    private By but_SubmitLogin = By.name("SubmitLogin");


    public signInPage(WebDriver driver){

        this.driver = driver;
        if(driver.getTitle().equals("TestProject Demo"))
        {
            System.out.println("The current URL is:" +driver.getCurrentUrl());
        }

    }

    public void signIn(String username, String password) {
        driver.findElement(link_signin).click();
        driver.findElement(txt_email).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(but_SubmitLogin).click();
    }

}