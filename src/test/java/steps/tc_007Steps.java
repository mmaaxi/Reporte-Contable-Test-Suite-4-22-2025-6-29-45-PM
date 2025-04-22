package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    private tc_007Page page;

    @Given("I am on the export data page")
    public void iAmOnTheExportDataPage() {
        page = new tc_007Page();
        page.navigateToExportDataPage();
    }

    @When("I trigger the export operation with BaNCS data")
    public void iTriggerTheExportOperationWithBaNCSData() {
        page.executeExportOperation();
    }

    @Then("the report should contain all entries from the BaNCS dataset without omissions")
    public void theReportShouldContainAllEntriesFromTheBaNCSDatasetWithoutOmissions() {
        boolean isDataComplete = page.verifyReportDataCompleteness();
        Assert.assertTrue("The report does not contain all entries from the BaNCS dataset", isDataComplete);
    }
}