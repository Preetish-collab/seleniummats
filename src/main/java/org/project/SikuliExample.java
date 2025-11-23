package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliExample {
    public static WebDriver driver;
    public static Screen screen;
    public static String imagepath = "E:\\sikuli\\";
    public static void main(String[] args) throws FindFailed {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        try {
            Thread.sleep(3000);
             screen = new Screen();
        } catch (NumberFormatException | InterruptedException e) {
            e.printStackTrace();
            Pattern image1 = new Pattern(imagepath + "Gmail.png");

            screen.wait(image1, 10);
            screen.click(image1);



        }









    }
}