package GuiaTercerModulo;

public class Casa2 
{
	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;
	//El método cambiarDePropietario () cumple la función de asignar un nuevo valor al atributo propietario de la clase casa por medio del parámetro que recibe (recordemos el uso de this).
	
		public void cambiarDePropietario(String propietario)
		{
			this.propietario = propietario;  
		}
		
		public String getpropietario() 
		{
			return propietario;
		}
		
		public void setpropietario(String propietario)
		{
			this.propietario = propietario;
		}
		
		public static void main(String args[])
		{
			Casa2 miCasa2 = new Casa2();
			miCasa2.setpropietario("Juan");
			miCasa2.cambiarDePropietario("Alejandro");
			System.out.println(miCasa2.getpropietario());
		}

		
}
