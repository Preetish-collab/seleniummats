package playwrightEx;

import com.microsoft.playwright.*;

import java.nio.file.Paths;
import java.util.Base64;

public class Screenshot {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://selectorshub.com/xpath-practice-page/");
        //specific element screenshot
       // page.locator("//span[contains(text(),'Help?')]").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("Helpscreenshot.png")));
       // byte[] arr= page.screenshot();
       // System.out.println("Screenshot captured with byte size: " + arr.length);
       //byte[] arr= page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("Pwscreenshot.png")));
       // System.out.println(Base64.getEncoder().encodeToString(arr));

        ScreenshotUtility.captureScreenshot(page);
        page.close();
        browser.close();
        playwright.close();
    }
}