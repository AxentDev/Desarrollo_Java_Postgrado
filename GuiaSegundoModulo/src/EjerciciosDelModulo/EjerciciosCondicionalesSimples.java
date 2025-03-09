package EjerciciosDelModulo;

public class EjerciciosCondicionalesSimples
//Desarrollar un algoritmo que genere un número aleatorio de 1 a 100 (Math.random) y por medio de una condicional determinar sí el número es menor a 50 o mayor. 
{
	public static void main(String args[])
	{
		int numeroAleatorio = (int) (Math.random()*100);
		System.out.println("El numero aleatorio es " +numeroAleatorio);
		
		if (numeroAleatorio > 50)
		{
			System.out.println(numeroAleatorio + " es mayor a 50");
		}
		else
		{
			System.out.println(numeroAleatorio + " es menor a 50");
			
		}
	}
}
