package GuiaTercerModulo;

public class BarcoPirata implements Barco
{
	private int x;
	private int y;
	
	public int getx() 
	{
		return x;
	}
	
	public void setx(int x)
	{
		this.x = x;
	}
	public int gety() 
	{
		return y;
	}
	
	public void sety(int y)
	{
		this.y = y;
	}
	public void conocerPosicion()
	{
		System.out.println("La posicion actual es: "+x+" - "+y);
	}
		
	@Override
	public void moverPosicion(int x, int y)
	{
		
	}
	@Override
	public void disparar()
	{
	System.out.println("Disparar cañones");		
	}
	public static void main(String args[])
	{
		BarcoPirata sunny = new BarcoPirata();
		
		sunny.setx(450);
		sunny.sety(180);
		
		sunny.moverPosicion(50, 20);
		
		sunny.conocerPosicion();
		
		sunny.disparar();
	}

}