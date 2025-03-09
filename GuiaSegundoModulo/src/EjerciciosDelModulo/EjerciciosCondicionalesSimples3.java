package EjerciciosDelModulo;

public class EjerciciosCondicionalesSimples3
//Dados dos números enteros, determinar si uno es múltiplo del otro (Por medio del módulo).
{
	public static void main(String args[])
	{
		int numeroUno = 5;
		int numeroDos = 65;
		
		if (numeroDos % numeroUno == 0)
		{
			System.out.println("El numero "+numeroDos+ " es multiplo de "+numeroUno);
		}
		else 
		{
			System.out.println("El numero "+numeroDos+ " no es multiplo de "+numeroUno);			
		}
	}

}
