package GuiaTercerModulo;

public class CuadradoAbstracto extends ClaseAbstracta
{
	private double lado;

	public CuadradoAbstracto(String color, double lado) 
	{
		super(color);
		this.lado = lado;
	}
	
	public double calcularArea()
	{
		return lado * lado;
	}
	public static void main(String args[])
	{
		String colorDelCuadrado = "Verde";
		double ladoDelCuadrado = 2.5;
		
		CuadradoAbstracto CuadradoAbstracto = new CuadradoAbstracto(colorDelCuadrado, ladoDelCuadrado);
		System.out.println("El area del cuadrado "+ CuadradoAbstracto.getColor() +" es: "+ CuadradoAbstracto.calcularArea());
	}

}
