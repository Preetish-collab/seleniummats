package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelReader {
    public static WebDriver driver;
    @Test(dataProvider = "testdata")
    public void setup(String Username,String Password) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys(Username);
        driver.findElement(By.name("password")).sendKeys(Password);
    }

    @DataProvider(name="testdata")
    public Object[][] readExcelData() throws IOException, InvalidFormatException {
        File frc=new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\Testdata.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(frc);
        XSSFSheet sh=wb.getSheetAt(0);
        int totalrows=sh.getPhysicalNumberOfRows();
        int totalcols=sh.getRow(0).getPhysicalNumberOfCells();
       String Data[][]=new String[totalrows][totalcols];
        for (int i=0;i<totalrows;i++){
            for (int j=0;j<totalcols;j++){
                Data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        wb.close();
        return Data;

    }
}
