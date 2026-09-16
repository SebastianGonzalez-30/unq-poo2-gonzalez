package ar.edu.unq.po2.tp3; //mismo paquete que counter para no tener que importar!


import static org.junit.jupiter.api.Assertions.*; //herramientas de validacion para los test!
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestContador {

	
	private Counter counter; //variable de tipo Counter llamada counter

	
	// @BeforeEach: Este método se ejecuta AUTOMÁTICAMENTE antes de cada @Test
    // Sirve para reiniciar el escenario y probar con un objeto "limpio"
	@BeforeEach
	public void setUp() throws Exception {

	counter = new Counter(); //nuevo contador!
	
	//se agregan al array list
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
}

	
	// @Test: Le avisa a JUnit que este método es una prueba ejecutable

	@Test

	public void testEvenNumbers() {
	// Getting the even occurrences
	
	int amount = counter.getEvenOcurrences();
	
	// I check the amount is the expected one
	
	assertEquals(1, amount);
	}
}