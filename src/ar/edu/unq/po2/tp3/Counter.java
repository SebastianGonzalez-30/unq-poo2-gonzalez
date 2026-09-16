package ar.edu.unq.po2.tp3; // Mismo paquete que el test para que se "vean" entre sí
import java.util.ArrayList; // Herramienta concreta para crear la lista
import java.util.List;		// Interfaz general de listas (el "contrato")

public class Counter { //crea la clase counter

	
	
	// List<Integer>: Tipo abstracto + Generics. Solo guarda objetos Integer.
    // new ArrayList<Integer>(): La implementación concreta que asigna memoria RAM.
	private List<Integer> numbers = new ArrayList<Integer>(); // Funcionaria incluso sacandole el Integer entre los <>
	
	
	
	public Counter() { //constructor
		
		
	}
	
	public void addNumber(int i) { //"void" son las funciones en wollok que son acciones, osea no devolvian nada
		
		numbers.add(i);
		
	}

	public int getEvenOcurrences() { //esta no es void porque retorna el acumulador
			
		int acc = 0;
					//por cada Integer llamado integer dentro del array "numbers"...
		for (Integer integer: numbers) {
			
			if(integer%2 == 0) {
				
				acc+=1;
			}
		}
		
		return acc;
	}

}
