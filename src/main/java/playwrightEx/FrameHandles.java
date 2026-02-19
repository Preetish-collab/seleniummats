package playwrightEx;

import com.microsoft.playwright.*;

import java.util.List;

public class FrameHandles {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://www.redbus.in");
        page.locator("//button[@aria-label='Account']").click();
        page.locator("//button[@aria-label='Log in']").click();
        List<Frame> allFrames = page.frames();
        System.out.println("Total frames are: " + allFrames.size());
        //FrameLocator frame= page.frameLocator("xpath=//iframe[@class='modalIframe']");
        page.locator("//input[@inputmode='numeric']").fill("9876543210");



}
}
