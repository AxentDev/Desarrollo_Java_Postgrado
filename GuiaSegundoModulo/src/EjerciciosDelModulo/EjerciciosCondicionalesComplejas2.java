package EjerciciosDelModulo;

public class EjerciciosCondicionalesComplejas2 
//Desarrollar un programa que, por medio de 3 números enteros, determinar cuál es el mayor.
{
	public static void main (String args[])
	{
		int numero1 = 3;
		int numero2 = 4;
		int numero3 = 5;
		
		if (numero1 > numero2 && numero1 > numero3)
		{					
			System.out.println(numero1 + " es mayor a " +numero2+ " y mayor a " +numero3);
		}
		else if (numero2 > numero1 && numero2 > numero3)
			{
				System.out.println(numero2 + " es mayor a " +numero3+ " y mayor a " +numero1);
			}
			else if (numero3 > numero2 && numero3 > numero1)
				{
					System.out.println(numero3 + " es mayor a " +numero2+ " y mayor a " +numero1);
				}
	}
}

				


