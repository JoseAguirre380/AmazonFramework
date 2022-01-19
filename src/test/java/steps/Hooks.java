package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Is Running test case number : " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();

    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
        System.out.println("Sceario number : " + numberOfCase + "executed successfully");
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
