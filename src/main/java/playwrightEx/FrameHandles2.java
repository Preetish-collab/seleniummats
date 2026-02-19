package playwrightEx;

import com.microsoft.playwright.*;

public class FrameHandles2 {
    public static void main(String[] args) {


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

        page.frameLocator("[name='iframeResult']").locator("body > button").click();

        Locator frames = page.locator("iframe");

        System.out.println(frames.count());



        for(int i=0; i<frames.count(); i++) {

            System.out.println(frames.nth(i).getAttribute("id"));

        }



    }

}
