package ar.educacionit.web.servlet;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.dtos.LoginDto;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.web.servlet.LoginDAO;
import ar.com.educacionit.web.servlet.LoginDAOJDBCImpl;

public class LoginServiceImpl implements LoginService{

	
	private LoginDAO loginDao;
	
	public LoginServiceImpl() {
		this.loginDao = new LoginDAOJDBCImpl();
	}
	
	@Override
	public boolean login(LoginDto loginDto) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			return loginDao.loguear(loginDto);
		} catch (GenericException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage(),e);
		}
	}

	
}
