package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class AmazonLinksClick {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement el=driver.findElement(By.xpath("//h4[text()='Click the button below to continue shopping']//following::button[text()='Continue shopping']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",el);
        List<WebElement> links=driver.findElements(By.xpath("//li[@class='nav-li']//a"));
        System.out.println("Total number of Links available: "+links.size());
        int count=0;
        for(WebElement ele:links)
        {
            if(!ele.getText().equals("")){
                //it will print null values consisting link also
                System.out.println(ele.getAttribute("href"));
                count++;

            }
            System.out.println(ele.getText());

        }
        System.out.println("Total no. of links: "+count);


    }
}
