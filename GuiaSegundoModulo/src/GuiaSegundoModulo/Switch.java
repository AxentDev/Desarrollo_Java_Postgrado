package GuiaSegundoModulo;

public class Switch {
	public static void main(String args[])
	{
		int numero = 9;
		
		switch (numero)
		{
		case 1://OJO aca con dos puntos ":".
			System.out.println("El numero 1");
			break;//El case se culmina con el break. DOnde no se coloque el case sigue asi la respuesta este correcta.
		case 2:
			System.out.println("El numero 2");
			break;
		case 3:
			System.out.println("El numero 3");
			break;
		case 4:
			System.out.println("El numero 4");
			break;
		case 5:
			System.out.println("El numero 5");
			break;
		case 6:
			System.out.println("El numero 6");
			break;
		case 7:
			System.out.println("El numero 7");
			break;
		case 8:
			System.out.println("El numero 8");
			break;
		case 9:
			System.out.println("El numero 9");
			break;
		default://OJO aca con dos puntos.
		System.out.println("Error en numero");
			
		//Nota 1: Los valores duplicados de los case no están permitidos. Case 1 luego Case 1 otra vez.
		//Nota 2: El valor para un case debe ser del mismo tipo de datos que la variable en el switch. Ejm numero = 9 y el case 9.
		//Nota 3: El valor para un case debe ser una constante o un literal. Las variables no están permitidas. Ejm: case num: no cumple, siempre debe ser case 1:
		//Nota 4: La declaración break se usa dentro del switch para finalizar una secuencia de instrucción.
		//Nota 5: La declaración break es opcional. Si se omite, la ejecución continuará en el siguiente case.
		//Nota 6: La instrucción default es opcional, y debe aparecer al final del switch como último caso cumpliendo con similitud la función del else.
		//Nota 7: Se puede realizar cualquier tipo de operación dentro de la declaración del case.
		}
	}

}
