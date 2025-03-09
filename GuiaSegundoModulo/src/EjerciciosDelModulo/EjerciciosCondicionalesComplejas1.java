package EjerciciosDelModulo;

public class EjerciciosCondicionalesComplejas1 
//Desarrollar un programa que permita determinar la cantidad de cifras de un número X teniendo en cuenta que el número únicamente puede
//tener 4 cifras. Mostrar un mensaje por defecto si el número supera las 4 cifras.
{
	public static void main(String args[])
	{
		double numero = 54579;
		//Resultado de Math.log10: El uso de Math.log10 para contar cifras es correcto. 
		//Sin embargo, hay que tener cuidado con números menores a 1, ya que la función Math.log10 retornará un valor negativo o indeterminado para valores como 0 o números negativos.
		int cifras = (int) (Math.log10(numero)+1);
		
		//Si el número tiene más de 4 cifras, siempre se imprimirá "4 cifras", lo cual parece ser la intención según tu condición if.
		if (cifras <= 4)
		{
			System.out.println(cifras + " cifras");
		}
		else
		{
			System.out.println("Tiene más de 4 cifras");
		}
		
	}

}
