package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitConcepts {
//    public static WebDriver driver;
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Register.html");
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));
//
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30L));
//        WebElement ele=   wait .until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@placeholder='First mame']"))));
//        ele.sendKeys("John");
//}
}
