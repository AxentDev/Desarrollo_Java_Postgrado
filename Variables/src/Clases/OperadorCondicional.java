package Clases;

public class OperadorCondicional {

	public static void main(String args[]){
		
		//En los operadores condicionales se evalua primero la condición, luego la expresion verdadera y por último la expresion falsa.
		//Condición: a == 4 es true porque a es igual a 4.
		//Expresión verdadera: a + 5 se evalúa como 4 + 5, lo que da 9
		//Expresión falsa: No se evalúa en este caso porque la condición es true.
		//?: Este símbolo indica el inicio de la parte "si es verdadero" de la expresión ternaria. Si la condición (a == 4) es verdadera, el valor a la izquierda de los dos puntos (:) será asignado.
		
		int a = 4;
		int b = 5;
		int c = 6;
		int d = a == 4 ? a + b : c - a;
		System.out.println("El resultado es para d= " +d);
		int e = a > 4 ? a * 7 : a + 8;
		System.out.println("El resultado es para e= " +e);
		
	}
	
}
