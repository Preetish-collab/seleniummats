package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowFunctions {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
       WebElement separatewindbutton= driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
       separatewindbutton.click();
        Thread.sleep(3000);
       WebElement clickbutton=driver.findElement(By.xpath("//div[@id='Seperate']//button"));
       clickbutton.click();
        String parent=driver.getWindowHandle();
        Set<String> child=driver.getWindowHandles();
        Iterator<String>It=child.iterator();
        while(It.hasNext()){
            String schild=It.next();
            if(!parent.equals(schild)){
                driver.switchTo().window(schild);
                Thread.sleep(3000);
                System.out.println("Child Title is: "+driver.getTitle());
                driver.close();
                
            }
        }
        driver.switchTo().window(parent);
        System.out.println("Parent Title is: "+driver.getTitle());
        driver.close();
    }
}
