package GuiaTercerModulo;

public class CircunferenciaMetodoStatic 
{
	private static float pi = 3.1415926535f;
	private float radio = 0f;
	
	public CircunferenciaMetodoStatic(float radio)
	{
		this.radio = radio;
	}
	public float area()
	{
		return pi * (radio * radio);
	}
	public static void main (String args[])
	{
		System.out.println(CircunferenciaMetodoStatic.pi);
		
	}

}
