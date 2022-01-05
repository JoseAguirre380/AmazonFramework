package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage  extends Base{

    @FindBy(xpath = "//div[contains(@class,'s-main-slot')]/div")
    private List<WebElement> searchResult;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]")
    private List<WebElement> elementList;

    @FindBy(xpath = ".//span[contains(@class,'a-offscreen')]")
    private WebElement priceLocator;

    float price;


    public SearchPage(WebDriver driver){
        super(driver);
    }

    public void  printElementsLeftMenu()throws Exception{
        for (WebElement webElement : elementList){

            System.out.println("Elemento de menu izquierdo" + webElement.getText());
        }
    }
    public void printPriceFirstElement()throws Exception{
       //elementList = this.findElements(searchResult);
        int index = 0;
        for (WebElement webelement: searchResult) {
            String asd ="";
            String cent = "";
            if(webelement.findElement(By.xpath(".//span[contains(@class,'a-price-whole')]")) != null){
                asd = webelement.findElement(By.xpath(".//span[contains(@class,'a-price-whole')]")).getText();
            }
            if(webelement.findElement(By.xpath(".//span[contains(@class,'a-price-fraction')]")) != null){
                cent = webelement.findElement(By.xpath(".//span[contains(@class,'a-price-fraction')]")).getText();
            }
            System.out.println("Precio: " + asd +"."+cent);
            if (index++ == 2){
                break;
            }
            price = Float.valueOf(asd+"."+cent);

        }
    }
    public void selectFirstProduct(){
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element1 = wait1.until(ExpectedConditions.visibilityOf(searchResult.get(0).findElement(By.xpath(".//a[contains(@class,'a-link-normal')]"))));
        element1.click();
        }


    public float getPrice() {
        return price;
    }
}



