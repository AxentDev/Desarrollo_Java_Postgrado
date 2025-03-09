package GuiaTercerModulo;

public class VehiculoHerencia 
{
	private String matricula;
	private String modelo;
	private int potencia;
	
	public String getmatricula() 
	{
		return matricula;
	}
	
	public void setmatricula(String matricula)
	{
		this.matricula = matricula;
	}
	public String getmodelo() 
	{
		return modelo;
	}
	
	public void setmodelo(String modelo)
	{
		this.modelo = modelo;
	}
	public int getpotencia() 
	{
		return potencia;
	}
	
	public void setpotencia(int potencia)
	{
		this.potencia = potencia;
	}
	public void encedervehiculo()
	{
		System.out.println("El vehiculo está encendido");
	}
	public void apagarvehiculo()
	{
		System.out.println("El vehiculo está apagado");
	}
}
