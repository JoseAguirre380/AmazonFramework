package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProductPage extends Base{

    public ProductPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//*[@id='apex_desktop']/div/div/span/span[contains(@class,'a-offscreen')]")
    private WebElement priceProductLocator;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButtonlocator;

    @FindBy(id = "nav-cart-text-container")
    private WebElement cartButtonLocator;



    public void addToCart()throws Exception{
        click(addToCartButtonlocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void goToCart()throws Exception{
        click(cartButtonLocator);
    }



}
