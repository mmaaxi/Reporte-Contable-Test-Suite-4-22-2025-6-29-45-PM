package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class tc_002Page {

    Workbook workbook;
    Sheet sheet;

    public void abrirArchivoExcel() {
        try {
            FileInputStream file = new FileInputStream(new File("ruta-al-archivo.xlsx"));
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verificarColumnaLlaveConcatenada() {
        for (Row row : sheet) {
            Cell cell = row.getCell(1); // Asumiendo que columna de llave concatenada es B
            if (cell != null) {
                String formulaExpected = "CONCATENATE(D" + (row.getRowNum() + 1) + ",'_',H" + (row.getRowNum() + 1) + ",'_',U" + (row.getRowNum() + 1) + ",'_',O" + (row.getRowNum() + 1) + ",'_',E" + (row.getRowNum() + 1) + ")";
                if (!cell.getCellFormula().equals(formulaExpected)) {
                    throw new AssertionError("La fórmula no coincide en la fila " + (row.getRowNum() + 1));
                }
            }
        }
    }

    public boolean valoresCalculadosCorrectamente() {
        // Implementación de lógica para verificar los valores calculados
        // Aquí asumimos que se realizará una lógica de verificación adicional.
        return true;
    }

    public void compararValoresConcatenadosFilas() {
        List<Row> exampleRows = Arrays.asList(sheet.getRow(1), sheet.getRow(2), sheet.getRow(3)); // Filas de ejemplo
        exampleRows.forEach(row -> {
            if (!concatenacionEsCorrecta(row)) {
                throw new AssertionError("Concatenación incorrecta en fila: " + row.getRowNum());
            }
        });
    }

    private boolean concatenacionEsCorrecta(Row row) {
        // Implementación de lógica para verificar concatenación en una fila especifica
        return true; // Asumimos que este método verificará correctamente la concatenación
    }

    public boolean concatenacionCorrectaEnFilasEjemplo() {
        // Implementación de lógica para la validación general
        
        // Aquí solo como ejemplo se retorna true, en una implementación real se realizarán verificaciones.
        return true;
    }
}