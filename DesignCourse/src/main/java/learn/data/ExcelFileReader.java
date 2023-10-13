package learn.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelFileReader {


    public String getData(int rowNum, int cellNum) throws IOException {
        Workbook workbook = new XSSFWorkbook(new FileInputStream("./src/main/resources/excelData.xlsx"));
        // Get the worksheet that you want to read from
        Sheet worksheet = workbook.getSheetAt(0);
        // Get the cell that contains the value that you want to read
        Cell cell = worksheet.getRow(rowNum).getCell(cellNum);
        // Close the workbook
        workbook.close();
        // Get the value of the cell
        return cell.getStringCellValue();
    }

}