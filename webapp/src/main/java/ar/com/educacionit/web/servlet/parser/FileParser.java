package ar.com.educacionit.web.servlet.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class FileParser {
	
	private String nombre;
	
	public FileParser (String nombreArchivo) {
		
		this.nombre = nombreArchivo;
	}
	
	public List<Producto> parseArchivo() throws IOException {
		
		List<Producto> listado = new ArrayList<Producto>();
		
		File file = new File(this.nombre);
		
		FileReader fileReader = new FileReader(file);
		
		// Buffer : lectura o escritura mas optima (cargar en memoria previamente)
		
		//control + t = mostrar linea de herencia (shortcut);
		
		BufferedReader bufferReader = new BufferedReader(fileReader); //un buffer recibe como parametro cualquier cosa que sea Reader
		
		String lineaLeida = null; //el reader va a leer hasya el salto de linea del archivo csv
		
		//logica de lectura
		
		boolean primerLinea = true; //separar la primer linea porque es la de las descripciones y no los productos en si mismo
		
		
		
		while((lineaLeida = bufferReader.readLine()) != null) { //mientras siga habiendo lineas
			
			if(!primerLinea) {
			
			//codigo;descripcion;precio;tipo_producto
			
			String [] array = lineaLeida.split(";"); //dividir el array de linea leida por el ;
			Producto producto = new Producto(array[1],Float.parseFloat(array[2]), array[0]);
			producto.setTipoProducto(Long.parseLong(array[3])); // lo ponemos aparte porque no esta en el constructor de producto
			
			listado.add(producto);
			
			
			}else {
				primerLinea = false;
			}		
			
			
		}
		
		bufferReader.close();
		
		return listado;
		
	}

}
