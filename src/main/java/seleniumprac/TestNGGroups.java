package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGroups {


    @Test(groups = {"regression1"})
    public void starting_point_regression(){
       System.out.println("This is Starting of regression");
    }


    @Test(groups = { "regression2" })
    public void checkTitle_regression2() {
      System.out.println("Title Checking for regression");
    }

    @Test(groups = { "regression3" })
    public void enterCreds_regression3() {
      System.out.println("Credentials Passed for regression");
    }

    @Test(groups = {"smoke1"})
    public void starting_point_smoke1(){
        System.out.println("This is Starting of smoke");
    }


    @Test(groups = { "smoke2" })
    public void checkTitle_smoke2() {
        System.out.println("Title Checking for smoke2");
    }

    @Test(groups = { "smoke3" })
    public void enterCreds_smoke3() {
        System.out.println("Credentials Passed for smoke");
    }
}
