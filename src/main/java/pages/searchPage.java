package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


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

    public void TShirt_selected()  {
        try {
            driver.findElement(link_TShirt).click();
            driver.findElement(img_TShirt).click();
            driver.findElement(add_to_cart).click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                driver.findElement(proceed_to_checkout1).click();
                driver.close();
            }
        }
        driver.switchTo().window(parent);

    }
}
