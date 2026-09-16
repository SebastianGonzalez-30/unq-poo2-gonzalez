package ar.edu.unq.po2.tp3;

public class Punto {

	private float x;
	private float y;
	
	public Punto(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
	    this(0, 0); // si no se le pasan valores los por defecto son 0 0
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void moverPunto(float nuevaX, float nuevaY) {
		
		this.setX(nuevaX);
		this.setY(nuevaY);
	}
	
	public Punto sumarCon(Punto otroPunto) {
		
		float nuevaX= this.getX() + otroPunto.getX();
		float nuevaY= this.getY() + otroPunto.getY();
		
		return new Punto(nuevaX, nuevaY);
	}
}


