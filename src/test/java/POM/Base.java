package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

import java.util.List;

public class Base {

    WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) throws Exception {
        try {
            return driver.findElement(locator);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("error finding the element");
        }
    }



    public List<WebElement> findElements(By locator) throws Exception {
        try {
            return driver.findElements(locator);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<WebElement> findElements(WebElement webElement, By locator) throws Exception {
        try {
            return webElement.findElements(locator);
        } catch (Exception e) {
            throw new Exception("error finding the elements ");
        }
    }



    public String getText(By locator) throws Exception {
        try {
            return driver.findElement(locator).getText();
        } catch (Exception e) {
            throw new Exception("error getting text");
        }
    }

    public String getText(WebElement webElement) throws Exception {
        try {
            return webElement.getText();
        } catch (Exception e) {
            throw new Exception("error getting text");
        }
    }

    public void type(String text, By locator) throws Exception {
        try {
            driver.findElement(locator).sendKeys(text);
        } catch (Exception e) {
            throw new Exception("error typing in the element");
        }
    }

    public void type(String text, WebElement webElement) throws Exception {
        try {
            webElement.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("error typing in the element");
        }
    }

    public void click(WebElement webElement) throws Exception {
        try {
            webElement.click();
        } catch (Exception e) {
            throw new Exception("error clicking the element");
        }
    }

    public void click(By locator) throws Exception {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("error clicking the element");
        }
    }

    public boolean isDisplayed(By locator) throws Exception {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            throw new Exception("Error to validate displayed element");
        }
    }

    public boolean isDisplayed(WebElement webElement) throws Exception {
        try {
            return webElement.isDisplayed();
        } catch (Exception e) {
            throw new Exception("Error to validate displayed element");
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("error getting title");
        }
    }

}
