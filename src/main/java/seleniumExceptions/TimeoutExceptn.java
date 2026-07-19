package seleniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeoutExceptn {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobile");

//xpath for search button
        WebElement search = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        search.click();

    }
}
