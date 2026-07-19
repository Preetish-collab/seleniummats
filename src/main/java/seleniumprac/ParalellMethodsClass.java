package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class ParalellMethodsClass {

public static WebDriver driver;

    @Test
    public void executeSessionOne() {
        // First session of WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        // Find the user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
    }

    @Test
    public void executeSessionTwo() {
        // Second session of WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
       driver.findElement(By.name("uid")).sendKeys("Driver 2");
    }

    @Test
    public void executeSessionThree() {
        // Third session of WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
    }

}
