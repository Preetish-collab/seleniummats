package seleniumprac;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class LinksPrint {
    public static WebDriver driver;
    @Test
    public void printwebLinks() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        Actions actions=new Actions(driver);
        int linkcount=0;
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            if(!link.getText().equals("")){
                System.out.println(link.getAttribute("href"));
                linkcount++;
            }

            System.out.println(link.getText());
        }
        System.out.println("Total Links::: "+linkcount);
        WebElement mobtab=driver.findElement(By.xpath("//a[text()='Mobiles']"));
        actions.keyDown(Keys.CONTROL)
                .sendKeys(Keys.F5)
                .keyUp(Keys.CONTROL)
                .build().perform();
        Thread.sleep(4000);
          actions.moveToElement(mobtab).build().perform();
        //  actions.contextClick(mobtab).build().perform();
          actions.doubleClick(mobtab).build().perform();
          File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        DateFormat df = new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
        Date d=new Date();
        String time=df.format(d);

        Thread.sleep(6000);
        FileUtils.copyFile(f, new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\screenshot\\scrtest_"+time+".png"));
    }
}
