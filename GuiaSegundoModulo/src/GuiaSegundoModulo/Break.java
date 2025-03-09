package GuiaSegundoModulo;

public class Break {
	public static void main(String args[])
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Dentro del ciclo");
			break;
			
				
		}
		System.out.println("Fuera del ciclo");
		// En este caso como es break el ciclo no llega a 10 (i < 10) sino a maximo 2 porque break detiene la ejecución del ciclo y	salta a la primera línea del programa tras el ciclo a diferencia de continue (ver siguiente ejercicio).
			
	}

}
