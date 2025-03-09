package EjerciciosDelModulo;

public class EjerciciosVectores 
//Desarrollar un programa que por medio de un vector de tipo float permita almacenar el peso de 5 personas para posteriormente:
//Determinar el promedio del peso de las 5 personas.
//Determinar cuántas personas superar el promedio del peso.
//Determinar cuántas personas son inferiores al promedio del peso.
{
	public static void main(String args[])
	{
		float pesos[] = {85.3f,95.8f,62.4f,47.9f,87.0f};
		float promedio = 0.00f;
		float sum = 0.00f;
		int max = 0; // Contador para los que superan el promedio
		int min = 0; // Contador para los que están por debajo del promedio
		
		// Calcular la suma de los pesos
		for (int i = 0; i<pesos.length; i++)
		{
			sum = sum + pesos[i];
		}
			// Calcular el promedio
			promedio = sum/pesos.length;
			
			// Contar cuántas personas superan o están por debajo del promedio
			for (int i = 0; i<pesos.length; i++)
			{
				if(pesos[i]>promedio)
				{
					max++;
				}
				else
				{
					min++;
				}
			}
			// Mostrar resultados
			System.out.println("El promedio es: "+promedio);
			System.out.println("El número de personas que superan el promedio del peso es: "+max);
			System.out.println("El número de personas que están por debajo del promedio del peso es: "+min);
	}
}
