package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertandFrames {
    public static WebDriver driver;
    @Test
    public void handlealertframe() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Alerts.html");
//        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
//       driver.findElement(By.xpath("//button[contains(text(),'click the button to')]")).click();
//       //alert with only ok
//        String text=driver.switchTo().alert().getText();
//        System.out.println(text);
//        driver.switchTo().alert().accept();
//        Thread.sleep(6000);
//        //alert with only ok and cancel
//        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a conf')]")).click();
//        String text1=driver.switchTo().alert().getText();
//        System.out.println(text1);
//        driver.switchTo().alert().dismiss();
//        //alert with send text
//        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate ')]")).click();
//        String text2=driver.switchTo().alert().getText();
//        System.out.println(text2);

        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
//        driver.switchTo().frame("singleframe");
//        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1234");
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        driver.switchTo().frame("Nested iFrames");
        Thread.sleep(2000);
        driver.switchTo().frame("iFrame Demo");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1234");
    }
}
