//package opencart.tests;
//
//import basetest.BaseTest;
//import com.microsoft.playwright.Page;
//import opencart.pages.HomePage;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import playwrightfactory.PlaywrightFactory;
//
//public class HomePageTest extends BaseTest {
//    PlaywrightFactory pf;
//    Page page;
//    HomePage homePage;
//    @BeforeTest
//    public void setup(){
//      pf=new PlaywrightFactory();
//      page=pf.initBrowser("chromium");
//      homePage=new HomePage(page);
//    }
//    @Test
//    public void homePageTitleTest(){
//        String actualtitle=homePage.getHomePageTitle();
//        Assert.assertEquals(actualtitle,"Your Store");
//    }
//    @Test
//    public void homePageURLTest(){
//        String actualURL=homePage.getHomePageURL();
//        Assert.assertEquals(actualURL,"https://naveenautomationlabs.com/opencart/");
//    }
//    @DataProvider
//    public Object[][] getProductName(){
//        return new Object[][]{
//                {"MacBook"},
//                {"iMac"},
//                {"Samsung"}
//        };
//    }
//   @Test(dataProvider = "getProductName")
//    public void searchTest(String productName){
//        String actualSearchHeader=homePage.doSearch(productName);
//        Assert.assertEquals(actualSearchHeader,"Search - "+productName);
//    }
//
//    @AfterTest
//    public void tearDown(){
//        page.context().browser().close();
//    }
//}
