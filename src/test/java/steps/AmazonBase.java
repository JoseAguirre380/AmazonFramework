package steps;

import POM.CartPage;
import POM.HomePage;
import POM.ProductPage;
import POM.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonBase {

    protected WebDriver driver = Hooks.getDriver();

    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    protected CartPage cartPage = PageFactory.initElements(driver,CartPage.class);
    protected ProductPage productPage = PageFactory.initElements(driver,ProductPage.class);
    protected SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);


}
