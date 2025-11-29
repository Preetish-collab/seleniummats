package org.project;

import org.testng.annotations.Test;

public class TestNGGrouping {
    @Test(groups = {"Sanity"})
    public void testMethod1() {
        System.out.println("Executing Test Method 1 - Sanity Group");
    }
    @Test(groups = {"Regression"})
    public void testMethod2() {
        System.out.println("Executing Test Method 2 - Regression Group");
    }
    @Test(groups = {"Sanity", "Regression"})
    public void testMethod3() {
        System.out.println("Executing Test Method 3 - Sanity and Regression Groups");
    }
    @Test(groups = {"Smoke"})
    public void testMethod4() {
        System.out.println("Executing Test Method 4 - Smoke Group");
    }
    @Test(groups = {"Regression"})
    public void testMethod5() {
        System.out.println("Executing Test Method 5 - Regression Group");

    }
    @Test(groups = {"Smoke", "Sanity"})
    public void testMethod6() {
        System.out.println("Executing Test Method 6 - Smoke and Sanity Groups");
    }


}

