package EjerciciosDelModulo;

public class EjerciciosCicloWhile {
	//Desarrolla un programa que permita invertir la palabra “Programación”.
	//El resultado debe ser “nóicamargorP”.
	public static void main(String args[])
	{
		//Se inicializa la cadena palabra con "Programación".
		String palabra = "Programación";
		
		//Se crea una cadena vacía palabraInvertida para almacenar el resultado invertido.
		String palabraInvertida = "";
		
		//Se establece la variable i como el índice del último carácter de la palabra (palabra.length() - 1).
		int i = palabra.length() - 1;
		{
			
			//Ciclo while: Se ejecuta mientras i sea mayor o igual a 0.
			while (i >= 0)
			{
				
				//En cada iteración, se agrega el carácter en la posición i a la cadena palabraInvertida.
				palabraInvertida = palabraInvertida +palabra.charAt(i);
				//Luego, se decrementa el valor de i.
				i--;
								
			}
			
			//Finalmente, se imprime la palabra invertida.
			System.out.println("La palabra invertida es: " + palabraInvertida);	
		}
					
	}
}
