Feature: Export Accounting Report to Excel

  Scenario: Validate export of accounting report in Excel
    Given I am on the accounting report page
    When I execute the export accounting report action
    Then the system generates the Excel file with the accounting report
    When I open the generated Excel file
    Then the file opens without errors and shows the expected columns