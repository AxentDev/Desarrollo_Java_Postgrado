package EjerciciosDelModulo;

public class EjerciciosCondicionalesSimples1
//Dados dos números enteros, determinar cuál es el mayor por medio de una condicional y realizar una potencia con el número menor como exponente (Math.pow).
{
	public static void main(String args[]) 
	{
		int numeroUno = 3;
		int numeroDos = 9;
		if (numeroUno > numeroDos)
		{
			System.out.println(numeroUno + " es mayor a " +numeroDos);
		}
		else
		{
			System.out.println(numeroDos + " es mayor a " +numeroUno);
		}
		double base = Math.max(numeroUno, numeroDos);
		double exponente = Math.min(numeroUno, numeroDos);
		
		double resultado = Math.pow(base, exponente);
		System.out.println("La potencia es: "+resultado);
	}

}
