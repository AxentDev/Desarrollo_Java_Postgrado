package GuiaTercerModulo;

public class ClaseAritmetica 
{
	public int suma(int numero1, int numero2)
	{
		return numero1 + numero2;
	}
	public int resta(int numero1, int numero2)
	{
		return numero1 - numero2;
	}
	public int multiplicacion(int numero1, int numero2)
	{
		return numero1 * numero2;
	}
	public double division(int numero1, int numero2)
	{
		return numero1 / numero2;
	}
	//Creacion del objeto
	public static void main(String args[])
	{
		ClaseAritmetica operaciones = new ClaseAritmetica();
		
		int suma = operaciones.suma(9, 3);
		int resta = operaciones.resta(7, 3);
		int multiplicacion = operaciones.multiplicacion(9, 5);
		double division = operaciones.division(14, 7);
		System.out.println("Suma " + suma);
		System.out.println("Resta " + resta);
		System.out.println("Multiplicación " + multiplicacion);
		System.out.println("División " + division);

								
	}

}
