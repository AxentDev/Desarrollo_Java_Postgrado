package ClaseMath;

public class Ejercicio3 {
	
	public static void main(String args[]){
	
		int nota1 = (int) (Math.random()*10);
		int nota2 = (int) (Math.random()*10);
		int nota3 = (int) (Math.random()*10);
		int nota4 = (int) (Math.random()*10);
		int nota5 = (int) (Math.random()*10);
		
		
		double suma;
		suma = nota1+nota2+nota3+nota4+nota5;
		System.out.println("La suma de las notas es: "+suma);
		
		int cantidad = 5;
		System.out.println("La cantidad de notas es: "+cantidad);
		
		double promedio;
		promedio = suma/cantidad;
		System.out.println("El promedio de las notas es: "+promedio);
	
	
	
	}
}
