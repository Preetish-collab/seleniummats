package playwrightEx;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class PlaywrightDDRadioChbox {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    public static void main(String[] args) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
            page = browser.newPage();
            page.navigate("https://freelance-learn-automation.vercel.app/login");
            page.getByText("New user? Signup").click();
//            page.pause();//use for debugger
            PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isDisabled();
            page.locator("#name").fill("Preetish Kataria");
            page.getByPlaceholder("Email").fill("preetishrandom123@gmail.com");
           page.locator("input[name='password']").fill("Preetish@123");
           page.locator("xpath=//label[text()='Selenium']//preceding::input[1]").click();
           PlaywrightAssertions.assertThat(page.locator("xpath=//label[text()='Selenium']//preceding::input[1]")).isChecked();
           page.locator("#state").selectOption("Odisha");
           String hobbies[]={"Reading","Playing"};
           page.locator("#hobbies").selectOption(hobbies);
           PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isEnabled();
    }}
