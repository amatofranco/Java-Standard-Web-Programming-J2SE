package clase4.laboratorio;

public class Producto {
	
	private int id;
	private double precio;
	private String descripcion;
	
	public Producto(int id, double precio, String descripcion) {
		super();
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	public Producto() {
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}	
	
	

}
