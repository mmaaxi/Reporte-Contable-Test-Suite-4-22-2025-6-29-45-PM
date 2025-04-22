package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class tc_006Page {

    private Workbook workbook;
    private Sheet sheet;

    public void abrirArchivoExcel() {
        try {
            FileInputStream file = new FileInputStream("ruta/del/archivo/ejemplo.xlsx");
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void revisarColumna() {
        // Lógica para verificar los valores en la columna específica.
    }

    public boolean valoresActualizados() {
        // Lógica para comprobar que los valores están actualizados.
        return true; // Retornar el resultado del chequeo del valor.
    }

    public void obtenerValoresCalculados() {
        // Lógica para obtener los valores de entrada calculados
    }

    public void compararConValoresExcel() {
        // Lógica para la comparación de valores
    }

    public boolean coincidenValores() {
        // Lógica para comprobar que los valores coincidan
        return true;  // Retornar el resultado de la comparación.
    }
}