package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Tc_001Page;

public class tc_001Steps {
    Tc_001Page tc001Page = new Tc_001Page();

    @Given("I am on the accounting report page")
    public void iAmOnTheAccountingReportPage() {
        tc001Page.navigateToAccountingReportPage();
    }

    @When("I execute the export accounting report action")
    public void iExecuteTheExportAccountingReportAction() {
        tc001Page.clickExportToExcelButton();
    }

    @Then("the system generates the Excel file with the accounting report")
    public void theSystemGeneratesTheExcelFileWithTheAccountingReport() {
        Assert.assertTrue(tc001Page.isExcelFileGenerated());
    }

    @When("I open the generated Excel file")
    public void iOpenTheGeneratedExcelFile() {
        tc001Page.openGeneratedExcelFile();
    }

    @Then("the file opens without errors and shows the expected columns")
    public void theFileOpensWithoutErrorsAndShowsTheExpectedColumns() {
        Assert.assertTrue(tc001Page.isExcelFileDisplayedCorrectly());
    }
}