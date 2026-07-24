package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
//User ID :	mngr664265
//Password :	peduqas
public class LinksOpsSelenium {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        int linkcount = 0;
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total number of links: " + links.size());
        for (WebElement link : links) {
            if (!link.getText().equals("")) {
                System.out.println(link.getAttribute("href"));
                linkcount++;
            }
            System.out.println(link.getText());
        }
        System.out.println("Total Links::: "+linkcount);
    }
}
