package ar.educacionit.web.servlet;

import ar.com.educacionit.dtos.LoginDto;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface LoginService {

	boolean login(LoginDto loginDto) throws ServiceException;

}
