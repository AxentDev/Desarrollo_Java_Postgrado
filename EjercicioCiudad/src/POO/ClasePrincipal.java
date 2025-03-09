package POO;

public class ClasePrincipal 
{
	public static void main(String args[])
	{
		Ciudad medellin = new Ciudad();
		medellin.setnombre("Medellin");
		medellin.setpoblacion(7);
		medellin.setpais("Colombia");
		medellin.setpresidente("Uribe");
		System.out.println("Nombre: "+medellin.getnombre());
		System.out.println("Población: "+medellin.getpoblacion());
		System.out.println("Pais: "+medellin.getpais());
		System.out.println("Presidente: "+medellin.getpresidente());
	}

}
