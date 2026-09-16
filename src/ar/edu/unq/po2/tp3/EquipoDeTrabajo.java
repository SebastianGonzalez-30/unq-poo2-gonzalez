package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	private	String nombre;
	private List <Persona> integrantes = new ArrayList<>();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int edadPromedioDelGrupo() {
		
		int edadTotalHastaAhora = 0;
		
		for(Persona integrante : integrantes) {
			
			edadTotalHastaAhora= edadTotalHastaAhora + integrante.getEdad();
			
		}
		
		return edadTotalHastaAhora / integrantes.size();
	}
	
}



