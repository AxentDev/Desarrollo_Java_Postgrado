package GuiaSegundoModulo;

public class Ejercicio3While {
	//Desarrollar un programa que genere números aleatorios entre 1 y 50 y se detenga cuando genere un múltiplo de 10.
	//Para la solución de este ejercicio, se utilizará lo que se conoce como banderas, que son variables booleanas que cambian cuando se cumplen ciertas 
	//características que se determinen en el código. 
	
	public static void main(String args[])
	{
		boolean x = true;//En este caso, la bandera será la	variable X inicializada en verdadero (para realizar la primera iteración del ciclo), y el
		//cambio de la bandera a X se dará cuando el número generado sea un múltiplo de	10 (recordemos el uso del módulo)
		while (x)
		{
			double n = Math.ceil(Math.random()*50);//se genera el numero aleatorio y se aproxima arriba.
			System.out.println(n);
			if (n % 10 == 0)//La ejecución del ejercicio termina cuando inmediatamente encuentre el	primer múltiplo de 10.
			{
				x = false;//bandera que culmina el ejercicio.
			}
		}
	}

}
