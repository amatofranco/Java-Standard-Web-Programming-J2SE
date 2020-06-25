package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;


@WebServlet(urlPatterns =  "/listado") //ubicacion del servlet donde se va a escribir

public class ListadoProductosServlet extends HttpServlet{ //convertimos la clase en Servlet
	
    ProductoServices ps = new ProductoServicesImpl();

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Pepe");
		nombres.add("Cacho");
		
		req.setAttribute("nombres", nombres);
		
			
		// guardar informacion en un request, para mostrarlo en jsp
		
		req.setAttribute("nombre", "Franco");
		req.setAttribute("edad", "27");
		
		//traslada el request + response a listado.jsp
		
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
		
		
	}

}
