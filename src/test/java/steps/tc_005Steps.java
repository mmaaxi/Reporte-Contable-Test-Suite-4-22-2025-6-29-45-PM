package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("que el usuario tiene acceso al reporte con 'Monto acumulado Folio Reserva 5401'")
    public void accesoAlReporte() {
        page.navegarAlReporte();
    }

    @When("el usuario identifica la columna 'Monto acumulado Folio Reserva 5401'")
    public void identificarColumnaMontoAcumulado() {
        page.identificarColumnaMontoAcumulado();
    }

    @Then("la columna muestra la suma acumulada de los montos correspondientes")
    public void verificarColumnaMontoAcumulado() {
        boolean isCumulativeCorrect = page.verificarColumnaMontoAcumulado();
        Assert.assertTrue("La suma acumulada no es correcta", isCumulativeCorrect);
    }

    @Then("el usuario verifica el cálculo cumulativo en filas de ejemplo")
    public void verificarCalculoCumulativoEnFilas() {
        boolean isCumulativeCorrectInRows = page.verificarCalculoCumulativoEnFilas();
        Assert.assertTrue("El cálculo cumulativo en filas no es correcto", isCumulativeCorrectInRows);
    }
}