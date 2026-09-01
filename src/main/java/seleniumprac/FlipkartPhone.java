package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class FlipkartPhone {
    public static WebDriver driver;
    @Test
    public void flipkartPhone() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        Thread.sleep(3000L);
        searchBox.sendKeys("Iphone14");
        searchBox.sendKeys(Keys.ENTER);
//        String modelName="Apple iPhone 14 ((PRODUCT)RED, 256 GB)";
        File file=new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\flipkartphone.xlsx");
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        int rowCount=sh.getPhysicalNumberOfRows();
        for(int i=1;i<rowCount;i++){
            int colCount=sh.getRow(i).getPhysicalNumberOfCells();
            for(int j=0;j<colCount;j++){
                XSSFCell modelName=sh.getRow(i).getCell(j);
                if (modelName == null || modelName.getCellType() == CellType.BLANK) {
                    continue;
                }
                String cost= driver.findElement(By.xpath(("//*[text()='"+modelName+"']/parent::div/parent::div/child::div[@class='col col-5-12 mao5dl']/descendant::div[@class='hZ3P6w DeU9vF']"))).getText();
                System.out.println("Price for "+modelName+" : "+cost);
            }

    }

    }
}
