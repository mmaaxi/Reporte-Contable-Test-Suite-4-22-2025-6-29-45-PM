Feature: Verify state fields adjustments in calculations

  Scenario: Export Excel and verify state fields calculations
    Given I have exported the Excel file
    When I review the 'estado' fields in the Excel
    Then The calculations should reflect the modifications and align with accounting specifications