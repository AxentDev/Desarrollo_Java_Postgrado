package EjerciciosDelModulo;

public class EjerciciosMatrices {
	//Desarrollar un programa que por medio de tres (3) matrices de N*M	(Determinar el tamaño, igual para las 3 matrices):
	//Almacenar números pares aleatorios entre 0 y 100 en la primera matriz.
	//Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz.
	//Almacenar la suma de los valores de ambas matrices en la tercera matriz.
	
	public static void main(String args[])
	{
		//Declaración de matrices: Se declaran tres matrices de tamaño 4x5:
		//matrizPares para almacenar números pares.
		//matrizImpares para almacenar números impares.
		//matrizSuma para almacenar la suma de los valores de las dos primeras matrices.
		int filas = 4;
		int columnas = 3;
		int aux = 0;
		
		
		int matrizPares[][] = new int[filas][columnas];
		int matrizImpares[][] = new int[filas][columnas];
		int matrizSuma[][] = new int[filas][columnas];
		
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				aux = (int) (Math.random()*100);
				if (aux % 2 == 0)
				{
					matrizPares[i][j] = aux;
				}
				else
				{
					j--;
				}
			}
		}
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				aux = (int) (Math.random()*100);
				if (aux % 2 != 0)
				{
					matrizImpares[i][j] = aux;
				}
				else
				{
					j--;
				}
			}
		}
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				matrizSuma[i][j] = matrizPares[i][j] + matrizImpares[i][j];
				
				}
			}
		System.out.println("Matriz Pares: ");
		System.out.println();
		
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				System.out.print(matrizPares[i][j]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("Matriz Impares: ");
		System.out.println();
		
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				System.out.print(matrizImpares[i][j]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("Matriz Suma: ");
		System.out.println();
		
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				System.out.print(matrizSuma[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}
}

