package clase5.laboratorio;

public class FueraRangoException extends Exception {
	
	
	private String descripcion;

	public FueraRangoException(String descripcion) {
		this.descripcion=descripcion;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getDescripcion();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


	
}
