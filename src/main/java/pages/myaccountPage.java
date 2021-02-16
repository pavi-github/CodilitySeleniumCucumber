package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class myaccountPage {

    protected WebDriver driver;


    private By but_my_personal_info = By.xpath("//*[@class='icon-user']");
    private By txt_firstname = By.name("firstname");
    private By but_save = By.name("submitIdentity");

    public myaccountPage(WebDriver driver){

        //this.driver = driver;
        //if(driver.getTitle().equals("TestProject Demo"))
        //{
        //    System.out.println("The current URL is:" +driver.getCurrentUrl());
        //}

    }

    public void personalInfo() throws InterruptedException {


        driver.findElement(but_my_personal_info).click();

    }
        //System.out.println("Inside personalinfo");

    public void updateName()
    {
        driver.findElement(txt_firstname).sendKeys("Pavithra Shanmugam");
        driver.findElement(but_save).click();
    }
}
