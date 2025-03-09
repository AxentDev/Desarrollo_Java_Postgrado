package GuiaTercerModulo;

//El método valorCasa () cumple la función de retornar el precio de la casa con base en el atributo de la clase casa.

public class Casa6 {
	
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	
	public int valorCasa()
	{
		return precio;
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
		Casa6 miCasa6 = new Casa6();
		miCasa6.setprecio(500000);
		System.out.println(miCasa6.valorCasa());
	}

}
