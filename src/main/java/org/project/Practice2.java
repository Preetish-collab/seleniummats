package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://dev.automationtesting.in/form");
        driver.findElement(By.name("firstName")).sendKeys("Preetish");
        driver.findElement(By.name("lastName")).sendKeys("Kumar");
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Rourkela");
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("preetishkumar@yahoo.com");

    }
}