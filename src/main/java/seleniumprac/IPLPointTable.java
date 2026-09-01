package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class IPLPointTable {
    public static WebDriver driver;
    @Test
    public void ipltableData() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/cricket-series/9241/indian-premier-league-2026/points-table");
        List<WebElement> teams=driver.findElements(By.xpath("//*[@class='wb:p-3']//div[contains(@class,'grid point-table-grid p-2 ')]/descendant::div[contains(@class,'flex flex-row items-ce')]/span[1][position()=1]"));
        List<WebElement> loose=driver.findElements(By.xpath("//*[@class='wb:p-3']//div[contains(@class,'grid point-table-grid p-2 ')]/descendant::div[contains(@class,'flex flex-row items-ce')]/span[1]/following::div[contains(@class,'flex justify-start items-center')][position()=3]"));
        System.out.println("Teams in IPL 2026");
        for (int i = 0; i < teams.size(); i++) {
            String teamName = teams.get(i).getText();
            String teamLoss = loose.get(i).getText();
            System.out.println(teamName + " : " + teamLoss);
        }

        driver.quit();

        }
    }
