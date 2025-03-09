package Clases;

public class OperadoresAritmeticosCombinados {
	
	public static void main(String args[]){
		int a = 5;
		double b = 2.0;
		
		b += a;
		System.out.println("El resultado de la operacion suma es " +b);
		
		//Se reinicia "b" debido a que si no me toma el valor de la operacion anterior que dio b.
		b = 2.0;
		b -= a;
		System.out.println("El resultado de la operacion resta es " +b);
		
		//Se reinicia "b" debido a que si no me toma el valor de la operacion anterior que dio b.
		b = 2.0;
		b *= a;
		System.out.println("El resultado de la operacion multiplicacion es " +b);
		
		//Se reinicia "b" debido a que si no me toma el valor de la operacion anterior que dio b.
		b = 2.0;
		b /= a;
		System.out.println("El resultado de la operacion división es " +b);
		
		//Se reinicia "b" debido a que si no me toma el valor de la operacion anterior que dio b.
		b = 2.0;
		b %= a;
		System.out.println("El resultado de la operacion modulo es " +b);
	}

}
