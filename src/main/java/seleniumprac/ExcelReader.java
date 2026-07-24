package seleniumprac;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        File file=new File("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\Testdata.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh=wb.getSheetAt(0);
        int rowCount=sh.getPhysicalNumberOfRows();
        for(int i=0;i<rowCount;i++){
            int colCount=sh.getRow(i).getPhysicalNumberOfCells();
            for(int j=0;j<colCount;j++){
                XSSFCell cell=sh.getRow(i).getCell(j);
                System.out.println(" "+cell);
            }
        }
    }
}
