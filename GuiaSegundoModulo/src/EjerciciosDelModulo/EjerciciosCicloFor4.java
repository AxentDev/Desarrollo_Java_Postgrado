package EjerciciosDelModulo;

public class EjerciciosCicloFor4 
{
	//Desarrollar un programa que realice la sumatoria de todas las	iteraciones de un ciclo desde 0 hasta un número entero definido	previamente, al resultado de la suma realizar las siguientes operaciones.
	//- Raíz cuadrada.
	//- Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
	//- Determinar los divisores.
	//- Definir si es un número perfecto.
	//- Hallar la factorial.
	public static void main(String args[])
	{
		//**********************************************************************************************
		//Definir el numero y la sumatoria
		int numero = 6;
		int sumaIteraciones = 0;
		
		//**********************************************************************************************
		//Desarrollo el ciclo.
		//Calcular la sumatoria desde 0 hasta 'numero'
		for (int i= 0; i <= numero; i++)
		{
			sumaIteraciones = sumaIteraciones + i;			
		}
		System.out.println("La sumatoria desde 0 hasta "+numero+" es: "+sumaIteraciones);
		
		//**********************************************************************************************
		//Raiz cuadrada de la sumatoria
		double raiz = Math.sqrt(sumaIteraciones);
		System.out.println("La raiz cuadrada es: "+String.format("%.2f",raiz));
		
		//**********************************************************************************************
		//Genero un numero aleatorio entre 1 y la sumatoria de las iteraciones.
		double numeroAleatorio = Math.random()*sumaIteraciones;
		System.out.println("El numero aleatorio es: "+String.format("%.2f",numeroAleatorio));
		
		//**********************************************************************************************
		//Determinar los divisores.
		System.out.println("Los divisores son: ");
		StringBuilder divisores = new StringBuilder();
		for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) { // Si es divisor
                if (divisores.length() > 0) {
                    divisores.append(","); // Añadir coma antes del siguiente divisor
                }
                divisores.append(i); // Añadir el divisor al StringBuilder
            }
        }

        // Imprimir la lista de divisores con un punto al final
        System.out.println(divisores.toString() + ".");
	    
		//**********************************************************************************************
		// Definir si es un número perfecto.
		int suma = 0;
		for (int i = 1; i < numero; i++)
		{
			if (numero % i == 0)
			{
				suma = suma + i;
			}
		}
		if (suma == numero)
		{
			System.out.println(numero + " es un numero perfecto.");
		}
		else
		{
			System.out.println(numero + " no es un numero perfecto.");
		}
		
		//**********************************************************************************************
		// Hallar la factorial
		int factorial = 1;
		for (int i = numero; i > 0; i--)
		{
			factorial = factorial * i;
		}
		System.out.println("El resultado del factorial es: " + factorial);
		
		//**********************************************************************************************
		
	}

}
