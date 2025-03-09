package GuiaTercerModulo;

public class ConstructorVacioCalculadora 
{
	private int numero1;
	private String operador;
	private int numero2;
	
	public ConstructorVacioCalculadora() 
	{
	}
	
			public int getnumero1()
			{
				return numero1;
			}
			public void setnumero1(int numero1)
			{
				this.numero1 = numero1;
			}
			public String getoperador()
			{
				return operador;
			}
			public void setoperador(String operador)
			{
				this.operador = operador;
			}
			public int getnumero2()
			{
				return numero2;
			}
			public void setnumero2(int numero2)
			{
				this.numero2 = numero2;
			}
			public String operacion()
			{
				return this.getnumero1() + " " + this.getoperador() +" " + this.getnumero2();
			}
	
	public static void main(String args[])
	{
		ConstructorVacioCalculadora Operaciones = new ConstructorVacioCalculadora();
		Operaciones.setnumero1(9);
		Operaciones.setoperador("+");
		Operaciones.setnumero2(8);
		
		System.out.println(Operaciones.operacion());
	}
	
	

}
