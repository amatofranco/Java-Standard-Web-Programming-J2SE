package clase4.laboratorio;

public abstract class Persona {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected Telefono telofono;
	protected Domicilio domicilio;
	static String hola = "hola";
	
	public Persona(int id, String nombre, String apellido, Telefono telofono, Domicilio domicilio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telofono = telofono;
		this.domicilio = domicilio;
	}
	
	public Persona() {
	}
	
	public String getNombreCompleto() {
		
		return convertirACapitalLetter (nombre)+","+ convertirACapitalLetter(apellido);
		
	}

	public String convertirACapitalLetter(String aux) {
		
	String nombreMinuscula = aux.substring(1, aux.length());//metodo substring toma el string como vector y elegis desde que posicion. posicion uno seria la segunda letra
	nombreMinuscula = nombreMinuscula.toLowerCase(); //por si habia mayusculas en alguna de las otras letras
	
	String primerLetra = aux.substring(0,1).toUpperCase();
	
	return primerLetra + nombreMinuscula;
	}

	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telofono=" + telofono
				+ ", domicilio=" + domicilio + "]";
	}
	
	
	
}
