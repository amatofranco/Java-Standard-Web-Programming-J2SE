package ar.com.educacionit.web.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.dtos.LoginDto;


@WebServlet(urlPatterns = "/login")

public class LoginServlet extends HttpServlet{

	
	/* Recibe los datos enviados por login.jsp */
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//obtener los parametros del request
	
	String user = req.getParameter("user");
			
	String password = req.getParameter("password");		
	
			
	
	// Login model
	
	LoginDto model = new LoginDto(user,password);
		
	
	super.doPost(req, resp);
}
	
	
	
}
