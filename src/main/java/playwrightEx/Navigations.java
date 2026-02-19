package playwrightEx;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext browserContext = playwright.chromium().launchPersistentContext(Paths.get("C:\\Users\\way2automation\\AppData\\Local\\Google\\Chrome\\User Data\\Default"), new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));


        Page page = browserContext.newPage();
        page.navigate("http://way2automation.com");
        System.out.println(page.title());

        page.navigate("http://google.com");
        page.goBack(new Page.GoBackOptions().setTimeout(500));
        Thread.sleep(1000);
        page.goForward(new Page.GoForwardOptions().setTimeout(500));
        Thread.sleep(1000);

        page.reload();


        page.close();
        browserContext.close();

        playwright.close();

    }
}
