package playwrightEx;

import com.microsoft.playwright.*;

public class DragDrop {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
        page = browser.newPage();
        page.navigate("https://jqueryui.com/droppable/");
        FrameLocator frame = page.frameLocator(".demo-frame");
        //frame.locator("#draggable").dragTo(frame.locator("#droppable"));
        // use mouse events to perform drag and drop
        frame.locator("#draggable").hover();
        page.mouse().down();
        frame.locator("#droppable").hover();
        page.mouse().up();
}}
