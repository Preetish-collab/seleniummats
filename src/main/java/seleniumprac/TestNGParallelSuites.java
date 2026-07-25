package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGParallelSuites {
    public WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
        driver = new ChromeDriver();
    }

    @Test
    public void ChromeTestMethod()
    {

        //Initialize the chrome driver
        System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
        driver.get("https://demoblaze.com/");
        String title= driver.getTitle();
        System.out.println("Title verified in Chrome "+title);
        driver.findElement(By.xpath("//a[@id='login2']")).click();

    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
        driver.close();
    }
}
