package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionClass {
    public static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //Selection class is used to handle dropdowns in selenium
        Select sel=new Select(driver.findElement(By.id("dropdown")));


    }
}
