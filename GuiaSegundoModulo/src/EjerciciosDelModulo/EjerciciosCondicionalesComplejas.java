package EjerciciosDelModulo;

public class EjerciciosCondicionalesComplejas 
//Desarrollar un programa que permita por medio de la edad de una persona, determinar la categoría en la que pertenece a raíz de la tabla en el documento de ejercicios:
{
	public static void main(String args[])
	{
		int edad = 39;
		String categoria;
		
				
		if (edad > 0 && edad <= 5)
		{
			categoria = "Infante";
			System.out.println("La persona es un: "+categoria);
		}
		else if (edad > 6 && edad <= 10)
			{
				categoria = "Niño";
				System.out.println("La persona es un: "+categoria);
			}
			else if (edad > 11 && edad <= 15)
				{
					categoria = "Pre Adolescente";
					System.out.println("La persona es un: "+categoria);
				}
				else if (edad > 15 && edad <= 18)
					{
						categoria = "Adolescente";
						System.out.println("La persona es un: "+categoria);
					}
					else if (edad > 18 && edad <= 25)
						{
							categoria = "Pre Adulto";
							System.out.println("La persona es un: "+categoria);
						}
						else if (edad > 25 && edad <= 40)
							{
								categoria = "Adulto";
								System.out.println("La persona es un: "+categoria);
							}
							else if (edad > 40 && edad <= 55)
								{
									categoria = "Pre Anciano";
									System.out.println("La persona es un: "+categoria);
								}
								else if (edad > 55)
									{
										categoria = "Anciano";
										System.out.println("La persona es un: "+categoria);
									}
	}
}
