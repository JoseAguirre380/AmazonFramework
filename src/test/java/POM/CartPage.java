package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CartPage extends Base{

    public CartPage(WebDriver driver){
        super(driver);
    }

    //private By spamSelectToShowSelect = By.id("a-autoid-0-announce");
    @FindBy(id = "quantity")
    private WebElement quantitySelect;

    @FindBy(name = "quantityBox")
    private WebElement inputQuantity ;

    private By updateQuiantityButton;


    public boolean setQuantity() throws Exception{
        Select select = new Select(quantitySelect);
        //click(spamSelectToShowSelect);
        select.selectByVisibleText("10+");

            type("20", inputQuantity);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            updateQuiantityButton = By.id("a-autoid-1-announce");
            click(updateQuiantityButton);
            return true;


    }


}
