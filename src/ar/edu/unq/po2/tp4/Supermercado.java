package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaProductos;
	
	
	public Supermercado(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaProductos = new ArrayList<Producto>(); //para no declararlo como parametro y exponer la logica de funcionamiento del supermercado
	}

	public int getCantidadDeProductos() {
		
		return listaProductos.size();
	}

	public void agregarProducto(Producto producto) {

		this.listaProductos.add(producto);
		
	}

	public Double getPrecioTotal() {
		
		double precioHastaAhora= 0;
		
		for(Producto productoARevisar: this.listaProductos) {
			
			
			precioHastaAhora= precioHastaAhora + productoARevisar.getPrecio();
		}
		
		return precioHastaAhora;
	}

	
}
