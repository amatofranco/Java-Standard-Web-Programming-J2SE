package clase4.laboratorio;

public class Telefono {
	
	private int id;
	private String tipo;
	private String numero;
	
	public Telefono(int id, String tipo, String numero) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
	

}
