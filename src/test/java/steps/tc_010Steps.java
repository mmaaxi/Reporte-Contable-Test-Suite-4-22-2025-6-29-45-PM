package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page financialReportPage = new tc_010Page();

    @Given("the user is on the financial report page")
    public void userIsOnFinancialReportPage() {
        financialReportPage.navigateToFinancialReportPage();
    }

    @When("the user initiates a full export of the financial report after the enhancement")
    public void userInitiatesFullExport() {
        financialReportPage.performFullExport();
    }

    @Then("all previously existing functionalities and calculations should remain operational and correct, without interference")
    public void validateFunctionalityAndCalculations() {
        Assert.assertTrue(financialReportPage.verifyFunctionalitiesAndCalculations());
    }
}