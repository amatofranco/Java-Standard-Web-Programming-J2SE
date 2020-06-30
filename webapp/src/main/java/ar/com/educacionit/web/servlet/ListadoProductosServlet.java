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
	

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	    ProductoServices ps = new ProductoServicesImpl();

		try {
			
			req.getSession().setAttribute("productos", ps.findProductos());
			
		} catch (Exception e) {
			
		}
		
		
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
		
		
	}

}
