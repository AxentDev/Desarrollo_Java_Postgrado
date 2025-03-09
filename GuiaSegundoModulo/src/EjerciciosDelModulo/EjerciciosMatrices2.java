package EjerciciosDelModulo;

public class EjerciciosMatrices2{// Desarrollar un programa que dada una matriz 3*4 con números aleatorios, imprimir de la matriz sólo lo siguiente:
//- La primera fila
//- La segunda columna
//- La tercera fila

	public static void main(String args[])
	{
		int filas = 3;
		int columnas = 4;

		
		int matriz[][] = new int[filas][columnas];
		
		for (int i=0; i < filas; i++)
		{
			for (int j=0; j < columnas; j++)
			{
				matriz[i][j] = (int) (Math.random()*100);
			}
		}
		System.out.println("La matriz entera es:");
		for (int i=0; i<filas; i++)
		{
			for (int j=0; j<columnas; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("Primera Fila");
		for (int i=0; i < columnas; i++)
		{
			System.out.print(matriz[0][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Segunda Columna");
		for (int i=0; i < filas; i++)
		{
			System.out.println(matriz[i][1]+" ");
		}
		System.out.println();
		System.out.println("Tercera Fila");
		for (int i=0; i < columnas; i++)
		{
			System.out.print(matriz[2][i]+" ");
		}
	}
}

	
		
		


