package EjerciciosDelModulo;

public class EjerciciosCicloFor3 
{
	//Desarrollar un programa que permita definir si un número entero ya establecido es un número perfecto o no.
	//Compara la suma de los divisores propios con el número. Si la suma de sus divisores es igual al numero dividendo, es un número perfecto.
	public static void main(String args[])
	{
		//Definir el número: La variable numero almacena el valor que se verificará.
		int numero = 6;
		//Definir la variable: La variable sumaDivisores almacena la suma de los divisores.
		int sumaDivisores = 0;
		//Encontrar divisores propios: Usa un bucle for que va desde 1 hasta numero - 1. Si numero % i == 0, i es un divisor propio y se suma a sumaDivisores.
		for (int i = 1; i < numero; i++)
		{
			if (numero % i == 0)
			{
				sumaDivisores = sumaDivisores + i;
			}
		}
		//Verificar si es perfecto: Compara la suma de los divisores propios con el número. Si son iguales, imprime que es un número perfecto; de lo contrario, indica que no lo es.
		if (sumaDivisores == numero)
		{
			System.out.println(numero+" es un numero perfecto.");
		}
		else
		{
			System.out.println(numero+" no es un numero perfecto.");
		}
			
		
	}

}
