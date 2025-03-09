package ClasesVariables;

public class Ejercicio2 {
	
	public static void main(String args[]) {
		
		//Corrija las siguientes variables de acuerdo a las características de las variables vistas.
		//Double a = 8;
		double a = 8; // es con minúscula double.
		
		//int b = 'A';
		char b = 'A'; // es char no un entero.
		
		//String c = 'Colombia';
		String c = "Colombia"; //es con doble comilla.
		
		//char d = "A";
		char d = 'A';//es con comilla simple. (') se utilizan para literales de tipo char, que representan un solo carácter.
		
		//float e = 74548M;
		float e = 74548f; //El sufijo correcto para un literal float es f o F, y el sufijo M no tiene ningún significado en Java.
		
		//int 1numero;
		int numero1; //El error en la declaración int 1numero; es que los nombres de las variables en Java no pueden comenzar con un dígito.
		
		//String nombre-persona;
		String nombre_Persona; //El error en la declaración String nombre-persona; es que el nombre de la variable contiene un guion (-), que no es un carácter válido para los identificadores en Java. 
				
		//Double edad;
		double edad; //El error en la declaración Double edad; es que estás utilizando Double en lugar de double. En Java, hay dos tipos de datos para representar números decimales: double: Un tipo de dato primitivo que representa números de punto flotante de doble precisión. Double: Una clase envolvente (wrapper class) para el tipo primitivo double, que proporciona métodos para trabajar con valores de double y permite el uso de null.
		
		//int alturaReal = Double.parseDouble(altura);
		String altura = "175.5";
		double alturaReal = Double.parseDouble(altura);//El error en la declaración int alturaReal = Double.parseDouble(altura); se debe a que Double.parseDouble(altura) devuelve un valor de tipo double, no int.
		
		//int double = 96;
		int numero3 = 96; //double no se puede nombrar como variable.
		
		//a = 98;
		int aa = 98; //El error en la declaración a = 98; es que no se ha especificado el tipo de dato de la variable a.
		
		//int x = a;
		int x = aa; //El error en la declaración int x = a; es que la variable a no ha sido declarada ni inicializada previamente en el código.
		
		
		//int y = 25;
		String y = "25"; // no se detecta error, salvo que la variable este fuera del metodo o del codigo.
		
		//String g = y; 
		String g = y; //El error es que y es de tipo int y no se puede asignar directamente a una variable String sin conversión.
			
		
	}

}
