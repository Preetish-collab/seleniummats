package seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorException {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://google.com");

        // INCORRECT: Missing '@' before id attribute
        WebElement element = driver.findElement(By.xpath("//textarea[@title='Searchxvb']"));
         element.sendKeys("Selenium InvalidSelectorException");
        driver.quit();
    }
}
