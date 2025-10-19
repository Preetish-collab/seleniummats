package org.project;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotex {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/");
        String title1= driver.getTitle();
        System.out.println(title1);
        File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f,new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\screenshot\\scr.png"));
    }
}
