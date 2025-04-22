Feature: Validación del cálculo cumulativo en 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar cálculo cumulativo en la columna correspondiente
    Given que el usuario tiene acceso al reporte con 'Monto acumulado Folio Reserva 5401'
    When el usuario identifica la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna muestra la suma acumulada de los montos correspondientes
    And el usuario verifica el cálculo acumulativo en filas de ejemplo
    Then el valor acumulado es correcto y refleja la sumatoria progresiva de los montos