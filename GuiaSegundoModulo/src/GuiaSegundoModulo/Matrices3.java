package GuiaSegundoModulo;

public class Matrices3 {//Desarrollar un programa que, dada una matriz de 5*4, almacene números aleatorios entre 0 y 100 en todas sus posiciones. Luego mostrar la matriz en forma de tabla.
	public static void main(String args[])
	{
		//Creo matriz de 5 x 4.
		int numeros[][] = new int [5][4];
		
		//Creo primer ciclo encargado de recorrer las filas. Se utiliza el ciclo for, dado que se conoce el número de iteraciones que se deben realizar que son 5.
		for (int i=0; i<5; i++)
		{
			//Creo segundo ciclo encargado de recorrer las columnas. Se utiliza el ciclo for, dado que se conoce el número de iteraciones que se deben realizar que son 4.
			for (int j=0; j<4; j++)
			{
				numeros[i][j] = (int) Math.ceil(Math.random()*100);
			}
			
		}
		//Procedemos con la impresión del codigo. Dos ciclos recorren la matriz por filas y	columnas e imprimen los respectivos datos en las posiciones determinadas.
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				System.out.print(numeros[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
	}

}
