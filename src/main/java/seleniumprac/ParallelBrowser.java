package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class ParallelBrowser {
    public static WebDriver driver;

    @Test
    @Parameters("browser")
    public void setUP(String browser) throws InterruptedException, IOException {
     if(browser.equalsIgnoreCase("chrome")) {
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     } else if (browser.equalsIgnoreCase("firefox")) {
         WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();
     }
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
    }
}