package GuiaSegundoModulo;

public class Ejercicio1While 
{
	public static void main(String args[])
	{
		//Desarrollar un programa que imprima los números impares entre 1 y 25.

		int i = 1; //Empiezo en 1.
		while (i <= 25) //Llega hasta 25.
		{
			if (i % 2 != 0) //i % 2 calcula el resto de dividir i entre 2. Si el resto no es igual a 0 (i % 2 != 0), entonces i es un número impar.
			{
				System.out.println("Los numeros impares entre 1 y 25 son: "+i);
			}
		i++;//Con esto finalizo el ciclo incrementando hasta llegar a 25.
		}
	}
}

