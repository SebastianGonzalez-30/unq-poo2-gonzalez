package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMultioperador {

    private Multioperador multioperador;
    private List<Integer> misNumeros;

    @BeforeEach
    public void setUp() {
        // Arrange general: Se ejecuta antes de cada @Test
        multioperador = new Multioperador();
        misNumeros = new ArrayList<>();
        
        // Cargamos una lista de prueba: [10, 2, 3]
        misNumeros.add(10);
        misNumeros.add(2);
        misNumeros.add(3);
    }

    @Test
    public void testSumarEnterosDeLaLista() {
        // Act
        int resultado = multioperador.sumarEnterosDeLaLista(misNumeros);

        // Assert: 10 + 2 + 3 = 15
        assertEquals(15, resultado);
    }

    @Test
    public void testRestarEnterosDeLaLista() {
        // Act
        int resultado = multioperador.restarEnterosDeLaLista(misNumeros);

        // Assert: 10 - 2 - 3 = 5
        assertEquals(5, resultado);
    }

    @Test
    public void testMultiplicarEnterosDeLaLista() {
        // Act
        int resultado = multioperador.multiplicarEnterosDeLaLista(misNumeros);

        // Assert: 10 * 2 * 3 = 60
        assertEquals(60, resultado);
    }
}