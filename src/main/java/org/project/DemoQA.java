package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
        driver.findElement(By.xpath("//span[text()='Frames']")).click();
        driver.switchTo().frame("frame2");

}
}
