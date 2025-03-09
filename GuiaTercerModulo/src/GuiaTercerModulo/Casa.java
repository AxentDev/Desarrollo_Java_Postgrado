package GuiaTercerModulo;

public class Casa 
{
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	//El método pintarDeBlanco () cumple la función de asignar un valor al atributo	color de la clase casa a partir del objeto miCasa.
	public void PintarDeBlanco()
	{
		color = "Blanco";
	}
	
	public String getcolor() 
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color = color;
	}
	
	
	public static void main(String args[])
	{
		Casa miCasa = new Casa();
		miCasa.setcolor("Verde");
		miCasa.PintarDeBlanco();
		System.out.println(miCasa.getcolor());
	
	}
	
}
