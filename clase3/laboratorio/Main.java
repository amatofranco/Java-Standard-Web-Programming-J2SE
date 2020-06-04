package clase3.laboratorio;

import ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Auto a = new Auto (5,5,5, "Volksvagen", "Gol", "Rojo");
		
		System.out.println(a.toString());
		
		Comprador pepe = new Comprador("Pepe", "Argento", "345644", 45.500);
		
		System.out.println(pepe.toString());
		
		Vendedor garca = new Vendedor("El","Garca","345676",50);
		
		System.out.println(garca.toString());
		
		
		/*
		 Instanciar un auto utilizando el constructor completo●
	    Informar el auto utilizando el metodo toString()●         
	    Instanciar un comprador utilizando el constructor completo●  
	    Informar el comprador utilizando el metodo toString()● 
	    Instanciar un vendedor utilizando el constructor completo● 
	    Informar el vendedor utilizando el metodo toString()
		 
		 
		 
		 */
		
		

	}

}
