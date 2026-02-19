package playwrightEx;

import com.microsoft.playwright.*;
import gherkin.lexer.Pa;

import java.util.List;

public class WindowHandle {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;
    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        BrowserContext context=browser.newContext();
        page = context.newPage();
        page.navigate("https://freelance-learn-automation.vercel.app/login");
        Locator allLinks=page.locator("//div[@class='social']//a");
        for(int i=0;i<allLinks.count();i++) {
            allLinks.nth(i).click();
        }
        List<Page> allPages=context.pages();
        for(Page p:allPages){
            System.out.println("Page Title: "+p.title());
            if(p.title().contains("Facebook")){
            p.bringToFront();
            p.locator("//input[@name='email']").last().fill("xyz");
            break;
            }
        }
        page.bringToFront();
        page.getByPlaceholder("Enter Email").fill("selenium.com");
        context.close();
        browser.close();
}
}
