package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavascriptExecutorEx {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       driver.navigate().to("https://www.quackit.com/html/html_editors/scratchpad/?example=/bootstrap/bootstrap_5/tutorial/bootstrap_5_forms_checkboxes_and_radio_buttons_disabled");
//       js.executeScript("window.location='https://www.globalsqa.com/samplepagetest/';");
//       js.executeScript("document.getElementById('g2599-email').value='Preetish';");
//       for(int i=0;i<3;i++){
//           js.executeScript("window.scrollBy(0,1000);");
//       }
//       js.executeScript("history.go(0);");
//       System.out.println("Page refreshed using JavascriptExecutor");
//      WebElement ele=driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]"));
//        js.executeScript("arguments[0].click();",ele);
      WebElement checkbox= driver.findElement(By.id("exampleCheckbox1"));
        js.executeScript("arguments[0].disabled=false;",checkbox);

// Method 2: Removing the attribute entirely
 js.executeScript("arguments[0].removeAttribute('disabled');",checkbox);

// Now you can interact with it using standard Selenium methods
        checkbox.click();


        WebElement scrollableDiv = driver.findElement(By.cssSelector(".scrollable-container"));


// Scroll inside the container by 300px
        js.executeScript("arguments[0].scrollTop += 300;", scrollableDiv);

// Scroll to bottom of the container
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollableDiv);

}}
