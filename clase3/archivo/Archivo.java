package clase3.archivo;

public class Archivo {
	
	protected String tipo;
	protected long tamaño;
	protected String nombre;
	
	//contrtuctor
	
	public Archivo() {
	}

	public Archivo(String tipo, long tamaño, String nombre) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Archivo [tipo=" + tipo + ", tamaño=" + tamaño + ", nombre=" + nombre + "]";
	};
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getTamaño() {
		return tamaño;
	}

	public void setTamaño(long tamaño) {
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
	
	

}
