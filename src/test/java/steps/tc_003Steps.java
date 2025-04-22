package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page tcPage = new tc_003Page();

    @Given("el archivo Excel ha sido exportado con éxito")
    public void elArchivoExcelHaSidoExportadoConExito() {
        // Lógica para asegurar que el archivo Excel ha sido exportado
        Assert.assertTrue(tcPage.isExcelExportSuccessful());
    }

    @When("inspecciono las columnas del archivo Excel")
    public void inspeccionoLasColumnasDelArchivoExcel() {
        tcPage.inspectExcelColumns();
    }

    @Then("debería observar la columna 'Estado Código' inmediatamente a la derecha de la columna 'i'")
    public void deberiaObservarLaColumnaEstadoCodigo() {
        Assert.assertTrue(tcPage.isEstadoCodigoColumnCorrectlyPlaced());
    }
}