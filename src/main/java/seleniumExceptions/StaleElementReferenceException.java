package seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaleElementReferenceException {
    public static WebDriver driver;
    public static void main(String[] args) {
         driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        // 1. Locate the element in the initial DOM
        WebElement button = driver.findElement(By.id("login2"));

        // 2. Trigger an action that refreshes or alters the DOM
        driver.navigate().refresh();

        // 3. Interacting with the old reference throws StaleElementReferenceException!
         button.click();
        // Relocate the element after the DOM refresh
//        WebElement button = driver.findElement(By.id("submit-button"));
//        button.click()

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Wait until the element is present/clickable in the fresh DOM
//        WebElement button = wait.until(
//                ExpectedConditions.elementToBeClickable(By.id("submit-button"))
//        );
//        button.click();




        driver.quit();
}}
