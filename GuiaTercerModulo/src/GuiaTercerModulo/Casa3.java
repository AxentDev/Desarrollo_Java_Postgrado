package GuiaTercerModulo;

public class Casa3 
{
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	//El método mostrarCiudad () cumple la función de mostrar un mensaje de la ciudad de la casa con base en el atributo de ciudad.
	
		public void mostrarciudad(String ciudad)
		{
			this.ciudad = ciudad;  
		}
		
		public String getciudad() 
		{
			return ciudad;
		}
		
		public void setciudad(String ciudad)
		{
			this.ciudad = ciudad;
		}
		
		public static void main(String args[])
		{
			Casa3 miCasa3 = new Casa3();
			miCasa3.setciudad("Bogotá");
			miCasa3.mostrarciudad("Medellín");
			System.out.println(miCasa3.getciudad());
		}
//Vamos en la pagina 21.

}
