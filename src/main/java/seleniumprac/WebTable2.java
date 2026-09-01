package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class WebTable2 {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        List<WebElement> baseTable=driver.findElements(By.xpath("//table[@id='contactList']/tbody"));
        int rows=baseTable.get(0).findElements(By.tagName("tr")).size();
        int cols=baseTable.get(0).findElements(By.tagName("td")).size();
        System.out.println("Number of rows: "+rows);
        System.out.println("Number of columns: "+cols);
        List<WebElement>contactList=driver.findElements(By.xpath("//table[@id='contactList']/tbody/tr/td[2]"));
        for(WebElement contact:contactList){
            if(contact.getText().equals("Yoshi Tannamuri")){
                System.out.println("Yoshi Tannamuri is present in the contact list");
            }
        }
        List<WebElement>countryList=driver.findElements(By.xpath("//table[@id='contactList']/tbody/tr/td[3]"));
        for(WebElement country:countryList){
            if(country.getText().equals("Canada")){
                System.out.println("Canada is present in the country list");
            }
        }
    }
}
