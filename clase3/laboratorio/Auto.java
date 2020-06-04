package clase3.laboratorio;

public class Auto extends Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	
	public Auto() {
	}

	public Auto(int alto, int ancho, int largo, String marca, String modelo, String color) {
		super(alto, ancho, largo);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", alto=" + alto + ", ancho="
				+ ancho + ", largo=" + largo + "]";
	}
	
	

	

}


