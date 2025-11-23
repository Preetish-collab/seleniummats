package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragDropEx {
public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.id("droppableExample-tab-revertable")).click();
        boolean b=  driver.findElement(By.id("revertableDropContainer")).isDisplayed();
        System.out.println("The value represents::  "+b);
        Actions act=new Actions(driver);
        WebElement drag=driver.findElement(By.xpath("//div[@id='revertable']"));
        Thread.sleep(2000L);
        WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
        Thread.sleep(2000L);
        act.clickAndHold(drag).moveToElement(drop).build().perform();


    }
}