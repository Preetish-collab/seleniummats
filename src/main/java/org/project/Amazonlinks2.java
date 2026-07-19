package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Amazonlinks2 {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.amazon.in");   // Replace with your URL

        // Step 1: Capture all links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Step 2: Store href values (Avoid Stale Element)
        List<String> urls = new ArrayList<>();

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                urls.add(url);
            }
        }

        System.out.println("Total Links Found: " + urls.size());

        String parentWindow = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Step 3: Open each link in new tab
        for (String url : urls) {

            // Open new tab
            js.executeScript("window.open(arguments[0], '_blank');", url);

            // Step 4: Switch to new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabs.size() - 1));

            // Do validations here
            System.out.println("Title: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());

            Thread.sleep(2000); // Only for demo (use explicit wait in real project)

            // Close child tab
            driver.close();

            // Switch back to parent
            driver.switchTo().window(parentWindow);
        }

        driver.quit();
    }
}
