package GuiaSegundoModulo;

public class Ejercicio1CharAt //charAt (): devuelve el carácter de una posición del string.
//Para describir mejor el método charAt, este se aplica sobre variables de tipo
//string y se encarga de descomponer la variable en posiciones de 0 a N-1 (N siendo
//el número de caracteres), a las cuales se puede acceder por medio de un índice (un 
//número asignado a la posición)
{
	public static void main(String args[]) {
		
		String nombre = "Carlos";
		int i=0;
		System.out.println("La palabra "+nombre+" tiene "+nombre.length()+" caracteres");
		
		while(i< nombre.length())
		{
			System.out.println(nombre.charAt(i)+" en la posición: "+i);
			i++;
		}
	}
}
