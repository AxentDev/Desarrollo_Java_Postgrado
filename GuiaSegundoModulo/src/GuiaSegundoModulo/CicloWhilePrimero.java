package GuiaSegundoModulo;

public class CicloWhilePrimero {
	//Los ciclos while (o ciclos mientras) son una estructura de control cíclica, que
	//permite ejecutar una o varias líneas de código de forma iterativa (o repetitiva), al
	//igual que el ciclo for, pero teniendo control y conocimiento sobre las iteraciones.
	
	public static void main(String args[])
	{
		//A continuación un código con dos bulces de while:
		
		//El primer bucle imprime "Ciclo While" una vez. La razón es que x se inicializa como true, el bucle entra en la primera iteración y luego x se establece en false, 
		//haciendo que el bucle termine después de la primera iteración.

		boolean x = true;//La estructura del ciclo while se compone principalmente de una condición	que tiene que tomar un valor booleano (verdadero o falso). 
		//Si este valor es verdadero, se ejecutará la sentencia. Si es falso nunca ejecutará el conjunto de sentencias.
		
		while (x)
		{
			System.out.println("Ciclo While");//Concluida esta acción, se vuelve a evaluar la condición. Proseguirán los ciclos hasta que la condición cambie a falso
			x = false;//En este caso cambio a false por lo que terminan los ciclos.
			
		}
		
			//El segundo bucle imprime los números del 0 al 9.  
			int i = 0;//Empieza con i igual a 0.
		
			while (i<10)//Sigue incrementando i en cada iteración hasta que i ya no es menor que 10.
			{
				System.out.println(i);
				i++;
					
			}
	//Nota. Al igual que ocurre con las condicionales, dentro de la declaración de las llaves se ubica respectivamente el código que se desea ejecutar de forma repetitiva;
	//en caso de obtener un resultado verdadero, los componentes que definen la	estructura van conforme se detallan en la ilustración anterior: una variable para el
	//control de la condicional, la respectiva y característica condicional (el punto más importante) y finalmente la iteración (incremento, decremento o cambio); 
	//esta es la estructura recomendada.

	}

}
