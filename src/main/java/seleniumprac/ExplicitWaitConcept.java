package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ExplicitWaitConcept{
        public static WebDriver driver;
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            try {
                driver.get("https://example.com/checkout");

                // Define Explicit Wait with a 10-second timeout
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // Scenario 1: Wait until the 'Place Order' button is clickable
                WebElement placeOrderBtn = wait.until(
                        ExpectedConditions.elementToBeClickable(By.id("place-order-btn"))
                );
                placeOrderBtn.click();

                // Scenario 2: Wait until the confirmation modal/popup becomes visible
                WebElement confirmationModal = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.id("confirmation-dialog"))
                );
                System.out.println("Modal displayed: " + confirmationModal.getText());

                // Scenario 3: Wait until page URL contains 'success'
                wait.until(ExpectedConditions.urlContains("success"));


            } finally {
                driver.quit();
            }
        }
    }

