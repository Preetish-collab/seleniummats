package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import javax.naming.ldap.Control;

public class KeyboardActions {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        page.locator("#email1").fill("admin@email.com");
        page.keyboard().down("Control");
        page.keyboard().press("A");
        page.keyboard().up("Control");
        page.keyboard().down("Control");
        page.keyboard().press("C");
        page.keyboard().up("Control");
        page.keyboard().press("Enter");
        page.keyboard().press("Tab");
        page.keyboard().down("Control");
        page.keyboard().press("V");
        page.keyboard().up("Control");

    }
}