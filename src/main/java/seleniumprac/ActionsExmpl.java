package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExmpl {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions act=new Actions(driver);
        Thread.sleep(3000);
//        act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
//        System.out.println("Page refreshed using Actions class");
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//          act.moveToElement(gmailLink).build().perform();

   //     act.contextClick(gmailLink).doubleClick().build().perform();

//        WebElement drag=driver.findElement(By.xpath("//a[text()='Store']"));
//        WebElement drop=driver.findElement(By.xpath("//textarea[@name='q']"));
//        act.dragAndDrop(drag,drop).build().perform();



    }
}
