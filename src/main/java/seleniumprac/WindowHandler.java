package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandler {
public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
        String parentwindow = driver.getWindowHandle();
        Set<String>childwindow = driver.getWindowHandles();
        Iterator<String>it=childwindow.iterator();
        while(it.hasNext()){
            String childwindow1=it.next();
            if(!parentwindow.equalsIgnoreCase(childwindow1)){
                driver.switchTo().window(childwindow1);
                System.out.println("child window title is: "+driver.getTitle());
                driver.close();

    }
}
        driver.switchTo().window(parentwindow);
        System.out.println("parent window title is: "+driver.getTitle());
        driver.close();

    }

}