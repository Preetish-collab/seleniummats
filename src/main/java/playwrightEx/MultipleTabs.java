package playwrightEx;

import com.microsoft.playwright.*;

public class MultipleTabs {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        BrowserContext context=browser.newContext();
        page = context.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        Page newPage=context.waitForPage(()->{
            page.locator("//a[contains(@href,'facebook')]").first().click();
        });
        newPage.locator("//input[@name='email']").last().fill("xyz");
        page.bringToFront();
        newPage.bringToFront();
        page.bringToFront();
        newPage.bringToFront();
        newPage.close();
        page.close();
        context.close();
        browser.close();
}
}
