//package basetest;
//
//import com.microsoft.playwright.Page;
//import opencart.pages.HomePage;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import playwrightfactory.PlaywrightFactory;
//
//import java.util.Properties;
//
//public class BaseTest {
//    PlaywrightFactory pf;
//    Page page;
//  protected   HomePage homePage;
//    Properties prop;
//@BeforeTest
//     public void setup() throws Exception {
//         pf=new PlaywrightFactory();
//         prop=pf.init_properties();
//         page=pf.initBrowser("chromium");
//         homePage=new HomePage(page);
//     }
//
//     @AfterTest
//        public void tearDown(){
//            page.context().browser().close();
//        }
//}
