package clase3.laboratorio;

public class Vehiculo {
	
	//AVERIGUAR SOBRE VOID
	
	protected int alto;
	protected int ancho;
	protected int largo;
	
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	public Vehiculo (int alto, int ancho, int largo) {
		this.alto=alto;
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public Vehiculo() {};

}

/*
alto, de tipo int●   
ancho, de tipo int●       
largo, de tipo int
Construir los setters y los getters de forma automática
Armar un constructor que reciba 
como parámetros los valores correspondientes a alto, ancho y largo */