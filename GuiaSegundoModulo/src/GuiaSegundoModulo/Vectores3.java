package GuiaSegundoModulo;

public class Vectores3 {//Desarrollar un programa que, mediante el uso de dos vectores, permita almacenar las cinco notas de un estudiante para calcular su promedio final.
	
	public static void main(String args[])
	{
		double notas[] = new double[5];//Vector numero 1,
		
		//Los valores para calcular el promedio se encuentran en un vector aparte que contiene los porcentajes asignados a cada nota.
		int porcentajes[] = {20,10,30,20,20};//Vector numero 2.
		
		notas [0] = 4.5;
		notas [1] = 4.2;
		notas [2] = 5.0;
		notas [3] = 4.5;
		notas [4] = 4.3;
		
		double promedio = 0;//El vector aparte o numero 3.
		
		for (int i = 0; i<notas.length; i++)//arranca en la nota 0, luego que no se pase de la cantidad de notas y luego proceda a la siguiente con i++.
		{
			promedio = (notas[i] * (porcentajes[i])/100) + promedio;//La fórmula para obtener el promedio es simple, se conoce la cantidad de notas, 
			//el porcentaje asignado a cada nota y el valor de las notas; con una simple operación aritmética se puede realizar:
			// Promedio = (Nota * (PorventajeNota/100) + Promedio)

			
		}
		
		System.out.println("Promedio Final "+Math.round(promedio));//Ojo redondea el promedio hacia arriba en una decima, si quito el Math.round se acaba la aproximación.
		
		
	}

}
