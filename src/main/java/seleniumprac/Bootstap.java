package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bootstap {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
      driver.findElement(By.xpath("//button[@id='menu1']")).click();
        List<WebElement> dd=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement ele:dd){
//          System.out.println("Values are "+ele.getText());
//          if(ele.getText().contentEquals("JavaScript")){
//              ele.click();
//              break;
//          }

            System.out.println("Values are "+ele.getAttribute("innerHTML"));
         if(ele.getAttribute("innerHTML").contentEquals("JavaScript")){
              ele.click();
             break;
         }
      }
    }
}
