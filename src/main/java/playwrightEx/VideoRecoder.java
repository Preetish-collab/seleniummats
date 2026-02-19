package playwrightEx;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class VideoRecoder {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        BrowserContext context=browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(1000, 800).setRecordVideoDir(Paths.get("videos/")));
        page = context.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        page.waitForTimeout(5000);
        page.locator("#email1").clear();
        page.locator("#email1").fill("adminpreet@email.com");
        page.waitForTimeout(3000);
        page.locator("css=input[name='password1']").clear();
        page.locator("css=input[name='password1']").fill("admin123");
        String path=page.video().path().toString();
        System.out.println("Video recorded at: "+path);
        page.waitForTimeout(3000);
        page.close();
        context.close();
        browser.close();

    }}
