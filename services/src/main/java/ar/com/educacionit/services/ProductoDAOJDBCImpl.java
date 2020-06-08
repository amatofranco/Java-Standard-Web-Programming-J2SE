package ar.com.educacionit.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.jdbc.AdministradorDeConexiones;

public class ProductoDAOJDBCImpl implements ProductoDAO {

	public Producto getProducto() {
		
		try {
			Connection connection = AdministradorDeConexiones.obtenerConexion();
			
			//consulta SQL
			
			//crear la sentencia
			
			Statement st = connection.createStatement();
			
			//ejecutar la sentencia y guardarla como dato
			
			ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTO");
			
			
			// Primero debe preguntar si hay datos en ese lugar
			
				if (rs.next()) {
			
			//obtener los datos del rs (la consulta hecha)
					
					//obtener datos en columna "id"
					Long id = rs.getLong(1); //1=numero de columna
					
					//obtener datos en columna "descripcion"
					
					String descripcion = rs.getString(2);
					
					//columnas restantes
					
					Float precio = rs.getFloat(3);
					
					String codigo = rs.getString(4);
					
					//Creamos un objeto con todos los resultados
					
					Producto producto = new Producto (id, descripcion, precio, codigo);
					connection.close();
					return producto;		
				}		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		}

}
