package org.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnMethods {
    @Test
    public void loginTest() {
        System.out.println("This is Login Test");

    }

    @Test(dependsOnMethods = {"loginTest"})
    public void homePageTest() {
        System.out.println("This is Home Page Test");
    }

    @Test(dependsOnMethods = {"homePageTest"})
    public void searchTest() {
        Assert.fail();
        System.out.println("This is Search Test");
    }

    @Test(dependsOnMethods = {"searchTest"}, alwaysRun = true)
    public void logoutTest() {
        System.out.println("This is Logout Test");
    }
}