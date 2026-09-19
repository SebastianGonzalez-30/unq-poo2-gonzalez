package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidos;
	
	
	public Trabajador() {
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	public double getTotalPercibido() {
		
		double totalPercibido= 0;
		
		for(Ingreso ingresoARevisar: this.getIngresosPercibidos()) {
			
			totalPercibido= totalPercibido + ingresoARevisar.getMonto();
		}
		return totalPercibido;
	}


	public ArrayList<Ingreso> getIngresosPercibidos() {
		return ingresosPercibidos;
	}
	
	
	public double getMontoImponible() {
		
		double totalPercibido= 0;
		
		for(Ingreso ingresoARevisar: this.getIngresosPercibidos()) {
			
			totalPercibido= totalPercibido + ingresoARevisar.getMontoImponible();
		}
		return totalPercibido;
	}
	
	
	public double getImpuestoAPagar() {
		
		return this.getMontoImponible() * 0.02;
	}


	public void agregarIngreso(Ingreso sueldoJulio) {
		
		ingresosPercibidos.add(sueldoJulio);
		
	}
}
	
	

	
