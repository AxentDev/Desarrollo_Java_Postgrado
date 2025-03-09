package GuiaTercerModulo;

//El método aumentarPrecio () cumple la función de incrementar y retornar el atributo del precio de la clase casa partiendo del parámetro que recibe (recordemos el uso de this).

public class Casa4 
{
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	
	public int aumentarPrecio(int precio)
	{
		return this.precio = this.precio+ precio;
	}
	
	public int getprecio() 
	{
		return precio;
	}
	
	public void setprecio(int precio)
	{
		this.precio = precio;
	}
	
	public static void main(String args[])
	{
		Casa4 miCasa4 = new Casa4();
		miCasa4.setprecio(150000);
		miCasa4.aumentarPrecio(350000);
		System.out.println(miCasa4.getprecio());
	}

}
