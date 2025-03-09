package EjerciciosDelModulo;

public class EjerciciosCicloWhile2
{
	//Desarrollar un programa que determine si una palabra establecida previamente es o no palíndroma.
	public static void main (String args[])
	{
		//Se define una palabra, en este caso, "reconocer". Puedes cambiarla para probar con otras palabras.
		String palabra = "Reconocer";
		
		//La palabra se convierte a minúsculas para evitar problemas con la comparación.
		palabra = palabra.toLowerCase();
		
		//La estructura del ciclo while se compone principalmente de una condición que tiene que tomar un valor booleano (verdadero o falso).
		boolean esPalindroma = true;
		
		//Se definen dos índices, inicio (al principio de la palabra) y fin (al final de la palabra).
		int inicio = 0;
		int fin = palabra.length() - 1;
		
		//Ciclo while: Se ejecuta mientras inicio sea menor que fin:
		while (inicio < fin)
		{
			//Compara el carácter en la posición inicio con el carácter en la posición fin y en caso que sea negativo se culmina el ciclo.
			if (palabra.charAt(inicio) != palabra.charAt(fin))
			{
				//Si los caracteres no coinciden, establece esPalindromo como false y sale del ciclo.
				esPalindroma = false;
				break;
			}
			//Si coinciden, incrementa inicio y decrementa fin para comparar los siguientes caracteres.
			inicio ++;
			fin --;
		}
		if (esPalindroma)
		{
			//Salida: Verifica el valor de esPalindromo para imprimir si la palabra es un palíndromo o no.
			System.out.println("La palabra: "+palabra+ " es palindroma");
		}
		else
		{
			System.out.println("La palabra: "+palabra+ " no es palindroma");
		}
		
	}
}
