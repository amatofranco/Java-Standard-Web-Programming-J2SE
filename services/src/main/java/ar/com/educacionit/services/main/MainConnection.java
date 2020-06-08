package ar.com.educacionit.services.main;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoDAO;
import ar.com.educacionit.services.ProductoDAOJDBCImpl;

public class MainConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductoDAO pdao = new ProductoDAOJDBCImpl();
		Producto producto = pdao.getProducto();
		System.out.println(producto);

	}

}
