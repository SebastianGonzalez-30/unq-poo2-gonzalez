package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Punto primerEsquina;
	private Punto segundaEsquina;
	
	
	public Rectangulo(Punto esquina1, Punto esquina2) {
	    this.setPrimerEsquina(esquina1);
	    this.setSegundaEsquina(esquina2);
	}


	public Punto getSegundaEsquina() {
		return segundaEsquina;
	}


	public void setSegundaEsquina(Punto segundaEsquina) {
		this.segundaEsquina = segundaEsquina;
	}


	public Punto getPrimerEsquina() {
		return primerEsquina;
	}


	public void setPrimerEsquina(Punto primerEsquina) {
		this.primerEsquina = primerEsquina;
	}
	
	public float ancho() {
	    return (float) Math.abs(this.getPrimerEsquina().getX() - this.getSegundaEsquina().getX());
	}
	
	public float alto() {
	    return (float) Math.abs(this.getPrimerEsquina().getY() - this.getSegundaEsquina().getY());
	}
	
	public float area() {
		
		return this.ancho() * this.alto();
	}
	
	public float perimetro( ) {
		
		return (this.ancho() * 2) + (this.alto() * 2);
	}
	
	public String orientacion() {
		
		 if(this.alto() > this.ancho()) {
			
			return "vertical";
		} else {
			
			return "horizontal";
		}
	}
	
}



