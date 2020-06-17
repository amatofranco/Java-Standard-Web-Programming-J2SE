package ar.com.educacionit.services.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.collections.ComparadorProductoxDescripcion;
import ar.com.educacionit.services.exceptions.ServiceException;

public class FiltradoMain {

	public static void main(String[] args) throws ServiceException {
		// TODO Auto-generated method stub

			ProductoServices ps = new ProductoServicesImpl();
			
			Collection<Producto> pds = ps.findProductos();
			
			//Filtrar los repetidos por descripcion
			
			TreeSet<Producto> pdsFiltrado = new TreeSet<Producto>(new ComparadorProductoxDescripcion());
			
			//agrego productos 
			
			pdsFiltrado.addAll(pds);
			
			System.out.println(pds);//productos originales
			
			System.out.println(pdsFiltrado);//productos filtrados
			
			// update sobre la db usando los objetos de la coleccion
			
			Iterator <Producto> itProductos = pdsFiltrado.iterator();
			
			//Subir un 15% el precio de los seleccionados
			
			while (itProductos.hasNext()) {
				Producto aux = itProductos.next(); //tomamos el primer producto
				
				Float precioActual = aux.getPrecio();
				Float nuevoPrecio = (precioActual * 1.15f);
				aux.setPrecio(nuevoPrecio);
				
				//invoco al update de mi service
				
				ps.actualizarProducto(aux);
				
				
			}
				
				System.out.println("Actualización finalizada");
				System.out.println(pdsFiltrado);

			
	}
	
		public String descripcionNueva (String descripcionOriginal) {
			return descripcionOriginal.substring(1,descripcionOriginal.length());
		}

}
