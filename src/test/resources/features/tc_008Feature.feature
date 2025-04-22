Feature: Validate the integrity and format of the exported report

  Scenario: Check Excel file format for header consistency and column alignment
    Given I have exported the report as an Excel file
    When I open the Excel file
    Then the header format should be consistent
    And the column alignment should meet the required presentation standards