package seleniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementNotSelectedExctn {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10-second explicit wait

        try {
            driver.get("https://getbootstrap.com/docs/5.0/forms/checks-radios/");

            // Wait until the element is visible and selectable
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkboxId")));

            // Perform actions on the element
            checkbox.click();
        } catch (Exception e) {
            System.out.println("Element not selectable: " + e.getMessage());
        }
        }

    }

