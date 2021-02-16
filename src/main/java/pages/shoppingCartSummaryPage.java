package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartSummaryPage {
    protected WebDriver driver;
    private By summary_proceed_to_checkout2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    private By address_proceed_to_checkout3 = By.name("processAddress");
    private By shipping_checkbox = By.id("cgv");
    private By shipping_proceed_to_checkout4 = By.name("processCarrier");
    private By payment_select_payment_by_bank = By.className("bankwire");
    private By confirm_order = By.className("button btn btn-default button-medium");
    private By back_to_orders = By.className("button-exclusive btn btn-default");
    private By order_history = By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a");

    public shoppingCartSummaryPage(WebDriver driver){

        this.driver = driver;
        if(driver.getTitle().equals("TestProject Demo"))
        {
            System.out.println("The current URL is:" +driver.getCurrentUrl());
        }

    }

    public void placingOrder() {
        driver.findElement(summary_proceed_to_checkout2).click();
        driver.findElement(address_proceed_to_checkout3).click();
        driver.findElement(shipping_checkbox).click();
        driver.findElement(shipping_proceed_to_checkout4).click();
        driver.findElement(payment_select_payment_by_bank).click();
        Thread.sleep(5000);
        driver.findElement(confirm_order).click();
        driver.findElement(back_to_orders).click();
    }
}
