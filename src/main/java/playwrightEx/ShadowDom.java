package playwrightEx;

import com.microsoft.playwright.*;

public class ShadowDom {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://selectorshub.com/xpath-practice-page/");
        //make sure shadow root=open if closed you can't access the elements inside shadow dom
        //Accessing shadow DOM element
         Locator shadowRoot=page.locator("div#userName");
         Locator shadowInput=shadowRoot.locator("input#kils");
            shadowInput.fill("Admin");
    }
}