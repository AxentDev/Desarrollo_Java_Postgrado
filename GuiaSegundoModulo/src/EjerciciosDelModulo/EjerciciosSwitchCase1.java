package EjerciciosDelModulo;

public class EjerciciosSwitchCase1 
//Desarrollar una calculadora, la cual, en base a un operador, realice una
//operación con dos números enteros ya definidos y mostrar el resultado,
//los operadores a tener en cuenta son los vistos en la tabla de
//operadores aritméticos, sí deseas agregar más operadores, siéntete en libertad de hacerlo.

{
	public static void main(String args[])
	{
		double numero1 = 10;
		double numero2 = 3;
		char operacion = '%';
		double resultado = 0;
		
		
		switch (operacion)
		{
		case '+'://OJO aca con dos puntos ":".
			resultado = numero1 + numero2;
			System.out.println("La Suma es igual a: "+resultado);
			break;//El case se culmina con el break. Donde no se coloque el case sigue asi la respuesta este correcta.
		case '-':
			resultado = numero1 - numero2;
			System.out.println("La Resta es igual a: "+resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("La Multiplicación es igual a: "+resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("La División es igual a: "+String.format("%.2f", resultado));
			break;
		case '%':
			resultado = numero1 % numero2;
			System.out.println("El módulo o resto de la división es igual a: "+String.format("%.2f", resultado));
			break;
		default://OJO aca con dos puntos.
		System.out.println("No existe un valor válido");
		
		}
	}

}
