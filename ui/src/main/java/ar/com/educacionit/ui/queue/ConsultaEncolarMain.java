package ar.com.educacionit.ui.queue;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ConsultaEncolarMain {
	
	private static ProductoServices ps = new ProductoServicesImpl();
	
	public static void main(String[] args) throws ServiceException {
		
		Collection<Producto> productos = ps.findProductos();
		
		Queue<Producto> productosConPrioridad = new PriorityQueue(productos);
		
		System.out.println("Lista original: "+productos);
		System.out.println("Lista con prioridad: "+productosConPrioridad);
	}

}
