package org.project;

import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(priority = 1)
    public void testA() {
        System.out.println("This is Test A");
    }
    @Test(priority = 2)
    public void testB() {
        System.out.println("This is Test B");
    }
    @Test(priority = -1,enabled = false)
    public void testC() {
        System.out.println("This is Test C");
    }
}
