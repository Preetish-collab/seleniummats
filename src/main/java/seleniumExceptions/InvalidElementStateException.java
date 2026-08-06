package seleniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidElementStateException {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");

            // Locate a disabled text input field
            WebElement disabledInput = driver.findElement(By.id("textinput-1"));

            // 1. Remove 'disabled' attribute via JS
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].removeAttribute('disabled');", disabledInput);
            Thread.sleep(3000); // Just to visually confirm the change, not recommended for production code

            // 2. Clear and type into the newly enabled field
            //disabledInput.clear();
            disabledInput.sendKeys("Hello Selenium!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
