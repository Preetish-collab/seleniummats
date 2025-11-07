package org.project;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class PriceTotalCheck {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/table");

        // Locate all price cells except the total row
        List<WebElement> priceElements = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));

        int calculatedTotal = 0;

        // Loop through all price elements and sum them
        for (WebElement price : priceElements) {
            String priceText = price.getText().trim();
            int value = Integer.parseInt(priceText);
            calculatedTotal += value;
        }

        // Get the displayed total from the table
        WebElement totalElement = driver.findElement(By.xpath("//table[@id='shopping']/tbody/tr/td/following::tfoot/tr/td/b"));
        int displayedTotal = Integer.parseInt(totalElement.getText().trim());

        // Compare both totals
        if (calculatedTotal == displayedTotal) {
            System.out.println("Total is correct: " + displayedTotal);
        } else {
            System.out.println("Total is incorrect! Calculated: " + calculatedTotal + ", Displayed: " + displayedTotal);
        }

        // Close browser
        driver.quit();
    }
    }


