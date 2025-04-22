package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.util.List;

public class tc_005Page {
    WebDriver driver = DriverFactory.getDriver();

    public void navegarAlReporte() {
        driver.get("URL_DEL_REPORTE");
    }

    public void identificarColumnaMontoAcumulado() {
        WebElement columna = driver.findElement(By.xpath("//th[contains(text(),'Monto acumulado Folio Reserva 5401')]"));
    }

    public boolean verificarColumnaMontoAcumulado() {
        List<WebElement> montos = driver.findElements(By.xpath("//td[contains(@class, 'montoAcumulado')]"));
        double sumaAnterior = 0;
        for (WebElement monto : montos) {
            double valorActual = Double.parseDouble(monto.getText());
            if (valorActual < sumaAnterior) {
                return false;
            }
            sumaAnterior += valorActual;
        }
        return true;
    }

    public boolean verificarCalculoCumulativoEnFilas() {
        // Implementación adicional si se requiere verificar con filas específicas
        // Utilizar un algoritmo similar al anterior y retornar verdadero o falso
        return true;
    }
}