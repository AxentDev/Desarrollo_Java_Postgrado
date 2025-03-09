package GuiaSegundoModulo;

public class Ejercicio3For {
	public static void main(String args[])
	{
		//Desarrollar un programa que permita contar cuántos números entre 1 y 1000	son múltiplos de 7, mostrar el resultado final.
		
		// primero declaro la variable contador.
		int contador = 0;
		
		//luego utilizo el ciclo for.
		for (int i = 1; i<=1000; i++)
		{
			if (i % 7 == 0) 
			{
				contador++;
			}
		}
		System.out.println("Los multiplos de 7 entre 1 y 1000 son: "+contador);
	}
}
