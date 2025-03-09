package GuiaTercerModulo;

public class TrianguloAbstracto extends ClaseAbstracta
{
	private double base;
	private double altura;

	public TrianguloAbstracto(String color, double base, double altura) 
	{
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea()
	{
		return (base * altura)/2;
	}
	public static void main(String args[])
	{
		String colorDelTriangulo = "Amarillo";
		double baseDelTriangulo = 8.3;
		double alturaDelTriangulo = 2.5;
		
		TrianguloAbstracto TrianguloAbstracto = new TrianguloAbstracto(colorDelTriangulo, baseDelTriangulo, alturaDelTriangulo);
		System.out.println("El area del triángulo "+ TrianguloAbstracto.getColor() +" es: "+ TrianguloAbstracto.calcularArea());
	}
}
