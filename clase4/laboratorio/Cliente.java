package clase4.laboratorio;

public class Cliente extends Persona {
	
	private int numeroCliente;

	
	
	public Cliente(int id, String nombre, String apellido, Telefono telofono, Domicilio domicilio, int numeroCliente) {
		super(id, nombre, apellido, telofono, domicilio);
		this.numeroCliente = numeroCliente;
	}

	public Cliente() {
		
	}

	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", telofono=" + telofono + ", domicilio=" + domicilio + "]";
	}
	
	

}
