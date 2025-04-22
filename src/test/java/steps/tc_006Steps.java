package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el archivo Excel está abierto")
    public void abrirArchivoExcel() {
        page.abrirArchivoExcel();
    }

    @When("reviso la columna 'Monto Acumulado Folio OPC \\(2121)'")
    public void revisarColumnaMontoAcumulado() {
        page.revisarColumna();
    }

    @Then("los valores están actualizados conforme a los nuevos requerimientos del cálculo")
    public void validarValoresActualizados() {
        Assert.assertTrue(page.valoresActualizados());
    }

    @Given("tengo los valores calculados de entrada test")
    public void obtenerValoresCalculados() {
        page.obtenerValoresCalculados();
    }

    @When("comparo con los valores actuales en Excel")
    public void compararConValoresExcel() {
        page.compararConValoresExcel();
    }

    @Then("los valores coinciden con los cálculos esperados")
    public void validarCoincidenciaValores() {
        Assert.assertTrue(page.coincidenValores());
    }
}