package GuiaSegundoModulo;

public class Ejercicio2While 
{
	public static void main(String args[])
	{
		//Desarrollar un programa que, dada una palabra, descomponga todos sus caracteres.
		
		String palabra = "Politecnico De Colombia";//Definición de la palabra.
		int i = 0;//Inicia desde el caractr cero de la palabra.
		
		while(i< palabra.length())//Length (): devuelve el número de caracteres del string, vector y otras estructuras de datos.
		{
			System.out.println(palabra.charAt(i)+" ");//charAt(int index) de la clase String se utiliza para obtener el carácter en una posición específica dentro de una cadena (String).
			//lo imprime con System.out.println. 
			//i=0 entonces arranca desde el caracter cero.
			i++;//se va incrementando o pasando al siguiente caracter.
		}
				
	}

}
