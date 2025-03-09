package GuiaTercerModulo;

public class Taxi extends VehiculoHerencia 
{
	private String licencia;
	public String getlicencia() 
	{
		return licencia;
	}
	
	public void setlicencia(String licencia)
	{
		this.licencia = licencia;
	}
	
	public static void main(String args[])
	{
		
		//Objeto de la clase Taxi
		Taxi taxiAmarillo = new Taxi();
	
		//Uso de los atributos de la Clase Vehiculo
		taxiAmarillo.setmatricula("USR 192");
		taxiAmarillo.setmodelo("1995");
		taxiAmarillo.setpotencia(800);
		
		//Uso del atributo de la clase Taxi
		taxiAmarillo.setlicencia("12987894");
		
		//Uso de los metodos de la clase vehiculo
		taxiAmarillo.encedervehiculo();
		taxiAmarillo.apagarvehiculo();
		
	}
	
}