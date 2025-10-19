package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowFunctions {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
       WebElement button= driver.findElement(By.xpath("//button[text()='New Window']"));
       button.click();
        String parent=driver.getWindowHandle();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String>It=s1.iterator();
        while(It.hasNext()){
            String Child=It.next();
            if(!parent.equals(Child)){
                Thread.sleep(4000);
                System.out.println(driver.switchTo().window(Child).getTitle());
                driver.close();
                
            }
        }
        driver.switchTo().window(parent);
    }
}
