package EjerciciosDelModulo;

public class EjerciciosCicloWhile3 
{
	//Desarrollar un programa que permita contar cuantas vocales existentes	en el siguiente parrafo.
	public static void main(String args[])
	{
		//Se define el párrafo en la variable parrafo.
		String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas	risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.";
		
		//El párrafo se convierte a minúsculas para facilitar la comparación de caracteres.
		parrafo = parrafo.toLowerCase();
		
		//Se define la variable a ejecutar.
		int contarVocales = 0;
		
		//Se define la variable i para recorrer los caracteres del párrafo y se inicializa en 0.
		int i = 0;
		
		//Ciclo while: Se ejecuta mientras i sea menor que la longitud del párrafo
		while (i < parrafo.length())
		{
			//Extrae el carácter en la posición i y verifica si es una vocal ('a', 'e', 'i', 'o', 'u').
			char c = parrafo.charAt(i);
			if (c =='a'|| c =='e'|| c =='i'|| c =='o'|| c =='u')
			{
				//Si es una vocal, incrementa el contador de vocales.
				contarVocales++;
			}
			//Incrementa i para avanzar al siguiente carácter.
			i++;
		}
		System.out.println("El numero de vocales es: "+contarVocales);
		
	}

}
