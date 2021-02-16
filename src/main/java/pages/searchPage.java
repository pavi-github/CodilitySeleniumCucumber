package pages;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;


public class searchPage {
    protected WebDriver driver;
    private By link_TShirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    private By img_TShirt = By.className("product_img_link");
    private By add_to_cart = By.id("add_to_cart");
    private By proceed_to_checkout1 = By.className("btn btn-default button button-medium");

    public searchPage(WebDriver driver){

        this.driver = driver;
        if(driver.getTitle().equals("TestProject Demo"))
        {
            System.out.println("The current URL is:" +driver.getCurrentUrl());
        }

    }

    public void TShirt_selected() throws InterruptedException {
        driver.findElement(link_TShirt).click();
        driver.findElement(img_TShirt).click();
        driver.findElement(add_to_cart).click();
        Thread.sleep(5000);
        //driver.findElement(proceed_to_checkout1).click();


    }
}
