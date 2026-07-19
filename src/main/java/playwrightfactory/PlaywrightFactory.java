//package playwrightfactory;
//
//import com.microsoft.playwright.*;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PlaywrightFactory {
//    Playwright palywright;
//    Browser browser;
//    BrowserContext browserContext;
//    Page page;
//    Properties prop;
//
//    public Page initBrowser(Properties prop){
//       String browserName= prop.getProperty("browser").trim();
//
//        System.out.println("Browser name is: "+browserName);
//        palywright=Playwright.create();
//        switch (browserName.toLowerCase()){
//            case "chromium":
//                browser=palywright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//                break;
//            case "firefox":
//                browser=palywright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
//                break;
//            case "webkit":
//                browser=palywright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
//                break;
//            default:
//                System.out.println("Please pass the correct browser name: "+browserName);
//                break;
//        }
//        browserContext=browser.newContext();
//        page=browserContext.newPage();
//        page.navigate(prop.getProperty("url").trim());
//        return page;
//    }
//    public Properties init_properties() throws IOException {
//        //read properties from config file
//        try {
//            FileInputStream fi = new FileInputStream("./src/test/resources/config/config.properties");
//            prop=new Properties();
//            prop.load(fi);
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//    }
//        return prop;
//    }
//}
