package ClasesVariables;

import java.text.DecimalFormat;

public class Ejercicio1 {
	
	public static void main(String args[]){
		
		//Crear una variable que me permita almacenar el nombre de una persona.
		String nombrePersona = "Alejandro Tovar";
		System.out.println("El nombre de la persona es: "+nombrePersona);
		
		//Una variable “x” para almacenar un número con 2 decimales.
		double x = 9.2;
		DecimalFormat formato = new DecimalFormat("#.00");
		System.out.println("La variable “x” para almacenar un número con 2 decimales es: "+ formato.format(x));
		
		//Una variable constante para almacenar el valor del dólar. Para esto utilizo "Final".
		final double valorDelDolar = 4247.64;
		System.out.println("La variable constante para almacenar el valor del dolar es: "+valorDelDolar);
		
		//Una variable primitiva float para almacenar los primeros 7 decimales de “PI”.
		float pi = 3.14159265359f;
		DecimalFormat formatoPi = new DecimalFormat("#.0000000");
		System.out.println("La variable primitiva para almacenar los primeros 7 decimales de “PI” es: "+ formatoPi.format(pi));
		
		//Una variable de estructura tipo Double para almacenar los primeros 15 decimales de “Euler”.
		double euler = 2.718281828459045;
		System.out.println("La variable de estructura para almacenar los primeros 15 decimales de “Euler” es: "+euler);
	
		
	}

}
