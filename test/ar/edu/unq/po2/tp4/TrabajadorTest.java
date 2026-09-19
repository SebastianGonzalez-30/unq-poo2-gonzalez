package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

    private Trabajador trabajador;
    private Ingreso sueldoJulio;
    private Ingreso sueldoAgosto;
    private IngresoHorasExtra horasExtrasJulio;

    @BeforeEach
    void setUp() {
        trabajador = new Trabajador();

        // Ingresos normales
        sueldoJulio = new Ingreso("Julio", "Sueldo basico", 100000.0);
        sueldoAgosto = new Ingreso("Agosto", "Sueldo basico", 100000.0);

        // Ingreso por horas extras (monto = 20000, 5 horas extra)
        horasExtrasJulio = new IngresoHorasExtra("Julio", "Horas extras", 20000.0, 5);

        // Carga de ingresos al trabajador
        trabajador.agregarIngreso(sueldoJulio);
        trabajador.agregarIngreso(sueldoAgosto);
        trabajador.agregarIngreso(horasExtrasJulio);
    }

    @Test
    void testGetTotalPercibido() {
        // Suma todo: 100000 + 100000 + 20000 = 220000.0
        assertEquals(220000.0, trabajador.getTotalPercibido());
    }

    @Test
    void testGetMontoImponible() {
        // Excluye las horas extras: 100000 + 100000 = 200000.0
        assertEquals(200000.0, trabajador.getMontoImponible());
    }

    @Test
    void testGetImpuestoAPagar() {
        // El 2% de 200000.0 imponible = 4000.0
        assertEquals(4000.0, trabajador.getImpuestoAPagar());
    }

    @Test
    void testIngresoHorasExtraMontoImponibleEsCero() {
        // Verifica que la hora extra responda 0.0 al monto imponible directamente
        assertEquals(0.0, horasExtrasJulio.getMontoImponible());
        // Pero conserve su monto cobrado real
        assertEquals(20000.0, horasExtrasJulio.getMonto());
    }
}