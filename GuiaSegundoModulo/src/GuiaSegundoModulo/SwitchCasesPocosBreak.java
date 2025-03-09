package GuiaSegundoModulo;

public class SwitchCasesPocosBreak {
	public static void main(String args[])
	{
		int diaNum = 9;
		String diaLab;
		switch (diaNum) 
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			diaLab = "Dia de Labor";
			break;
		case 6:
		case 7:
			diaLab = "Dia de Descanso";
			break;
		
		default: diaLab = "El dia indicado es invalido";//Se utiliza para especificar el bloque de código que se ejecutará si ninguna de las opciones especificadas en los casos (case) coincide con el valor de la expresión evaluada.
		
		}
		
		System.out.println(diaNum+" es un "+ diaLab);
		
	}

}
