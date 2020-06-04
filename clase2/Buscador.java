package clase2;

public class Buscador {
	
	protected String clave;
	
	public Buscador(String clave) {
		this.clave = clave;
	}
	
	public Resultado [] buscar() { //metodo que devuelve un ARRAY de OBJETOS resultado
		String sql = "SELECT * FROM RESULTADOS WHERE TITULO LIKE '%'" + this.clave + "'%";
		
		
	Resultado result1 = new Resultado ("PROGRAMACION BASICA","FIGUEROA, LEONEL", 699F,true);
	Resultado result2 = new Resultado ("PROGRAMACION BASICA","FIGUEROA, LEONEL", 699F,true);
	Resultado result3 = new Resultado ("PROGRAMACION BASICA","FIGUEROA, LEONEL", 699F,true);
	
	Resultado[] resultados = new Resultado []{result1,result2,result3}; //array de objetos resultado
	return resultados;
	}
	
	

}
