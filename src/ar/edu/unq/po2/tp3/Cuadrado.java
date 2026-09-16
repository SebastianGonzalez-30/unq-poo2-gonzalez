package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto esquina, float lado) {
		super(esquina, new Punto(esquina.getX() + lado, esquina.getY() + lado));
	
	}
	
}
