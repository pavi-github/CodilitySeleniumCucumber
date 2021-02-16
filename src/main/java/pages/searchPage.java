package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class searchPage extends DriverManager {

    @FindBy(xpath = "//li[3]/a[contains(text(),'T-shirts')]")
    private WebElement link_TShirt;

    @FindBy(xpath = "//a[contains(@title,'Faded Short Sleeve T-shirts')]")
    private WebElement img_TShirt;

    @FindBy(xpath = "//button/span[contains(text(),'Add to cart')]")
    private WebElement add_to_cart;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    private WebElement proceed_to_checkout;


    public void TShirt_selected() {
            link_TShirt.click();
            img_TShirt.click();
            driver.switchTo().frame(0);
            sleep(2000);

            add_to_cart.click();
            sleep(5000);

            proceed_to_checkout.click();
    }
}