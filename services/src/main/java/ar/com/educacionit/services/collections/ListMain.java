package ar.com.educacionit.services.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ListMain {

	public static void main(String[] args) throws ServiceException {
		// TODO Auto-generated method stub
		
		ProductoServices service = new ProductoServicesImpl();
		
		Collection<Producto> productos = service.findProductos();
		
		List<Integer> lista = new ArrayList<>() ;//Una vez "tipada" la lista, no se puede poner otro tipo de dato.(En este caso int)
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(30);
		
		//recorrer la lista
		
		Iterator <Integer> listaEnteros = lista.iterator(); //la lista de enteros devuelve una interfaz (iterator)
		
		
		while (listaEnteros.hasNext()) { //Mientras la lista tenga valor en cada posicion...
			
			Integer valor = listaEnteros.next(); //cada posicion se guarda en variable valor
			System.out.println(valor);
		}
		
		// Eliminar la coleccion (iterando)
		
		listaEnteros = lista.iterator(); //reiniciamos el iterador
		
			while (listaEnteros.hasNext()) { //Mientras la lista tenga valor en cada posicion...
				Integer valor = listaEnteros.next(); //toma el el elemento de la lista
				listaEnteros.remove(); // elimina el elemento vuelve al while
			
			}
			
			Collection<Integer> lista2 = new HashSet<>() ;//SET no admite duplicado (no va a guardar dos variables que digan 30 (List SI!) Collecion es de donde heredan list y set
			lista2.add(10);
			lista2.add(20);
			lista2.add(30);
			lista2.add(30);
			lista2.add(30);
			
			//recorrer la lista
			
			Iterator <Integer> listaEnteros2 = lista2.iterator(); //la lista de enteros devuelve una interfaz (iterator)
			
			System.out.println("Recorrido del vector");
			
			while (listaEnteros2.hasNext()) { //Mientras la lista tenga valor en cada posicion...
				
				Integer valor2 = listaEnteros2.next(); //cada posicion se guarda en variable valor
				System.out.println(valor2);
			}
			
			System.out.println("Antes de ordenar");
			System.out.println(lista2);
			
			//Ordenar el hashset (no se ordena solo)
			
			lista2 = new ArrayList<Integer>(lista2);
			
			Collections.sort((List)lista2); //Casteamos para que sea tipo lista y ahi lo va a ordenar.
			
			System.out.println("Despues de ordenar");
			System.out.println(lista2);
			
			

	}

}
