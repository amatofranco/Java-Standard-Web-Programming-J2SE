package clase3.laboratorio;

public class Comprador extends Persona {
	
	
	public Comprador(String nombre, String apellido, String numeroDocumento, double presupuesto) {
		super(nombre, apellido, numeroDocumento);
		this.presupuesto = presupuesto;
	}

	private double presupuesto;
	
	public Comprador() {
		
	}


	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}


	@Override
	public String toString() {
		return "Comprador [presupuesto=" + presupuesto + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", numeroDocumento=" + numeroDocumento + "]";
	}
	

	
	
}
