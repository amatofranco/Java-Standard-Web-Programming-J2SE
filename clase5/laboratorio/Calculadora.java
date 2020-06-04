package clase5.laboratorio;

public class Calculadora{
	
	public static int sumar (int a, int b) throws FueraRangoException {
		
		if (a < 0 || a > 1000) {
			
			throw new FueraRangoException ("el valor esta fuera de rango (0-1000)");
			
		}
		
		
		if (b < 0 || b > 1000) {
			
			throw new FueraRangoException ("el valor esta fuera de rango (0-1000)");
			
		}
		
		
		
		return a+b;
	}
	
	public static int restar (int a, int b) throws FueraRangoException {
		
		
		if (a < 0 || b < 0) {
			
			throw new FueraRangoException ("algun valor es menor a 0");
			
		}
		
		
		if (((a - b)<0)) {
			
			throw new FueraRangoException ("la resta es menor a 0");
			
		}
		
		
		return a-b;
	}
	
	public static void main(String[] args) {
		
	//completar con try catch
		int res = 0;
		try {
			res = Calculadora.sumar(1, -1);
		} catch (FueraRangoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(res);
	}

}
