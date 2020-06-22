package ar.com.educacionit.ui.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.ui.Alta;
import ar.com.educacionit.ui.Ejecutable;

public class EncoladorProductoMain {
	
	private static ProductoServices ps = new ProductoServicesImpl();

	public static void main(String[] args) throws ServiceException {

		
		// Creacion de la Queue - La clase producto implementa COMPARABLE y es en base al precio (La cola ordena por menor precio)
		Queue<Producto> colaDeProductos = new PriorityQueue<>();
		
		// carga
		Scanner teclado = new Scanner(System.in);

		for (int i= 0; i<4;i++) {
			
	  		  		
	  		System.out.print("Codigo: ");
	  		String codigo = teclado.next();
	  		
	  		System.out.print("Precio: ");
	  		Float precio = teclado.nextFloat();
	  		
	  		System.out.print("Descripcion : ");
	  		String descripcion = teclado.next();
	  		
	  		//creo nuevo producto, solo acá!!! no existe en db
	  		Producto nuevoProducto = new Producto(descripcion, precio, codigo);
	  		colaDeProductos.offer(nuevoProducto);  		
		}
		
		//recorrer la cola
		
		Iterator<Producto> it = colaDeProductos.iterator();
		while (it.hasNext()) {
			//desencolar
			
			System.out.println("El siguiente es: "+colaDeProductos.peek()); // muestra el producto
			Producto siguiente = colaDeProductos.poll(); // lo toma
			
			ps.nuevoProducto(siguiente);
			System.out.println("Producto insertado");
			System.out.println("Quedan: "+ colaDeProductos.toString());
			
		}
	}

}
