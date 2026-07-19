package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToastEx {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codeseven.github.io/toastr/demo.html");
        //open inspect window->Go to Networktab make it 3g/slow 4g->go to performance tab->Environment
        //setting make cpu throttling->20xx slowdown-> Go to source tab run debugger and inspect element
    }
}
