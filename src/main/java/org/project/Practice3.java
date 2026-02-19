package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice3 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.flipkart.com/");
        List<WebElement> links=  driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: "+links.size());
        int count=0;
        for(WebElement link:links){
            if(!link.getText().equals(" ")){
                count++;
                System.out.println(link.getText());
            }
        }
          System.out.println("Total number of links with text: "+count);
    }
}
