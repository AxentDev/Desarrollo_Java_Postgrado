package GuiaSegundoModulo;

public class EjercicioCafe {
	public static void main(String Args[]) {
		String respuesta1 = "Si";//Se puede cambiar el si por un no para comprobar el ejercicio del cafe.
		String respuesta2 = "Si";//Se puede cambiar el si por un no para comprobar el ejercicio del cafe.
		System.out.println("- ¿Quieres un café? ");
		System.out.println("* " + respuesta1);
		if (respuesta1 == "Si")//Ojo entre parentesis todo despues del if en caso que diga que si. 
		{
			System.out.println("- ¿Vas a comprarlo? ");
			if(respuesta2 =="Si")//en caso que diga que si. 
			{
				System.out.println("* "+respuesta2);
				System.out.println("- Comprar Café");
			}
			else//en caso que diga que no. 
			{
				System.out.println("* " + respuesta2);
				System.out.println("- Haz el Café");
			}
			System.out.println("- Bebe el Café");
		}
		else
		{
		System.out.println("- Sigue estudiando");
		}
	}

}
