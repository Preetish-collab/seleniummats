package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;

public class AlertHandle {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");
        page.onDialog(dialog -> {
            String mssge = dialog.message();
            System.out.println("Alert message: " + mssge);
            Assert.assertTrue(mssge.contains("I am an alert box!"));
            dialog.accept();
        });
        page.locator("xpath=//button[normalize-space()='Show alert box']").click();
    }
}