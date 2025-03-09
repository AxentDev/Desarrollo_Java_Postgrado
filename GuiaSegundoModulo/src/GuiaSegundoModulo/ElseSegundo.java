package GuiaSegundoModulo;

public class ElseSegundo 
{
	public static void main(String args[])
	{
		String x = new String("Saludo");
		String y = new String("Saludo");
		
		if (x == y) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if (x.equals(y)) {
			System.out.println("True");
		}
		else 
		{
			System.out.println("false");	
		}
		//Como se puede ver el operador == compara si X es igual a Y, y el operador .equals() compara si el contenido de X es igual al de Y.
	}
}
