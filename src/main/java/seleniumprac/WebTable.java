package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://qaautomationlabs.com/testing/web-table.php");
        int totalRows=driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
         int totalCols=driver.findElements(By.xpath(("//table[@id='dataTable']/tbody/tr[1]/td"))).size();
        for(int i=1;i<totalRows;i++){
            for (int j = 1; j <=totalCols; j++) {
          String xpath= "//table[@id='dataTable']/tbody/tr[" + i + "]/td[" + j + "]";
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.print(" " + cell.getText());//.trim()+ "\t | \t
//                if(cell.getText().contains("Ana Silva")){
//
//                    break;
//                }
        }
            System.out.println();
    }

    }

}
