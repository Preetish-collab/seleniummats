package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//close will close the current browser window opened by selenium
//quit will close all the browser windows opened by selenium
public class NavigateHist {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.navigate().to("https://selectorshub.com/xpath-practice-page");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println("page refreshed");
        driver.quit();
    }
}
