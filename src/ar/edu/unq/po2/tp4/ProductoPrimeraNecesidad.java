package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private int porcentajeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esProductoCuidado, int porcentajeDescuento) {
		
		super(nombre, precio, esProductoCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	@Override
	public double getPrecio() {
		
		return super.getPrecio() * this.descuentoPorSerPrimeraNecesidad(this.getPorcentajeDescuento());
	}
	
	public double descuentoPorSerPrimeraNecesidad(int descuentoAAplicar) {
		
		return 1.0 - (descuentoAAplicar / 100.0);
	}

	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
}


