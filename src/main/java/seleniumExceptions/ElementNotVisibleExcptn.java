package seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementNotVisibleExcptn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/");

        // Create an explicit wait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Instead of just finding the element, wait until it is visibly present on the screen
            WebElement hiddenButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("submit-btn"))
            );

            hiddenButton.click();
            System.out.println("Button clicked successfully!");

        } catch (Exception e) {
            System.out.println("Element was not visible within the timeout period: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
