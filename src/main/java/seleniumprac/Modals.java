package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Modals {
    public static WebDriver driver;

    @Test
    public void handlingModals() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Modals.html");
        WebElement modal=driver.findElement(By.xpath("//*[text()='Multiple Modals']/following::div/a[text()='Launch modal']"));
        modal.click();

        WebElement firstmodal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='First Modal']/following::a[text()='Launch modal']")));
       firstmodal.click();

       WebElement secondmodal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Modal 2']/following::a[text()='Save changes']")));
       secondmodal.click();


    }
}