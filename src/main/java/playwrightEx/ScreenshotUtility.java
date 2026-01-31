package playwrightEx;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtility {
    public static byte[] captureScreenshot(Page page) {
        SimpleDateFormat customformat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Date date = new Date();
        String newdate = customformat.format(date);
        byte[] arr = page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("screenshot/" + newdate + ".png")));
        return arr;
    }

}