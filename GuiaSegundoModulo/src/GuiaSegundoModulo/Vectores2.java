package GuiaSegundoModulo;

public class Vectores2 {
	public static void main(String args[])
	{
		String nombres[] = new String[3];
		nombres[0] = "Juan";
		nombres[1] = "Andres";
		nombres[2] = "Stiven";
		
		for (int i = 0; i< nombres.length; i++)//arranca desde el cero, determina el numero de caracteres que no sea mayor a 3 que es del String y sigue con el siguiente,
		{
			System.out.println("Nombre "+i+" - "+nombres[i]);//imprime la palabra nombre luego el numero de variable entre [] y luego los nombres.
		}
		
	}

}
