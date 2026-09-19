package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso {

	private int cantHorasExtra;
	
	public IngresoHorasExtra(String mes, String concepto, Double monto, int cantHorasExtra) {
		
		super(mes, concepto, monto);
		this.cantHorasExtra = cantHorasExtra;
	}
	
	@Override 
	public double getMontoImponible() {
		
		return 0.0;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	
}
