package ClasesOperadores;

public class Ejercicio3 {
	
	public static void main(String args[]){
		
		//Crear una variable entera de nombre “numeroUno” con el valor de 8.
		int numeroUno = 8;
		System.out.println("El primer numero sin cambio es: " +numeroUno);
		//Crear una variable entera de nombre “numeroDos” con el valor de 2.
		int numeroDos = 2;
		System.out.println("El segundo numero sin cambio es: " +numeroDos);
		//Intercambiar los valores de ambas variables, de modo que “numeroUno” valga 2, y “numeroDos” valga 8.
		//Defino la variable auxiliar.
		int aux;
		//Intercambio valores.
		aux = numeroUno;
		numeroUno = numeroDos;
		System.out.println("El primer numero con cambio es: " +numeroUno);
		numeroDos = aux;
		System.out.println("El segundo numero con cambio es: " +numeroDos);
		
	}

}
