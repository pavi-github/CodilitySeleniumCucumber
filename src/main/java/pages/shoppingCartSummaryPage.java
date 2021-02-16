package pages;

import driver.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class shoppingCartSummaryPage extends DriverManager {

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement summary_proceed_to_checkout;

    @FindBy(name = "processAddress")
    private WebElement address_proceed_to_checkout;

    @FindBy(id = "cgv")
    private WebElement shipping_checkbox;

    @FindBy(name = "processCarrier")
    private WebElement shipping_proceed_to_checkout;

    @FindBy(className = "bankwire")
    private WebElement payment_select_payment_by_bank;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement confirm_order;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div")
    private WebElement order_num;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    private WebElement back_to_orders;

    @FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
    private WebElement order_history;
    
    private String orderNumber;

    public void placingOrder()  {
        summary_proceed_to_checkout.click();
        address_proceed_to_checkout.click();
        shipping_checkbox.click();
        shipping_proceed_to_checkout.click();
        payment_select_payment_by_bank.click();

        sleep(5000);

        confirm_order.click();
        String orderNum = order_num.getText();
        String orderNo [] = orderNum.split("\n");

        orderNo[6] = orderNo[6].replace("- Do not forget to insert your order reference ","").replace(" in the subject of your bank wire.", "");

        System.out.println("Order Number is " + orderNo[6]);
        setOrderNumber(orderNo[6]);
        back_to_orders.click();
    }

    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;

    }

    public String getOrderNumber(){
        return this.orderNumber;

    }

    public void verifyOrder()  {
        Assert.assertEquals(order_history.getText(), getOrderNumber());
    }

}
