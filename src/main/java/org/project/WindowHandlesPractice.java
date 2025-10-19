package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;

public class WindowHandlesPractice {
    public static WebDriver driver;


    public static void closeWindow(WebDriver driver,String data){
        Set<String>windows=driver.getWindowHandles();
        for(String str : windows){
            driver.switchTo().window(str);
            String title=driver.getTitle();
            if(title.equals(data)){
//                DateFormat df=new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
//                Date d=new Date();
//                String time=df.format(d);
//                File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                Utils.copy(f,new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\Screenshots\\"+time+));
                driver.quit();
            }
        }

    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//button[text()='New Window']")).click();
        WindowHandlesPractice.closeWindow(driver,"demoqa.com/sample-Google Chrome");






    }





}
