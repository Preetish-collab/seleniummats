package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class DropdownEx {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        WebElement countrydd=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select sel=new Select(countrydd);
        //sel.selectByIndex(3);
        //sel.selectByValue("china");
       // sel.selectByVisibleText("India");
      // WebElement ele= sel.getFirstSelectedOption();// select first option
       // System.out.println(ele.getText());
     // List< WebElement> items=sel.getAllSelectedOptions();
       // for(WebElement w:items){
        //    System.out.println(w.getText());
       //
        List<WebElement> alloptions=sel.getOptions();
        for(WebElement w:alloptions){
            System.out.println(w.getText());
        } }}





