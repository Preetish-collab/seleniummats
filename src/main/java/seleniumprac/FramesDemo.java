package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class FramesDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());
        WebElement outerframe=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(outerframe);
        WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerFrame);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");

    }
}
