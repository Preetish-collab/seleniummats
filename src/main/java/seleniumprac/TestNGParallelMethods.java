package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGParallelMethods {
    public static WebDriver driver;
    @Test
    public void FirefoxTest() {
        //Initializing the firefox driver (Gecko)
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demoblaze.com/");
        String title= driver.getTitle();
        System.out.println("Title verified in Firefox "+title);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.quit();
    }

    @Test
    public void ChromeTest()
    {
        //Initialize the chrome driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        String title= driver.getTitle();
        System.out.println("Title verified in Chrome "+title);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.quit();
    }
}
