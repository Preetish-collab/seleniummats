package playwrightEx;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.regex.Pattern;

public class TraceViewer {
    @Test
    public void loginTest(){
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        BrowserContext context=browser.newContext();
        context.tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)
                .setSnapshots(true)
                .setSources(true));
        Page page = context.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        page.locator("#email1").fill("preetishrandom123@gmail.com");
        page.locator("#password1").fill("Preetish@123");
        page.locator("xpath=//button[text()='Sign in']").click();
        PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome");
        page.getByAltText("menu").click();
        page.getByText("Sign Out").click();
        PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
        context.tracing().stop(new Tracing.StopOptions()
                .setPath(Paths.get("Trace/trace.zip")));
        page.close();
        browser.close();


    }
}
