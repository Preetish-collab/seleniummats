package playwrightEx;

import com.microsoft.playwright.*;

public class Sliders {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
        page = browser.newPage();
        page.navigate("https://jqueryui.com/slider/");
        FrameLocator frame = page.frameLocator(".demo-frame");
        Locator slider = frame.locator("//span[contains(@class,'ui-slider-handle')]");
        slider.focus();
        for(int i=0; i<10; i++) {
            slider.press("ArrowRight");
        }
}}
