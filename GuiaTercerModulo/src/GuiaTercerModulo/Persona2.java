package GuiaTercerModulo;

public class Persona2 
{
	private String nombre;
	private String pais;
	private int edad;
	
	public Persona2()
	{
		
	}
	
	public String getnombre() 
	{
		return nombre;
	}
	
	public void setnombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getpais() 
	{
		return pais;
	}
	
	public void setpais(String pais)
	{
		this.pais = pais;
	}
	public int getedad() 
	{
		return edad;
	}
	
	public void setedad(int edad)
	{
		this.edad = edad;
	}
	public void comer()
	{
		System.out.println("Comer");
	}
	public void cantar()
	{
		System.out.println("Cantar");
	}
	public static void main(String args[])
	{
		Persona2 Diego = new Persona2();
		Diego.setnombre("Diego Alejandro");
		Diego.setedad(22);
		Diego.setpais("Colombia");
		System.out.println(Diego.getnombre());
		System.out.println(Diego.getedad());
		System.out.println(Diego.getpais());
		Persona2 Katt = new Persona2();
		Katt.setnombre("Katt");
		Katt.setpais("España");
		Katt.setedad(19);
		System.out.println(Katt.getnombre());
		System.out.println(Katt.getedad());
		System.out.println(Katt.getpais());
	}
}

