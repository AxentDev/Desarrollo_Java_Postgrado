package GuiaSegundoModulo;

public class Continue 
{
	public static void main(String args[])
	{
		for (int i = 0; i < 5; i++)
		{
			if (i == 3)
			{
				continue; //Como es continue, como i<5 el ciclo no se ejecuta mas de 5 veces aunque diga 9, si se cambia a menos de 5 en i==, es decir i==4, i==3, i==2, i==1, el ciclo llega maximo a 4. De 5 en adelante el maximo de ciclos es 5.
			}
		
		System.out.println("El valor esta en el ciclo");
		
		}
		
	}

}
