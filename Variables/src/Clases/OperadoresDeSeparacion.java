package Clases;

public class OperadoresDeSeparacion {
	
	public static void main(String args[]){
		
		//(): Permite modificar la prioridad de una expresión, contener expresiones para el control del flujo y realizar conversiones de tipo. Por otro lado, pueden contener la lista de parámetros o argumentos, tanto en la definición de un método como en la llamada al mismo.
		//{}: Permite definir bloques de código y ámbitos y contener los valores iniciales de un array.
		//[]: Permite declarar bloques de array (vectores o matrices) y	referenciar sus elementos.
		// ; : Permite separar sentencias oordenes de ejecucion recordar el ; al final de cada oración.
		// , : Separa identificadores consecutivos en la declaración de	variables y en las listas de parámetros. También se emplea para	encadenar sentencias dentro de un ciclo for.
		// . : Permite separar el nombre de un atributo o método de su instancia de referencia. También separa el identificador de un paquete de los subpaquetes y clases.
		
		int a = 5;
		int b = 9;
		int c = 2;
		
		double suma = (a+b)*c;
		System.out.println(suma);
		double arreglo[] = {c, b};
		System.out.println(arreglo);
		//La clase math constituye la librería matemática de Java. Contiene funciones como las de todos los lenguajes, parece que se han metido en una clase solamente a propósito de agrupación, por eso se encapsulan en math, y lo mismo sucede con	las demás clases que corresponden a objetos que tienen un tipo equivalente	(character, float, etc.).
		double euler = Math.E;
		System.out.println(euler);
		
		
	}

}
