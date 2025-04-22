package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class tc_003Page {

    private File excelFile = new File("path/to/exported/excel.xlsx");

    public boolean isExcelExportSuccessful() {
        return excelFile.exists();
    }

    public void inspectExcelColumns() {
        // Lógica para inspeccionar las columnas del archivo Excel
    }

    public boolean isEstadoCodigoColumnCorrectlyPlaced() {
        try (FileInputStream fis = new FileInputStream(excelFile)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            // Se asume que revisamos la primera fila por columnas y verificamos la posición
            String expectedColumnHeader = "Estado Código";
            int expectedPosition = 9; // Columna 'j' es índice 9 (cero basado)
            return sheet.getRow(0).getCell(expectedPosition).getStringCellValue().equals(expectedColumnHeader);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}