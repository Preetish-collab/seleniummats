package org.project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceTest extends BaseTestSauceL {
     @Test(priority =0)
    public void loginTest() throws Exception {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    @Test(priority =1)
    public void checkinventoryItem() throws Exception {
        loginTest();
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

//    @Test(priority =2)
//    public void checkaddtocartButton() throws Exception {
//        loginTest();
//        Assert.assertTrue(driver.findElements(By.xpath("button[text()='ADD TO CART']")).size()==6);
//    }
}
