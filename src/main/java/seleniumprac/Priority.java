package seleniumprac;

import org.testng.annotations.*;

public class Priority {
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("Before Suite");
//    }
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("After Suite");
//    }
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Before Test");
//    }
//    @AfterTest
//    public void afterTest() {
//        System.out.println("After Test");
//    }
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    public void afterClass() {
//        System.out.println("After Class");
//    }
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("Before Method");
//    }
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("After Method");
//    }
//    @Test
//    public void test1() {
//        System.out.println("Test 1");
//    }
//    @Test
//    public void test2() {
//        System.out.println("Test 2");

    @Test(priority=4,groups={"smoke"})
    public void test1() {
        System.out.println("Test 1");
    }
    @Test(priority=2,groups={"regression"})
    public void test3() {
        System.out.println("Test 3");
    }
    @Test(priority=0,groups = {"smoke"})
    public void test4() {
        System.out.println("Test 4");
    }
    @Test(priority=5,groups = {"regression"})
    public void test5() {
        System.out.println("Test 5");
    }
    @Test(priority=3,groups={"smoke"})
    public void test2() {
        System.out.println("Test 2");
    }


}
