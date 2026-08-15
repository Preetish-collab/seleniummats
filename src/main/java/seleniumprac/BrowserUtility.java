package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BrowserUtility {
    private static final Logger log = Logger.getLogger(BrowserUtility.class);
    public  WebDriver driver;
    public void browsersetUP(String browsername) {
        if (browsername.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            log.info("App Launched successfully for chrome");
        } else if (browsername.equals("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            log.info("App Launched successfully for edge");
        } else if (browsername.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            log.info("App Launched successfully for firefox");
        }
    }
        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

