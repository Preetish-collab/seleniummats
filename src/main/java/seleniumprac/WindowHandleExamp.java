package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class WindowHandleExamp {
    public static WebDriver driver;
    public static void closeWindow(WebDriver driver,String data){
        Set<String> allwindows=driver.getWindowHandles();
        for(String str :allwindows){
            driver.switchTo().window(str);
            String title=driver.getTitle();
            if(title.contains(data)){
                driver.close();
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        WebElement popupwindow=driver.findElement(By.xpath("//button[text()='Popup Windows']"));
        popupwindow.click();
        closeWindow(driver,"Selenium");
        System.out.println("selenium window closed");
        closeWindow(driver,"Fast and reliable end-to-end testing for modern web apps | Playwright");
        System.out.println("Fast and reliable window closed");
        driver.quit();
    }
}