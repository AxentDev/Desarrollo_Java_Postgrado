package ClasesOperadores;

public class Ejercicio1 {
	
	public static void main(String args[]){
		
		//Crear una variable para almacenar el nombre de un estudiante.
		String nombreEstudiante = "Alejandro Tovar";
		System.out.println("El nombre del estudiante es: " + nombreEstudiante);
		
		//Crear 5 variables de tipo double para almacenar 5 diferentes notas decimales.
		double nota1 = 8.2;
		System.out.println("La nota No. 1 es: " + nota1);
		double nota2 = 7.1;
		System.out.println("La nota No. 2 es: " + nota2);
		double nota3 = 2.2;
		System.out.println("La nota No. 3 es: " + nota3);
		double nota4 = 10.0;
		System.out.println("La nota No. 4 es: " + nota4);
		double nota5 = 4;
		System.out.println("La nota No. 5 es: " + nota5);
		
		//Calcular el promedio final del estudiante a partir de las 5 notas decimales.
		//Calculo la suma de todas las notas:
		double suma;
		suma = nota1+nota2+nota3+nota4+nota5;
		System.out.println("La suma de las notas es: "+suma);
		
		//Indico el numero de notas por las que debe ser dividida la suma.
		int numeroDeNotas = 5;
		System.out.println("El número de notas es: "+numeroDeNotas);
		
		double promedio;
		promedio = suma/numeroDeNotas;
		System.out.println("El promedio de notas es: "+promedio);
				
		
	}

}
