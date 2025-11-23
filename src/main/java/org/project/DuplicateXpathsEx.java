package org.project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DuplicateXpathsEx {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.in/");
        List<WebElement> ele=driver.findElements(By.xpath("//a[@class='rt']"));
        System.out.println(ele.size());
        ele.get(3).click();
    }
}
