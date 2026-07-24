package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClassEx {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Actions actions=new Actions(driver);

        WebElement ele= driver.findElement(By.xpath("//input[@id='imagesrc']"));
        Thread.sleep(4000);
        String filepath="C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\SarojResume.pdf";
        StringSelection selection=new StringSelection(filepath);
        actions.click(ele).build().perform();
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Robot robot=new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        //mouse
        robot.mouseMove(650,420);
        robot.delay(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//press left click
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//release left key
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);//press right click

    }
}
