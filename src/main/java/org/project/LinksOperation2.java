package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksOperation2 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        String title=driver.getTitle();
        System.out.println("Title of the page: "+title);
//        if(title.equals("Electronics, Cars, Fashion, Collectibles & More | eBay")){
//            System.out.println("Title is correct");
//        }
//        else {
//            System.out.println("Title is incorrect");
//        }
        List<WebElement>links=driver.findElements(By.xpath("//ul[@class='vl-flyout-nav__container']/li/a"));
        System.out.println("Total number of links: "+links.size());
        int count=0;
        for(WebElement ele:links){
            if(!ele.getText().equals("")){
                System.out.println(ele.getAttribute("href"));
                count++;
            }
            System.out.println(ele.getText());

        }

    }
}