package EjerciciosDelModulo;

public class EjerciciosCondicionalesSimples4
//Por medio de una nota decimal, determinar sí el estudiante aprobó o no la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
{
	public static void main(String argas[])
	{
		double nota = 7.7;
		
		if (nota >= 7 && nota <= 10)
		{
			System.out.println("La nota final fue: "+nota+" por ende el estudiante aprobó.");
		}
		else
		{
			if (nota <= 6.9)
			{
				System.out.println("La nota final fue: "+nota+" por ende el estudiante perdió.");
				
			}
		}
	}

}
