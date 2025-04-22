package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    private WebDriver driver;

    private By exportButton = By.id("exportFullReport");
    private By reportContent = By.id("reportContent");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFinancialReportPage() {
        driver.get("http://example.com/financial_report");
    }

    public void performFullExport() {
        WebElement exportBtn = driver.findElement(exportButton);
        exportBtn.click();
        // Wait for export process to complete if necessary
    }

    public boolean verifyFunctionalitiesAndCalculations() {
        WebElement reportElem = driver.findElement(reportContent);
        String reportData = reportElem.getText();
        // Validate data, calculations, and functionalities
        // This is a placeholder for detailed validation logic
        return reportData.contains("Expected calculation result");
    }
}