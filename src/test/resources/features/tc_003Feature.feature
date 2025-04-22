Feature: Confirmar inserción de la columna 'Estado Código'

  Scenario: Verificar la columna 'Estado Código' en el archivo Excel exportado 
    Given el archivo Excel ha sido exportado con éxito 
    When inspecciono las columnas del archivo Excel 
    Then debería observar la columna 'Estado Código' inmediatamente a la derecha de la columna 'i'