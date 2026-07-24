package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class Fluentwaitconcept {
    public static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://example.com/file-download");

            driver.findElement(By.id("download-button")).click();

            // Configure Fluent Wait: 30s max timeout, poll every 2s, ignore NoSuchElementException
            Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);

            // Custom condition: Wait until the status text changes to "Completed"
            WebElement statusElement = fluentWait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    WebElement element = driver.findElement(By.id("download-status"));
                    String statusText = element.getText();

                    if (statusText.equalsIgnoreCase("Completed")) {
                        return element; // Return the element when condition is met
                    } else {
                        System.out.println("Current status: " + statusText + " - Retrying...");
                        return null; // Keep polling until non-null is returned or timeout occurs
                    }
                }
            });

            System.out.println("Final Status: " + statusElement.getText());

        } finally {
            driver.quit();
        }
    }
}
