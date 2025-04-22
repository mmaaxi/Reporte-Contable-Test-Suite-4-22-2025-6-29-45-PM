Feature: Validar la actualización en 'Monto Acumulado Folio OPC (2121)'

  Scenario: Verificar que los valores de 'Monto Acumulado Folio OPC (2121)' están actualizados
    Given el archivo Excel está abierto
    When reviso la columna 'Monto Acumulado Folio OPC (2121)'
    Then los valores están actualizados conforme a los nuevos requerimientos del cálculo

  Scenario: Comparar valores calculados con datos de entrada test
    Given tengo los valores calculados de entrada test
    When comparo con los valores actuales en Excel
    Then los valores coinciden con los cálculos esperados