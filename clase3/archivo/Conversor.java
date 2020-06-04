package clase3.archivo;

//FINAL EN CLASE = CORTA LA LINEA DE HERENCIA (NO SE PUEDE HEREDAR DE ACA, SI SE PUEDE INSTANCIAR)
public final class Conversor {
	
	
	public final static Archivo convertir (Archivo source) {
		return new TXT(source.getNombre(), source.getTamaño());
	}

}
