package clase3.archivo;

public class TXT extends Archivo {
	
	public TXT() {
		this.tipo="txt";
	}

	public TXT(String nombre, long tamaño) {
		super();
		/* setNombre(nombre);
		setTamaño(tamaño);
		*/
		this.tipo="txt";
		this.nombre=nombre;
		this.tamaño=tamaño;
		
	}
}
