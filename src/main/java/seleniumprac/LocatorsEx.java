package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsEx {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //Thread.sleep(4000);
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
    //driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
    //driver.findElement(By.name("btnK")).click();

//        List<WebElement> links=driver.findElements(By.tagName("a"));
//        System.out.println("Total links: "+links.size());
//        for(WebElement link:links){
//            System.out.println(link.getText());
//        }
//      driver.findElement(By.linkText("Gmail")).click();
//        driver.findElement(By.partialLinkText("Gma")).click();
//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Selenium WebDriver");// using of # for id
 //       driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("Selenium WebDriver");// using of . for class
//driver.findElement(By.cssSelector("textarea[id*='APjFqb']")).sendKeys("Selenium WebDriver");// using of * for contains
//      driver.findElement(By.cssSelector("textarea[id^='APj']")).sendKeys("SDET Pavan");// using of ^ for starts with
        driver.findElement(By.cssSelector("textarea[id$='Fqb']")).sendKeys("Selenium WebDriver");// using of $ for ends with


//        driver.quit();

    }
}