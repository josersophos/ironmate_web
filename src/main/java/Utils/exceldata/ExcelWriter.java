package Utils.exceldata;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    public void writeToExcel(List<String[]> data, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Datos");

        int rowCount = 0;

        for (String[] rowData : data) {
            Row row = sheet.createRow(rowCount++);

            int columnCount = 0;
            for (String field : rowData) {
                row.createCell(columnCount++).setCellValue(field);
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        }

        workbook.close();
    }
}
