Feature: Verificar la robustez de la funcionalidad de exportación ante datos atípicos

  Scenario: Generación de llave concatenada y manejo de datos anómalos
    Given el usuario está en la página de exportación de datos
    When el usuario envía datos de prueba con valores extremos y vacíos en las columnas D, H, U, O y E
    Then la llave concatenada se genera correctamente sin errores
    And el reporte maneja los datos anómalos de forma segura