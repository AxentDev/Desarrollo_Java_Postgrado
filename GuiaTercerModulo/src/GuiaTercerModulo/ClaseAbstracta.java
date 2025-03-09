package GuiaTercerModulo;

public abstract class ClaseAbstracta 
{
	private String color;
	
	public ClaseAbstracta(String color)
	{
		this.color = color;
	}
	
	public abstract double calcularArea();
	public String getColor()
	{
		return color;
	}

}
