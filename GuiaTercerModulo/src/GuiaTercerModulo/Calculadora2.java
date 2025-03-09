package GuiaTercerModulo;

public class Calculadora2 
{
	public int sumar(int numero1, int numero2)
	{
		return numero1+numero2;
	}
	public double sumar(double numero1, double numero2)
	{
		return numero1+numero2;
	}
	public float sumar(float numero1, float numero2)
	{
		return numero1+numero2;
	}
	public int sumar()
	{
		return 0;
	}
	public int sumar(int numero1, int numero2, int numero3)
	{
		return numero1+numero2+numero3;
	}


	public static void main(String args[])
	{
		Calculadora2 operaciones = new Calculadora2();
		operaciones.sumar();
		operaciones.sumar(9.2, 3.7);
		operaciones.sumar(9f, 9.5f);
		operaciones.sumar(5,2);
		operaciones.sumar(2,3,4);
	}
}



