package EjerciciosDelModulo;

public class EjerciciosCondicionalesComplejas3 
//Un postulante a un empleo, realiza un test de capacitación, se obtuvo
//la siguiente información: cantidad total de preguntas que se le
//realizaron y la cantidad de preguntas que contestó correctamente.
//Desarrolle un programa que informe el nivel según el porcentaje de
//respuestas correctas que ha obtenido, y sabiendo que:
//1. Nivel máximo: Porcentaje >= 90%.
//2. Nivel medio: Porcentaje >= 75% y <90%.
//3. Nivel regular: Porcentaje >= 50% y <75%.
//4. Fuera de nivel: Porcentaje < 50%.
{
	public static void main(String args [])
	{
		int cantidadPreguntasRealizadas = 10;
		int cantidadPreguntasCorrectas = 9;
		double porcentaje;
		
		porcentaje = (cantidadPreguntasCorrectas*100)/cantidadPreguntasRealizadas;
		
		if (porcentaje >= 90)
		{
			System.out.println("Obtuvo " +porcentaje+ " lo cual es el Nivel Maximo");	
		}
		else if (porcentaje >= 75 && porcentaje < 90)
		{
			System.out.println("Obtuvo " +porcentaje+ " lo cual es el Nivel Medio");
		}
		else if (porcentaje >= 50 && porcentaje < 75)
		{
			System.out.println("Obtuvo " +porcentaje+ " lo cual es el Nivel Regular");
		}
		else if (porcentaje < 50)
		{
			System.out.println("Obtuvo " +porcentaje+ " lo cual es el Fuera de Nivel");
		}
	}
}