package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class TestUsingPOM {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    @Test
    public void LoginTest() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
        page = browser.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(page);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickSubmit();


    }
}
