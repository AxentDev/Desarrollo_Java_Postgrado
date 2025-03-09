package EjerciciosDelModulo;

public class EjerciciosCicloFor {
	//Desarrolla un programa que permita mostrar el factorial de un número definido previamente. 
	public static void main(String args[])
	{
		//Defino el numero.
		int numero = 6;
		//Inicializamos factorial en 1.
		int factorial = 1;
		//genero el ciclo
		for (int i = numero; i>0; i--)//En este caso i se iguala al numero porque el factorial desciende del numero y por esto tambien es mayor que cero y luego decrece i y el numero.
		
		{
			//El ciclo se ejecuta desde 1 hasta el número ingresado (numero), multiplicando cada vez el valor acumulado de factorial por i.
			factorial = factorial*i;
		}
		
		System.out.println("El resultado del factorial es: "+factorial);
	}

}
