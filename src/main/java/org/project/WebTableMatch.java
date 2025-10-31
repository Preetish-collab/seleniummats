package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableMatch {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://selectorshub.com/xpath-practice-page");
        List<WebElement>table=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i=1;i< table.size();i++){
            String name=table.get(i).getText();
            if (name.equals("Joe.Root")){
                System.out.println("Name matched:"+name);
                WebElement checkbox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[("+i+"+1)]/td[1]"));
                checkbox.click();
            }
        }

    }

}
