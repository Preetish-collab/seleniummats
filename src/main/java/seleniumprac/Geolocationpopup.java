package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Geolocationpopup {
   public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Map<String, Object> prefs = new HashMap<>();
        // 1 = Allow, 2 = Block
        prefs.put("profile.default_content_setting_values.geolocation", 1);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html5_geolocation.asp");
        WebElement bttn=driver.findElement(By.xpath("//button[text()='Try It']"));
        bttn.click();
        Thread.sleep(3000);


    }
}
