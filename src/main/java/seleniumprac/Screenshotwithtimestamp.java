package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenshotwithtimestamp {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        DateFormat df = new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
        Date d = new Date();
        String time = df.format(d);

        Thread.sleep(6000);
        FileUtils.copyFile(f, new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\screenshot\\scrtest_" + time + ".png"));
    }
}