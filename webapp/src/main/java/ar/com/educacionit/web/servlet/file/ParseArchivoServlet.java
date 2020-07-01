package ar.com.educacionit.web.servlet.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.web.servlet.parser.FileParser;

@WebServlet(urlPatterns = "/parseArchivoServlet")

public class ParseArchivoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		// Object file =req.getParameter("file"); como tomcat no puede por defecto leer archivos fuera del directorio; lo vamos a hacer de esta manera (con el archivo copiado en el directorio:)
		
		String filePath = getServletContext().getRealPath("nuevos-productos.csv");
		
		
		
		FileParser fileParser = new FileParser(filePath);
		
		//una vez obtenido el file; obtenemos objeto de lista de productos
		
		
		List<Producto> productos = fileParser.parseArchivo();
		
		//grabar los productos
		
		ProductoServices ps = new ProductoServicesImpl();
		
		
		List<Producto> listadoOK = new ArrayList<Producto>();
		List<Producto> listadoFAIL = new ArrayList<Producto>();
		
		
		
		
		for (Producto producto: productos ) {
		
			try {
				ps.nuevoProducto(producto);
				listadoOK.add(producto);
				} catch (ServiceException e) {
				listadoFAIL.add(producto);
				}
		
		}
		
		// guardar en request las dos listas
		
		req.setAttribute("listadoOK", listadoOK);
		req.getSession().setAttribute("listadoFail", listadoFAIL); //getSession para guardar el dato y enviarlo al servlet de archivo de error
		
		
		RequestDispatcher rd = req.getRequestDispatcher("listadoGeneral.jsp");
		
		rd.forward(req, resp); //enviar al jsp
		
		
		
	}

}
