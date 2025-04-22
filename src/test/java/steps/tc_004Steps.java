package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page;

    @Given("I have exported the Excel file")
    public void i_have_exported_the_excel_file() {
        page = new tc_004Page();
        page.exportExcelFile();
    }

    @When("I review the 'estado' fields in the Excel")
    public void i_review_the_estado_fields_in_the_excel() {
        page.reviewEstadoFields();
    }

    @Then("The calculations should reflect the modifications and align with accounting specifications")
    public void the_calculations_should_reflect_the_modifications_and_align_with_accounting_specifications() {
        assertTrue("Calculations are incorrect or not aligned with specifications", page.verifyCalculationsAlignment());
    }
}