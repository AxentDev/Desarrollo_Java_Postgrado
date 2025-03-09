package EjerciciosDelModulo;

public class EjerciciosMatrices1// Desarrollar un programa que dada una matriz de números enteros entre 0 – 50 de 5*3, hallar el número mayor almacenado:
//Puedes utilizar variables auxiliares.
{
	public static void main(String args[])
	{
		int filas = 5;
		int columnas = 3;
		int mayor = 0;
				
		int matriz[][] = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++)
		{
			for (int j = 0; j < columnas; j++)
			{
				matriz[i][j] = (int) (Math.random()*50);
				if (mayor < matriz[i][j])
				{
					mayor = matriz[i][j];
				}
			}
		}
		for (int i = 0; i < filas; i++)
		{
			for (int j=0; j < columnas; j++)
			{
				System.out.print(matriz[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Numero Mayor " + mayor);
	}
	
}
