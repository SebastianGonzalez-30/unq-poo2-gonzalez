package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


public class TestNumeroConMasDigitosPares {

    @Test
    public void testNumeroConMasDigitosPares() {
    	
        // 1. Setup: Instanciamos el objeto y preparamos la lista
        NumeroConMasDigitosPares buscador = new NumeroConMasDigitosPares();
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(123);  // 1 par (el 2)
        numeros.add(245);  // 2 pares (2 y 4)
        numeros.add(2486); // 4 pares (2, 4, 8 y 6) -> El ganador
        numeros.add(135);  // 0 pares

        // 2. Exercise: Ejecutamos el método a probar
        int resultado = buscador.numeroDeLaListaConMasPares(numeros);

        // 3. Verify: Comprobamos que el resultado esperado sea 2486
        assertEquals(2486, resultado);
    }
}