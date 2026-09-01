package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Amazonlinks {
public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // Set ChromeDriver path
        WebDriverManager.chromedriver().setup();

        // Launch Browser
        driver = new ChromeDriver();

        // Open Application
        driver.get("https://www.amazon.in");

        // Maximize window
        driver.manage().window().maximize();

        // Get all links on page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        // Loop through each link
        for (int i = 0; i < links.size(); i++) {

            // Re-locate elements to avoid StaleElementReferenceException
            links = driver.findElements(By.tagName("a"));

            WebElement link = links.get(i);

            String linkText = link.getText();
            String linkURL = link.getAttribute("href");

            System.out.println("Clicking Link: " + linkText + " | URL: " + linkURL);

            if (linkURL != null && !linkURL.isEmpty()) {

                link.click();

                // Wait for page load
                Thread.sleep(2000);

                // Navigate back
                driver.navigate().back();

                Thread.sleep(2000);
            }
        }

        // Close browser
        driver.quit();
    }
        }

