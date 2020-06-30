package ar.com.educacionit.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ar.com.educacionit.dtos.LoginDto;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.web.model.LoginModel;
import ar.educacionit.web.servlet.LoginService;
import ar.educacionit.web.servlet.LoginServiceImpl;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

	/**
	 * Recibe los datos enviados por login.jsp
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//eliminar el valor de sesion (usuario logueado)
		
		HttpSession session = req.getSession(false); //esta en false porque la sesion ya esta creada, unicamente la elegimos
		
		session.removeAttribute("userLogueado");
		
		session.invalidate();
		
		// interfaz usada por httpservlet //

		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		
		rd.forward(req, resp);
		
	}
}

