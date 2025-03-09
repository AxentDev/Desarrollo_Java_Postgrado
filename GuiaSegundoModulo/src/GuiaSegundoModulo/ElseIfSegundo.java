package GuiaSegundoModulo;

public class ElseIfSegundo {
	public static void main(String args[])
	{
		int numero = 9;
		if (numero > 0) 
		{
			if(numero >= 0 && numero <= 4) 
			{
			System.out.println("Numero de bajo valor " +numero);
			}
			else if (numero >= 5 && numero <= 8)
			{
			System.out.println("Numero de valor medio " +numero);
			}
			else if (numero >= 9 && numero <= 14)
			{
			System.out.println("Numero de valor alto " +numero);
			}
			
		}
		else
		{
		System.out.println("Es un numero negativo <0: " +numero);
		}
			
	}

}
