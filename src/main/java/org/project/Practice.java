package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class Practice{
    //    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("Hey I am Before Suite");
//    }
//
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("Hey I am After Suite");
//    }
//
//
//
//    @BeforeTest
//    public void beforeTest(){
//        System.out.println("Hey I am Before Test");
//    }
//
//    @AfterTest
//    public void afterTest(){
//        System.out.println("Hey I am After Test");
//    }
//
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("Hey I am Before Class");
//    }
//
//    @AfterClass
//    public void afterClass(){
//        System.out.println("Hey I am After Class");
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("Hey I am Before Method");
//    }
//
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("Hey I am After Method");
//    }
//
//    @Test
//    public void test1(){
//        System.out.println("Hey I am Test1");
//    }
//
//    @Test
//    public void test2(){
//        System.out.println("Hey I am Test2");
//    } //o/p-Hey I am Before Suite
//Hey I am Before Test
//Hey I am Before Class
//Hey I am Before Method
//Hey I am Test1
//Hey I am After Method
//Hey I am Before Method
//Hey I am Test2
//Hey I am After Method
//Hey I am After Class
//Hey I am After Test
//Hey I am After Suite
    public static   WebDriver driver;
    @Parameters("browser")
    @BeforeTest
    public void browserSession(String browser){
        if (browser.equals("chrome")){
            {
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                System.out.println("Chrome Browser session started");
            }
        }
        else if (browser.equals("edge")){
            {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                driver.manage().window().maximize();
                System.out.println("Edge Browser session started");
            }
        }
            else if (browser.equals("safari")){

                {
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    driver.manage().window().maximize();
                    System.out.println("Safari Browser session started");
                }
        }



    }
    @Test(priority =2,groups = {"Regression"})
    public void test1(){
        driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/");
        String title1= driver.getTitle();
        System.out.println(title1);
    }

    @Test(priority=1,groups = {"Sanity","Regression"})//enabled = false)
    public void test2() {
        driver.get("https://selectorshub.com/xpath-practice-page");
       String title2= driver.getTitle();
       System.out.println(title2);
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Browser session closed");
    }
}
