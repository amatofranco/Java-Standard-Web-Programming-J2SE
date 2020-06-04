package clase4.laboratorio;

public class Domicilio {
	
	private int id;
	private String calle;
	private String localidad;
	private int numero;
	
	public Domicilio(int id, String calle, String localidad, int numero) {
		super();
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.numero = numero;
	}
	
	public Domicilio() {
		
	}

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", calle=" + calle + ", localidad=" + localidad + ", numero=" + numero + "]";
	}
	
	
	

}
