Feature: Verificación de la generación de llave concatenada en Excel

  Scenario: Verificar valores concatenados en el Excel
    Given el usuario abre el archivo Excel
    When el usuario revisa la columna de la llave concatenada
    Then la columna contiene valores calculados correctamente
    And el usuario compara valores concatenados en 3 filas de ejemplo
    Then las 3 filas muestran la concatenación correcta de los valores de las columnas D, H, U, O, E