package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavascriptExecutorEx {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.location='https://www.globalsqa.com/samplepagetest/';");
       js.executeScript("document.getElementById('g2599-email').value='Preetish';");
       for(int i=0;i<3;i++){
           js.executeScript("window.scrollBy(0,1000);");
       }
       js.executeScript("history.go(0);");
       System.out.println("Page refreshed using JavascriptExecutor");
    }
}
