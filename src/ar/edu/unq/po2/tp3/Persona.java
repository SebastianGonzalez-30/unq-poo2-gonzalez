package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {

	private String nombre;
	private int edad;
	private Date fechaDeNacimiento; 
	

	public Persona(String nombre, Date fechaDeNacimiento) {
	    this.setNombre(nombre);
	    this.setFechaDeNacimiento(fechaDeNacimiento);
	}
	
	
	public boolean menorQue(Persona persona) {
		
		return(this.getEdad() < persona.getEdad());
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
