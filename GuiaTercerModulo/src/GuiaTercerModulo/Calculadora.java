package GuiaTercerModulo;

public class Calculadora 
{
	public static void main(String args[])
	{
		Calculadora Operaciones = new Calculadora();
		int numeros[] = {9,2,8,1,0,9};
		int resultado = Operaciones.sumarVector(numeros);
		System.out.println(resultado);
	}
		public int sumarVector(int numeros[])
		{
			int suma = 0;
			for (int i = 0; i < numeros.length; i++)
			{
				suma = suma +numeros[i];
			}
			return suma;
	}

}
