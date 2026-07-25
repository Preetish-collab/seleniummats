package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavaScriptExecutorDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //For Input Type
        driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
        WebElement pass=  driver.findElement(By.id("pass"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled');", pass);
       pass.sendKeys("selenium");

        //Checkbox
//        driver.get("file:///C:/Users/Preetish/OneDrive/Desktop/disablecheckbox.html");
//        WebElement chbox=  driver.findElement(By.id("myCheckbox"));
//        js.executeScript("arguments[0].removeAttribute('disabled');",chbox);
//        chbox.click();

    }
}
