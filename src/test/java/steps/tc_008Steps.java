import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page reportPage = new tc_008Page();

    @Given("I have exported the report as an Excel file")
    public void i_have_exported_the_report_as_an_excel_file() {
        // Simulate action to ensure that the Excel file is exported
        reportPage.exportReportAsExcel();
    }

    @When("I open the Excel file")
    public void i_open_the_excel_file() {
        // Open the Excel file
        reportPage.openExcelFile();
    }

    @Then("the header format should be consistent")
    public void the_header_format_should_be_consistent() {
        // Verify if header format is consistent
        Assert.assertTrue("Header format is not consistent", reportPage.isHeaderFormatConsistent());
    }

    @Then("the column alignment should meet the required presentation standards")
    public void the_column_alignment_should_meet_the_required_presentation_standards() {
        // Verify if column alignment meets standards
        Assert.assertTrue("Column alignment does not meet required standards", reportPage.isColumnAlignmentCorrect());
    }
}