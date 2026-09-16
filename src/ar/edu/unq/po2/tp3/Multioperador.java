package ar.edu.unq.po2.tp3;
import java.util.List;



public class Multioperador {

	
	
	public int sumarEnterosDeLaLista(List<Integer> unaListaDeNumeros) {
		
		int resultadoTotal = 0;
		
		for(Integer numeroActual: unaListaDeNumeros) {
			
			resultadoTotal = resultadoTotal + numeroActual;
		}
		
		return resultadoTotal;
	}
	
	public int restarEnterosDeLaLista(List <Integer> unaListaDeNumeros) {
		
		int resultadoTotal = unaListaDeNumeros.get(0);
		
		for (int i = 1; i < unaListaDeNumeros.size(); i++) {
			
			resultadoTotal = resultadoTotal - unaListaDeNumeros.get(i);
		}
		
		return resultadoTotal;
	}
	
	public int multiplicarEnterosDeLaLista(List <Integer> unaListaDeNumeros) {
		
		int resultadoTotal = 1;
		
		for(Integer numeroActual: unaListaDeNumeros) {
			
			resultadoTotal = resultadoTotal * numeroActual;
		}
		
		return resultadoTotal;
	}
}
