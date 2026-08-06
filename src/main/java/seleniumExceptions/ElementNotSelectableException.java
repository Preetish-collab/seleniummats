package seleniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementNotSelectableException {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
       WebElement selectElement=driver.findElement(By.id("select-native-1"));
       selectElement.click();
        //if disable
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("$(arguments[0]).selectmenu('enable');", selectElement);
//
//        // Now interact using Selenium's Select class
//        Select select = new Select(selectElement);
//        select.selectByVisibleText("Three");




    }


}
