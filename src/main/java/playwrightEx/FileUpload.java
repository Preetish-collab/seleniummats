package playwrightEx;

import com.microsoft.playwright.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUpload {
    public static Browser browser = null;
    public static Page page = null;
    public static Playwright playwright = null;

    public static void main(String[] args) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        page = browser.newPage();
        page.navigate("https://testpages.herokuapp.com/pages/files/file-upload/");
        //Single file upload
      //  page.locator("xpath=//input[@id='fileinput']").setInputFiles(Path.of("\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\SarojResume.pdf"));
 //       page.locator("xpath=//input[@id='fileinput']").setInputFiles(Path.of(System.getProperty("user.dir") + "\\src\\main\\resources\\SarojResume.pdf"));
//       //For multiple file upload
//        Path[] files={
//                Path.of(System.getProperty("user.dir") + "\\src\\main\\resources\\SarojResume.pdf"),
//                Path.of(System.getProperty("user.dir") + "\\src\\main\\resources\\Testdata.xlsx")
//        };
//        page.locator("xpath=//input[@id='fileinput']").setInputFiles(files);


        //use of filechooser
    FileChooser filechooser=page.waitForFileChooser(() -> page.locator("xpath=//div[text()='Drag & Drop your file here or click to upload']").click());
        filechooser.setFiles(Paths.get("\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\Testdata.xlsx"));

//   //multiple files using filechooser
//Path[]filestoupload={
//        Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\SarojResume.pdf"),
//        Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\Testdata.xlsx")
//};
//filechooser.setFiles(filestoupload);
}}
