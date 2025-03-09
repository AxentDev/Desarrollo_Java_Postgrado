package GuiaTercerModulo;

public class Perro2 
{
	
		final private String raza = "Perro";
		private String nombre;
		private int edad;
		private String encargada;
		
		public String getNombre() 
		{
			return nombre;
		}
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}
		public int getEdad()
		{
			return edad;
		}
		public void setEdad()
		{
			this.edad = edad;
		}
		public String getEncargada()
		{
			return encargada;
		}
		public void setEncargada(String encargada)
		{
			this.encargada = encargada;
		}
		public String getRaza()
		{
			return raza;
		}
		public static void main(String args[])
		{
		Perro Firulais = new Perro();
		Firulais.setNombre("Firulais");
		System.out.println("El nombre del perro es: "+Firulais.getNombre());
		
	}

}
