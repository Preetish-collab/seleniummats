package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().refresh();
        String title1=driver.getTitle();
        System.out.println(title1);
        driver.navigate().back();
        String title2=driver.getTitle();
        System.out.println(title2);
        driver.navigate().forward();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(4000);
        driver.close();

    }}