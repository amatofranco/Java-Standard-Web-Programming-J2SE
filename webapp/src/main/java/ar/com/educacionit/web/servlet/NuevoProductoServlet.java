package ar.com.educacionit.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.dtos.LoginDto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.web.model.LoginModel;
import ar.educacionit.web.servlet.LoginService;
import ar.educacionit.web.servlet.LoginServiceImpl;

@WebServlet(urlPatterns = "/nuevoProducto")
public class NuevoProductoServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//obtener los parametros que viene en el request
		String descripcion = req.getParameter("descripcion");
		
		String precio = req.getParameter("precio");
		
		String codigo = req.getParameter("codigo");
		
		String tipoProducto = req.getParameter("tipoProducto");
		
		
		
		
		//creo nuevo producto, solo acá!!! no existe en db
  		Producto nuevoProducto = new Producto(descripcion, Float.parseFloat(precio), codigo);
  		nuevoProducto.setTipoProducto(Long.parseLong(tipoProducto));
  		
  		ProductoServices ps = new ProductoServicesImpl();
  		
  		
  		try {
  			ps.nuevoProducto(nuevoProducto);
  			req.getSession().setAttribute("productos", ps.findProductos());
  			
		} catch (ServiceException e) {
			
			req.setAttribute("Error", e.getMessage());
  			}
  		
		
  		RequestDispatcher rd = req.getRequestDispatcher("listado.jsp");
		
		rd.forward(req, resp);
	}
}

