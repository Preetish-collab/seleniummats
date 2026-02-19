package playwrightEx;

import com.microsoft.playwright.*;

public class AutoSuggestedDD {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://www.google.com/");
        page.locator(("textarea[name='q']")).fill("mukesh otwani ");
        Locator locator=page.locator("xpath=//ul[@role='listbox']/li");
        System.out.println(locator.count());
        for(int i=0;i<locator.count();i++){
            String optionText=locator.nth(i).innerText();
            System.out.println(optionText);
            if(optionText.contains("playwright")){
                locator.nth(i).click();
                break;
            }

        }
        page.close();
        browser.close();
        playwright.close();
    }

}


