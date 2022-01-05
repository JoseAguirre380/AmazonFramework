package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {



    private String titleHomePage = "Amazon.com. Spend less. Smile more.";

    @FindBy(id = "nav-hamburger-menu")
    private WebElement navBarLeftMenuLocator;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/ul[1]/li[8]/a")
    private WebElement electronicMenuButtonLocator;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/ul[6]/li[9]/a")
    private WebElement computerAccessoriesLocator;

    @FindBy(id = "nav-xshop-container")
    private WebElement topMenuLocator;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBoxLocator;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButtonLocator;


    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean topMenuIsDisplayed()throws Exception{
        return this.isDisplayed(topMenuLocator);
    }

    public boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnLeftMenu() throws Exception{
        this.click(navBarLeftMenuLocator);
        Thread.sleep(3000);

    }
    public void clickOnelectronicMenuButton() throws Exception{
        this.click(electronicMenuButtonLocator);
        Thread.sleep(3000);


    }

    public void clickOncomputerAccessories() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(computerAccessoriesLocator));
        this.click(computerAccessoriesLocator);

    }

    public void clickSearchButton() throws Exception{
        this.click(searchBoxLocator);
    }
    public void typeSearch()throws Exception{
        this.type("notebook 34",searchBoxLocator);
        this.click(searchButtonLocator);
    }
}
