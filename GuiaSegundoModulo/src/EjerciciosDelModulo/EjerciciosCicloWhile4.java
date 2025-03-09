package EjerciciosDelModulo;

public class EjerciciosCicloWhile4 
//Desarrollar un programa que continúe con la serie sumatoria de 11 –22 – 33 – 44. Debe mostrar únicamente los primeros 25 valores de la serie.
{
	public static void main(String args[])
	{
		//El programa declara e inicializa las variables "contador" para llevar el conteo de los números y "numero" con el primer valor de la serie (11).
		int contador = 1;
		int numero = 11;
		
		//Utiliza un ciclo while que se ejecuta hasta que el contador alcance 25.
		while (contador <= 25)
		{
			//Dentro del ciclo, imprime el número actual, incrementa el número en 11 y luego incrementa el contador.
			System.out.println("El numero actual es: "+numero);
			numero = numero +11;
			contador++;	
		}	
	}
}
