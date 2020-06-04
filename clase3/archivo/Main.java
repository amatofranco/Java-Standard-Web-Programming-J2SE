package clase3.archivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo = "txt";
		Long tamaño =1000L;
		String nombre= "file";
		
		Archivo a = new Archivo();
		a.setNombre(nombre);
		a.setTamaño(tamaño);
		a.setTipo(tipo);
		
		if("MP3".equals(a.getTipo())) {
			a = Conversor.convertir(a); //metodo de clase
		}

		System.out.println(a);
	}

}
