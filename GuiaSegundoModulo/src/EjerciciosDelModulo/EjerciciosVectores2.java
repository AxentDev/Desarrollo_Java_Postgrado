package EjerciciosDelModulo;

public class EjerciciosVectores2 
//Desarrollar un programa que, dada una palabra, divida todos sus caracteres y los almacene en las posiciones de un vector del tamaño de la palabra, por ejemplo:
//“Colombia”, tiene 8 caracteres, por ende, el vector debe ser de tamaño 8 para almacenar cada carácter.
{
	public static void main(String args[])
	{
		String palabra = "America";
		char caracteres[] = new char [palabra.length()];
		
		for (int i = 0; i<palabra.length(); i++)
		{
			caracteres[i] = palabra.charAt(i); 
		}
		for (int i = 0; i<caracteres.length; i++)
		{
			System.out.println("Caracter: "+caracteres[i]);
		}
	}

}
