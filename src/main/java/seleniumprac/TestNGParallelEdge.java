package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGParallelEdge {
    public static WebDriver driver;
    @Test
    public void EdgeTest() {
        //Initializing the edge driver
         driver = new EdgeDriver();
         driver.get("https://demoblaze.com/");
        String title= driver.getTitle();
        System.out.println("Title verified in Edge "+title);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.quit();
    }

}
