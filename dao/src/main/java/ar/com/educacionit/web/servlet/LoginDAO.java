package ar.com.educacionit.web.servlet;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.dtos.LoginDto;

public interface LoginDAO {
	
	boolean loguear(LoginDto loginDto) throws GenericException;

}
