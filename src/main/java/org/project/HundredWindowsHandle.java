package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HundredWindowsHandle {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> handleList = new ArrayList<String>(handles);
        if (switchToRightWindow("demoqa.com/sample-Google Chrome", handleList)) {
            System.out.println(driver.getCurrentUrl() + "----->" + driver.getTitle());
        }
        String parentWindowID = driver.getWindowHandle();
        closeAllWindow(handleList,parentWindowID);
        switchToParentWindow(parentWindowID);
        closeAllWindow(handleList,parentWindowID);
        switchToParentWindow(parentWindowID);
        System.out.println(driver.getCurrentUrl() + "----->" + driver.getTitle());
    }
     public static void closeAllWindow(List<String>handleList, String parentWindowID) {
         for (String handle : handleList) {
             if (!handle.equals(parentWindowID)) {
                 driver.switchTo().window(handle).close();
             }
         }

     }
    public static void switchToParentWindow(String parentWindowID){
            driver.switchTo().window(parentWindowID);
        }
        public static boolean switchToRightWindow(String windowTitle,List<String> handleList){

            for (String handle:handleList){
                String actualTitle=driver.switchTo().window(handle).getTitle();
                if(actualTitle.contains(windowTitle)){
                    System.out.println("Found the right window---->"+actualTitle);
                    return true;

                }
            }
            return false;
        }


    }

