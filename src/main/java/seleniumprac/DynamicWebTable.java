package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable {
    //public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
        //driver.manage().window().maximize();


        driver.get("https://practice.expandtesting.com/dynamic-table");
        WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for(WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
        //for (int i = 0; i < rows.size(); i++) {

            //for (int j = 0; j < cols.size(); j++) {
               // String cellValue = table.findElements(By.tagName("tr")).get(i).findElements(By.tagName("td")).get(j).getText();
               for(WebElement col : cols) {
                String cellValue = col.getText();
                if (cellValue.equals("Chrome")) {
                    System.out.println("Chrome is present in the table");
                }
            }

        }

    }}
