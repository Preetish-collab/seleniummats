package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.testng.Assert;

import java.util.regex.Pattern;

public class CapturetextHandleAssertions {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        page.locator(".submit-btn").click();
        String expectedError = "Email and Password is required";
        String actualmsg = page.locator(".errorMessage").textContent();
        Assert.assertEquals(actualmsg,expectedError);
        Assert.assertTrue(actualmsg.contains("Password is required"),"Error message validation passed");
        PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText("Email and Password is required");
        PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(Pattern.compile("required"));
        System.out.println("Playwright assertion passed with pattern");
//        String msgNew = page.locator(".errorMessage").innerText();
//        System.out.println("Error message using innerText: " + msgNew);
//        String msgviaJS= page.evaluate("document.getElementsByClassName('errorMessage')[0].textContent").toString();
//        System.out.println("Error message using JS Executor: " + msgviaJS);
//        if (msg.equals(expectedError)) {
//            System.out.println("Error message validation passed");
//        } else {
//            System.out.println("Error message validation failed");
//
//        }
        page.close();
        browser.close();
        playwright.close();
    }
}