package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQADemo {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/date-picker");
        driver.findElement(By.id("datePickerMonthYearInput")).click();
       WebElement today= driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div[contains(@class,'--today react-datepicker__day--weekend')]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", today);
        //Fetching the URL of the site. Tostring() change object to name
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = "+url);

        //Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName);

        //Navigate to new Page i.e to generate access page. (launch new url)
        js.executeScript("window.location = 'https://demo.guru99.com/'");
        String TitleName2 = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName2);

        //Vertical scroll down by 600  pixels
        js.executeScript("window.scrollBy(0,600)");
        System.out.println("Scrolling Successful");
        js.executeScript("alert('Welcome to ToolsQA');");

    }


}
