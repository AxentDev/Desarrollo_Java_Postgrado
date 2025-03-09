package GuiaTercerModulo;

public class Autobus extends VehiculoHerencia 
{
	private int puestos;
	public int getpuestos() 
	{
		return puestos;
	}
	
	public void setpuestos(int puestos)
	{
		this.puestos = puestos;
	}
	public static void main(String args[])
	{
		
		//Objeto de la clase Autobus
		Autobus autoCol = new Autobus();
	
		//Uso de los atributos de la Clase Vehiculo
		autoCol.setmatricula("AHC 359");
		autoCol.setmodelo("2004");
		autoCol.setpotencia(2000);
		
		//Uso del atributo de la clase Taxi
		autoCol.setpuestos(35);
		
		//Uso de los metodos de la clase vehiculo
		autoCol.encedervehiculo();
		autoCol.apagarvehiculo();
		
	}
}
//Vamos en la pagina 43.