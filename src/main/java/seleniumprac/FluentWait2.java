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
public class FluentWait2 {

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

                // Click the Start button to trigger a dynamic loading delay
                driver.findElement(By.cssSelector("#start button")).click();

                // Configure FluentWait
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(30))          // Total timeout
                        .pollingEvery(Duration.ofSeconds(2))          // Check every 2 seconds
                        .ignoring(NoSuchElementException.class);     // Ignore exception during polling

                // Wait until the element is present and visible
                WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver driver) {
                        WebElement el = driver.findElement(By.cssSelector("#finish h4"));
                        if (el.isDisplayed()) {
                            return el;
                        } else {
                            return null; // Keep polling if not visible yet
                        }
                    }
                });

                System.out.println("Text retrieved: " + element.getText());

            } finally {
                driver.quit();
            }
        }
    }

