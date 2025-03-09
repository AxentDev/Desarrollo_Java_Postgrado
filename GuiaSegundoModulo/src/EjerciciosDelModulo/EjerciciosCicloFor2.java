package EjerciciosDelModulo;

public class EjerciciosCicloFor2 
{
	//Desarrollar un programa que determine los divisores de un número definido previamente.
	public static void main(String args[])
	{
		//Defino el numero
		int numero = 59;
		//Imprimo el numero
		System.out.println("Los divisores de "+numero+ " son: ");
		//Desarrollo el ciclo.
		for (int i = 1; i<= numero; i++)
		{
			//Desarrollo la condicion con la condicion de que si si es divisible por i y da 0 entonces es un divisor del numero.
			if (numero % i == 0)
			{
				//imprimo el divisor.
				System.out.println(i);
			}
			
			
		}
	}
	

}
