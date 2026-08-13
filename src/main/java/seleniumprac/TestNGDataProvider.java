package seleniumprac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
public class TestNGDataProvider {
public static WebDriver driver;
@Test(dataProvider="testdata")
public void orangeHRM(String username,String password){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(username);
}
@DataProvider(name="testdata")
      public String[][] passData() throws IOException {
        File file=new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\excelread.xlsx");
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        int rowCount=sh.getPhysicalNumberOfRows();
        int colCount=sh.getRow(1).getPhysicalNumberOfCells();
        String Data[][]=new String[rowCount][colCount];
        for(int i=1;i<rowCount;i++){
            for(int j=0;j<colCount;j++){
                Data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return Data;
    }
}
