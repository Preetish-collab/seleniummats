package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver initializeBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.out.println("Chrome browser is initialized");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.out.println("Firefox browser is initialized");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.out.println("Edge browser is initialized");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        else{
            System.out.println("Invalid browser name provided");
        }
        return driver;
    }
}
