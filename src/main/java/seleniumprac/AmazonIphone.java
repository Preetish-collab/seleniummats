package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonIphone {
    public static WebDriver driver;
    @Test
    public void search(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.amazon.com");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
            searchBox.sendKeys("Iphone 15");
            driver.findElement(By.id("nav-search-submit-button")).click();
            String targetModel = "Apple iPhone 15 Plus, 128GB, Pink - Unlocked (Renewed)";
            String titleXpath = "//h2/span[contains(text(), '" + targetModel + "')]";
            WebElement modelElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(titleXpath)));

            String actualTitle = modelElement.getText();
            System.out.println("Model Found: " + actualTitle);
            String priceXpath = titleXpath + "/ancestor::div[contains(@data-component-type, 's-search-result')]//span[@class='a-price']";

            WebElement priceElement = driver.findElement(By.xpath(priceXpath));
            String rawPrice = priceElement.getText().replace("\n", "."); // Handles split whole and fractional price layout

            System.out.println("Price for " + actualTitle + " : " + rawPrice);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    }

