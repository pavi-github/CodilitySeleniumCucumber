package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class signOut {
    protected WebDriver driver;
    private By link_signout = By.className("logout");

    public signOut(WebDriver driver) {

        this.driver = driver;
        if (driver.getTitle().equals("TestProject Demo")) {
            System.out.println("The current URL is:" + driver.getCurrentUrl());
        }

    }

    public void logout() {
        driver.findElement(link_signout).click();
    }
}


