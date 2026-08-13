package seleniumprac;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file=new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\excelread.xlsx");
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        int rowCount=sh.getPhysicalNumberOfRows();
        for(int i=1;i<rowCount;i++){
            int colCount=sh.getRow(i).getPhysicalNumberOfCells();
            for(int j=0;j<colCount;j++){
                XSSFCell cell=sh.getRow(i).getCell(j);

                System.out.print("  "+cell);
            }
            System.out.println();
        }
    }
}
