package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class NumeroConMasDigitosPares {

	
	


public NumeroConMasDigitosPares() {
	
}


public int obtenerCantidadParesDe(int numero) {
	
	int cantidadPares = 0;
	int numeroActual = numero;
	
	while(numeroActual > 0) {
		
		int ultimoDigito = numeroActual % 10;
		
		if (this.revisarSiEsPar(ultimoDigito)) { // Si el dígito es par
            cantidadPares+=1;
        }
		numeroActual = numeroActual / 10;
	}
	
	return cantidadPares;
}

private boolean revisarSiEsPar(int unNumero) {
	
	return (unNumero % 2 == 0);
}

public int numeroDeLaListaConMasPares(List<Integer> unaListaDeNumeros) {
	
	
	int numeroConMasParesHastaAhora = unaListaDeNumeros.get(0); //me da el primer elemento de la lista
	
	for (Integer numeroActual: unaListaDeNumeros) {
		
		if(this.obtenerCantidadParesDe(numeroActual) > this.obtenerCantidadParesDe(numeroConMasParesHastaAhora)) {
			
			numeroConMasParesHastaAhora = numeroActual;
		}
		
	}
	
		return numeroConMasParesHastaAhora;
}

}