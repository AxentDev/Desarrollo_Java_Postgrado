package EjerciciosDelModulo;

public class EjerciciosSwitchCase 
//Desarrolla un programa donde por medio del tipo de un motor, determinar qué tipo de fluido puede trasportar éste según las siguientes condiciones:
//Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No hay establecido un valor definido para el tipo”.
//Si el tipo de motor es 1, mostrar un mensaje por consola indicando “Agua”.
//Si el tipo de motor es 2, mostrar un mensaje por consola indicando “Gasolina”.
//Si el tipo de motor es 3, mostrar un mensaje por consola indicando “Hormigón”.
//Si no se cumple ninguno de los valores anteriores mostrar el mensaje
//“No existe un valor válido”.
{
	public static void main(String args[])
	{
		int tipoMotor = 2;
		
		switch (tipoMotor)
		{
		case 0://OJO aca con dos puntos ":".
			System.out.println("No hay establecido un valor definido para el tipo");
			break;//El case se culmina con el break. Donde no se coloque el case sigue, asi la respuesta este correcta.
		case 1:
			System.out.println("El fluido que pude transportar es Agua");
			break;
		case 2:
			System.out.println("El fluido que pude transportar es Gasolina");
			break;
		case 3:
			System.out.println("El fluido que pude transportar es Hormigón");
			break;
		default://OJO aca con dos puntos.
		System.out.println("No existe un valor válido");
		}
	}
	
}
