Feature: Verify correct data extraction from BaNCS

  Scenario: Execute export operation with data from BaNCS
    Given I am on the export data page
    When I trigger the export operation with BaNCS data
    Then the report should contain all entries from the BaNCS dataset without omissions