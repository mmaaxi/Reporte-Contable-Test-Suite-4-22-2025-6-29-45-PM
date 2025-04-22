package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page excelPage = new tc_002Page();

    @Given("el usuario abre el archivo Excel")
    public void el_usuario_abre_el_archivo_excel() {
        excelPage.abrirArchivoExcel();
    }

    @When("el usuario revisa la columna de la llave concatenada")
    public void el_usuario_revisa_la_columna_de_la_llave_concatenada() {
        excelPage.verificarColumnaLlaveConcatenada();
    }

    @Then("la columna contiene valores calculados correctamente")
    public void la_columna_contiene_valores_calculados_correctamente() {
        Assert.assertTrue(excelPage.valoresCalculadosCorrectamente());
    }

    @When("el usuario compara valores concatenados en 3 filas de ejemplo")
    public void el_usuario_compara_valores_concatenados_en_3_filas_de_ejemplo() {
        excelPage.compararValoresConcatenadosFilas();
    }

    @Then("las 3 filas muestran la concatenación correcta de los valores de las columnas D, H, U, O, E")
    public void las_3_filas_muestran_la_concatenacion_correcta_de_los_valores_de_las_columnas() {
        Assert.assertTrue(excelPage.concatenacionCorrectaEnFilasEjemplo());
    }
}