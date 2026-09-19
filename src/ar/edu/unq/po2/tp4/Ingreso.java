package ar.edu.unq.po2.tp4;

public class Ingreso {

		private String mes;
		private String concepto;
		private Double monto;

public Ingreso(String mes, String concepto, Double monto) {
			
		 this.mes = mes;
		 this.concepto = concepto;
		 this.monto = monto;
		}

public Double getMonto() {
	return monto;
}

public double getMontoImponible() {
	
	return monto;
}

}


