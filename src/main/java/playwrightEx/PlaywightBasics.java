package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywightBasics {
    public static void main(String[] args) {
        Playwright playwright=Playwright.create();
//        BrowserType.LaunchOptions lp=new BrowserType.LaunchOptions();
//        lp.setChannel("chrome");
//        lp.setHeadless(false);
 //       Browser browser=playwright.chromium().launch(lp);
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
       Page page=browser.newPage();
        page.navigate("https://www.google.com/");
        String title=page.title();
        System.out.println("The title of the page is: "+title);
        String url=page.url();
        System.out.println("The URL of the page is: "+url);
        browser.close();
        playwright.close();
    }
}
