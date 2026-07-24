package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandlerIndex {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
        Set<String> windows=driver.getWindowHandles();
        ArrayList<String>al=new ArrayList<>(windows);
        driver.switchTo().window(al.get(1));
        driver.close();
        driver.switchTo().window(al.get(0));



        }
    }

