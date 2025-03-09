package GuiaTercerModulo;

public class UsuarioClaseAnidada 
{
	public String usuario;
	public UsuarioClaseAnidada(String UsuarioClaseAnidada)
	{
		this.usuario = UsuarioClaseAnidada; 
	}
	public void establecerRoles()
	{
		Administrador admin = new Administrador();
		admin.trabajar();		
	}
	public class Administrador
	{
		public void trabajar()
		{
			System.out.println("El administrador: " +usuario+ " se encuentra trabajando");
		}
	}
	public static void main(String args[])
	{
		UsuarioClaseAnidada UsuarioClaseAnidada = new UsuarioClaseAnidada ("Diego");
		UsuarioClaseAnidada.establecerRoles();
	}
}
