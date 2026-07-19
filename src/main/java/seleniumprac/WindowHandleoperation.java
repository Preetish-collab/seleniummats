package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleoperation {
    public static WebDriver driver;
    public static void closeWindow(WebDriver driver, String data) {
            Set<String> windows = driver.getWindowHandles();
            for (String window : windows) {
                driver.switchTo().window(window);
                if (driver.getTitle().equals(data)) {
                    System.out.println("window title is: " + data);
                    driver.close();
                    break;
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.automationtesting.in/Windows.html");
            driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//button[text()='click']")).click();
            WindowHandleoperation.closeWindow(driver, "Selenium");
        }
    }
