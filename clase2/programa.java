package clase2;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		PlanTelefonico planBase = new PlanTelefonico();
		System.out.println(planBase); //al tener el metodo tostring no es necesario invocar ningun metodo
		
		
		PlanTelefonico planx = new PlanTelefonico(3,200,20000,"plan Z");
		
		System.out.println(planx);
		*/
		
		Buscador b = new Buscador ("");
		Resultado [] res = b.buscar(); //el metodo buscar del nuevo objeto b, va a devolver un nuevo array de objetos resultado
		
		//recorrer el vector de resultados
		
		for (Resultado aux : res) {
			System.out.println(aux);
		}
		
		
	}

}
