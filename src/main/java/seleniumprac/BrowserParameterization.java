package seleniumprac;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserParameterization extends BrowserUtility {

    private static final Logger log = Logger.getLogger(BrowserParameterization.class);

    @Test
    @Parameters("browsername")
    public void testBrowser(String browsername){
        browsersetUP(browsername);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        log.info("Launching App");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        log.info("Enter credentials");
    }
}
