package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_009Page;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page exportPage;

    public tc_009Steps() {
        this.driver = Hooks.getDriver();
        this.exportPage = PageFactory.initElements(driver, tc_009Page.class);
    }

    @Given("el usuario está en la página de exportación de datos")
    public void el_usuario_esta_en_la_pagina_de_exportacion_de_datos() {
        exportPage.navigateToExportPage();
    }

    @When("el usuario envía datos de prueba con valores extremos y vacíos en las columnas D, H, U, O y E")
    public void el_usuario_envia_datos_de_prueba_con_valores_extremos_y_vacios() {
        exportPage.enterTestDataWithExtremeValues();
    }

    @Then("la llave concatenada se genera correctamente sin errores")
    public void la_llave_concatenada_se_genera_correctamente_sin_errores() {
        exportPage.verifyConcatenatedKeyIsGeneratedCorrectly();
    }

    @Then("el reporte maneja los datos anómalos de forma segura")
    public void el_reporte_maneja_los_datos_anomalos_de_forma_segura() {
        exportPage.verifyAnomalousDataHandling();
    }
}