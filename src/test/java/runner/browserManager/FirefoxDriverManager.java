package runner.browserManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {


    @Override
    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver","./src/test/java/resources/geckodriver.exe");
        driver = new FirefoxDriver();

    }
}
