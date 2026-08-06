package seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionNotFoundException {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        WebElement button = driver.findElement(By.id("login2"));
        driver.close();
        button.click(); // This will throw SessionNotFoundException or NoSuchSessionException because the session is closed
    }
}