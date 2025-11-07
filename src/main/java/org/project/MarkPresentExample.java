package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MarkPresentExample {
    public static WebDriver driver;

    public static void main(String[] args) {
        // Set the ChromeDriver path if not in PATH
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open your test page
        driver.get("https://letcode.in/table"); // or your actual URL

        // Locate the table
        WebElement table = driver.findElement(By.id("simpletable"));
        // Get all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(rows.size());

        // Loop through rows
        for (int i = 1; i < rows.size(); i++) {  // Skip header row
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            String firstName = cols.get(0).getText();
            String lastName = cols.get(1).getText();

            if (firstName.equalsIgnoreCase("Yashwanth") && lastName.equalsIgnoreCase("Raj")) {

                // Click the checkbox in the 4th column
                WebElement checkbox = cols.get(3).findElement(By.tagName("input"));
                if (!checkbox.isSelected()) {

                    checkbox.click();
                }
                System.out.println("Marked " + firstName + " " + lastName + " as Present.");
                break;

            }
        }
        // Optional: Wait and close
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}