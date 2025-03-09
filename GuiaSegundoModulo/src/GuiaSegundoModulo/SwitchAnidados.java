package GuiaSegundoModulo;

public class SwitchAnidados 
{
	public static void main(String args[])
	{
		int promedio = 4;
		int parcial = 4;
		switch (promedio)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("Perdiste la materia");
				break;
			case 4:
			case 5:
				System.out.println("Pasaste la materia");
				switch (parcial)
				{
					case 1:
					case 2:
					case 3:
							System.out.println("pero perdiste el parcial");
							break;
					case 4:
					case 5:
							System.out.println("también el parcial");
							break;
				}
		
				break;			
			default: System.out.println("Error");
						
		}
	}

}
