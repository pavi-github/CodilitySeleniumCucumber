package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class myaccountPage extends DriverManager {

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement but_my_personal_info;

    @FindBy(name = "firstname")
    private WebElement txt_firstname;

    @FindBy(name = "submitIdentity")
    private WebElement but_save;


    public void personalInfo(){

        but_my_personal_info.click();

    }

    public void updateName()
    {
        txt_firstname.sendKeys("Pavithra Shanmugam");
        but_save.click();
    }
}
