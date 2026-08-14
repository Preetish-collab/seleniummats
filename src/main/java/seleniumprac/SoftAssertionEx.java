
//package seleniumprac;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class SoftAssertionEx {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://example.com");
//    }
//
//    @Test
//    public void testHomePageDetails() {
//        // Step 1: Create an instance of SoftAssert
//        SoftAssert softAssert = new SoftAssert();
//
//        // Check 1: Title (Intentional fail for demo)
//        String actualTitle = driver.getTitle();
//        softAssert.assertEquals(actualTitle, "Wrong Title", "Title did not match!");
//
//        // Check 2: Header text (This line still executes even if Check 1 fails)
//        String headerText = driver.findElement(By.tagName("h1")).getText();
//        softAssert.assertEquals(headerText, "Example Domain", "Header text mismatch!");
//
//        // Check 3: Current URL
//        String currentUrl = driver.getCurrentUrl();
//        softAssert.assertTrue(currentUrl.contains("example.com"), "URL check failed!");
//
//        // Step 2: Collate all assertion results
//        // This MUST be called at the very end of the test.
//        softAssert.assertAll();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
