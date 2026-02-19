package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class PlaywrightLocatorsDD {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    public static void main(String[] args) {

        try {
             playwright = Playwright.create();
             browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
             page = browser.newPage();
            page.navigate("https://freelance-learn-automation.vercel.app/login");
            String title = page.title();
            System.out.println("The title of the page is: " + title);
            PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
           //using id locator->#
            page.locator("#email1").clear();
            page.locator("#email1").fill("adminpreet@email.com");
            page.waitForTimeout(3000);
           // page.getByPlaceholder("Enter Email").fill("admin@123.com");
            //using css locator
            page.locator("css=input[name='password1']").clear();
            page.locator("css=input[name='password1']").fill("admin123");
            page.waitForTimeout(3000);
            //using xpath locator
            page.locator("xpath=//button[text()='Sign in']").click();
            System.out.println("Button clicked successfully");


        }
        finally {
            page.close();
            browser.close();
            playwright.close();

        }

}}
