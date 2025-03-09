package GuiaTercerModulo;

//El método cantidadDeCuartosPorHabitante () cumple la función de retornar la cantidad de habitaciones que hay por cada habitante de la casa, basándose en los atributos de cuartos y habitantes.

public class Casa5 
{
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	
	public int cuartosPorHabitante()
	{
		return (int) (cuartos/habitantes);
	}
	
	public int getcuartos() 
	{
		return cuartos;
	}
	
	public void setcuartos(int cuartos)
	{
		this.cuartos = cuartos;
	}
	
	public int gethabitantes() 
	{
		return habitantes;
	}
	
	public void sethabitantes(int habitantes)
	{
		this.habitantes = habitantes;
	}
	
	public static void main(String args[])
	{
		Casa5 miCasa5 = new Casa5();
		miCasa5.setcuartos(4);
		miCasa5.sethabitantes(2);
		System.out.println(miCasa5.cuartosPorHabitante());
	}

}
