package ar.com.educacionit.web.servlet.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loadArchivoServlet")

public class LoadArchivoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		// Object file =req.getParameter("file"); como tomcat no puede por defecto leer archivos fuera del directorio; lo vamos a hacer de esta manera (con el archivo copiado en el directorio:)
		
		String filePath = getServletContext().getRealPath("nuevos-productos.csv");
		
		
		File inputFile = new File(filePath); //file para referenciar al archivo dentro de la aplicacion
		
		//leer archivo
		
		FileReader lectorDeArchivo = new FileReader(inputFile);
		
		//logica de lectura
		
		int unCaracter;
		
		System.out.println("leyendo archivo nuevos-productos.csv");
		
		// mientras siga existiendo caracteres; seguir leyendo. (Lee caracter por caracter del archivo csv). Esta en int porque por el codigo ascii, todas los caracteres que existen entran dentro de un entero
		
		while ( (unCaracter = lectorDeArchivo.read()) != -1) {
			
			System.out.print((char)unCaracter); //para leerlo, pasamos el int a char
		}
		
		//cerramos el lector para no bloquear el file
		lectorDeArchivo.close();
		
	}

}
