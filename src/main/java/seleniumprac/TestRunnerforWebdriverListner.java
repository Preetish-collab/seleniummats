package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class TestRunnerforWebdriverListner {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Instantiate your Logging listener
       LoggingListner listener = new LoggingListner();

        // Decorate the original driver
         driver = new EventFiringDecorator<>(listener).decorate(driver);

        // Run tests using the decorated driver instance
        driver.get("https://www.demoblaze.com/");
        WebElement button = driver.findElement(By.id("login2"));
        button.click();
        driver.quit();
    }
}
