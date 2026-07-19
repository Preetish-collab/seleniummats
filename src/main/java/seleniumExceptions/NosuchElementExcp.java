package seleniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NosuchElementExcp {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/");
        driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='First Nme']")).sendKeys("Preetish");
    }
}
