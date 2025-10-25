package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("ABCD");
        driver.findElement(By.id("lastName")).sendKeys("XVCZ");
        driver.findElement(By.id("userEmail")).sendKeys("XVAB@klma.com");
        driver.findElement(By.id("userNumber")).sendKeys("9845464732");

    }
}