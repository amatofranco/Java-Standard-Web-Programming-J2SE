package clase4.laboratorio;

public class Main {
	

		public static void main(String[] args) {
			
			
		Telefono francoTelefono = new Telefono(011,"celular","1550765456");
		
		Domicilio francoDomicilio = new Domicilio(011, "Peña", "Banfield", 1450);
			
		Persona c = new Cliente(5, "franco", "amato", francoTelefono, francoDomicilio, 150);
		System.out.println(c.toString());
		
		Cliente a = (Cliente)c;
		
		System.out.println(Persona.hola);
		
	
		}

}


