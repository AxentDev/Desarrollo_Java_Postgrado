package Clases;

import java.io.BufferedReader;
import java.util.Scanner;

public class Variables {

	//¡¡¡ Numeros enteros!!!
	
	//byte: Emplea un sólo byte (8 bits) de almacenamiento. Esto permite almacenar valores entre [-128, 127]
	
	byte numeroByte = 9;
	
	//short: Emplea el doble de almacenamiento de (byte). Esto permite almacenar valores entre [-32.768, 32.767].
	
	short numeroShort = 32767;
	
	//int: Emplea un tamaño mayor, 4 bytes (32 bits). Esto permite almacenar valores entre [-2147483648, 2147483647.
	
	int numeroInt = 2147483647;
	
	//long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits). Esto permite almacenar valores entre [-9223372036854775808, 92233720368554775807].
	
	long numeroLong = 926465464697266565L;
	
	//¡¡¡Numeros flotantes!!!
	
	//float: Se usa para numeros decimales, con decimales cortos. Emplea un tamaño de 32 bits (4bites). Esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45].
	
	float numeroFloat = 5976464F;
	
	//Double: Se usa para numeros decimales, con decimales largos. Emplea un tamaño de 64 bits (8 bytes). Esto permite almacenar valores entre [-1.7976931348623157E+309, 4.94065645841246544E-324].
	double numeroDouble = 2654792142478F;
	
	//¡¡¡Booleanos y caracteres!!!
	
	//boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos (booleanos). Se traducen sus valores en true/falso.
	
	boolean variableBoolean = true;
	
	//char: Se emplea paraalmacenar caracteres individuales (letras, aunque puede contener npumeros). Utiliza 16 bits y se codifica sobre UTF-16 Unicode.
	
	char  numeroChar = 1;
	char letraChar = 'D';
	
	//¡¡¡Cadenas de caracteres!!!
	
	//String se emplea creando una instancia de la clase String aunque parezca trabajar con datos primitivos. Es una clase en Java para representar y manipular secuencias de caracteres. Una vez creado, su valor no cambia. Ofrece métodos para manipular y obtener información sobre la cadena, como length(), charAt(), substring(), y toUpperCase().
	
	String variableString = "Hola a todos.";

	//¡¡¡Vectores - arrays!!!
	
	// Vector - Arreglo: Se emplea para almacenar un grupo de datos del mismo tipo.
	
	//Forma 1: Crea un array de enteros con 10 posiciones.
	int vectorNumeros1[] = new int [10];
	//Forma 2:Crea un array de enteros con 10 posiciones.
	int []vectorNumeros2 = new int [10];
	//Forma 3: Crea un array de enteros con 10 posiciones.
	int[] vectorNumeros3 = new int [10];
	//Forma 4: Declara una variable de referencia para un array de enteros, pero no inicializa el array. Antes de usar vectorNumeros4, debes inicializarlo con new int[tamaño] para asignarle memoria y definir su tamaño.
	int vectorNumeros4[];
	//Forma 5: Crea un array unidimensional vacío con longitud 0.No se puede acceder a elementos ni iterar sobre el array porque no contiene datos. Es útil en situaciones donde se desea inicializar un array sin elementos o cuando se espera que el array se modifique más tarde.
	int vectorNumeros5[] = {};
	//Forma 6: Crea un array de enteros con 10 elementos. Puedes acceder a cada elemento del array usando índices, desde vectorNumeros6[0] hasta vectorNumeros6[9].
	int vectorNumeros6[] = {9,8,7,6,5,4,3,2,1,0};
	//Forma 7: Crea un array de enteros con 10 elementos y lo inicializa con los valores del 9 al 0 en orden descendente. Puedes acceder a cada elemento del array usando índices, desde vectorNumeros7[0] hasta vectorNumeros7[9].
	int vectorNumeros7[] = new int[] {9,8,7,6,5,4,3,2,1,0};
	
	
	//Matriz: Es una estructura de datos que permite almacenar múltiples valores del mismo tipo de forma bidimensional basados en [x], [y]. Ejemplo: int[][] matriz = new int[3][3]; // Crea una matriz de 3x3.
	
	//Forma 1: Cuando declaras e inicializas una matriz en Java con int matrizNumeros1[][] = new int[4][5];, estás creando una matriz bidimensional de enteros con 4 filas y 5 columnas. 
	int matrizNumeros1[][] = new int[4][5];
	//Forma 2: Estás creando una matriz bidimensional de enteros con 4 filas y 5 columnas. 
	int [][]matrizNumeros2 = new int[4][5];
	//Forma 3: Estás creando una matriz bidimensional de enteros con 4 filas y 5 columnas. 
	int[][] matrizNumeros3 = new int[4][5];
	//Forma 4: Declara una variable de referencia para una matriz bidimensional de enteros, pero no asigna memoria ni inicializa la matriz. Antes de usar matrizNumeros4, debes inicializarla con new int[filas][columnas] para asignarle memoria y definir sus dimensiones.
	int matrizNumeros4[][];
	//Forma 5: Crea una matriz bidimensional vacía con 0 filas y 0 columnas. No se puede acceder a elementos ni iterar sobre la matriz porque no contiene datos. Es útil en casos donde se quiere inicializar una matriz sin datos o en situaciones donde se espera modificar la matriz posteriormente.
	int matrizNumeros5[][] = {};
	//Forma 6: Este código crea una matriz bidimensional con los valores { {1, 2}, {3, 9} }.
	int matrizNumeros6[][] = {{1,2},{3,9}};
	//Forma 7: Este código crea una matriz bidimensional con los valores { {6, 2}, {2, 7} }.
	int matrizNumeros7 [][]= new int [][] {{6,2}, {2,7}}; 
	
	//¡¡¡Tipos estructurados definidos por el usuario!!!
	
	//Variable tipo persona (Persona es una clase).
	Persona P;
	//Variable tipo animal (Animal es una clase).
	Animal A;
	//Variable de Java de la clase Math.
	Math M;
	//Variable de Java de la clase Scanner.
	Scanner S;
	//Variable de Java de la clase BufferedReader.
	BufferedReader B;
	
	//¡¡¡Wrappers!!!
	
	//Estos tipos son equivalentes a los primitivos pero en forma de objetos son: Byte, Short, Integer, Long, Float, Double, Boolean y Character (8 igualmente).
	
	//Representación de byte en Byte.
	Byte numeroByte1 = 1;
	//Representación de short en Short.
	Short numeroShort1 = 2416;
	//Representación de int en Integer.
	Integer numeroInteger1 = 95256712;
	//Representación de long en Long.
	Long numeroLong1 = 5213714121L;
	//Representación de float en Float.
	Float numeroFloat1 = 6591342543251F;
	//Representación de double en Double.
	Double numeroDouble1 = 9.3;
	//Representación de booblean en Boolean.
	Boolean variableBoolean1 = true;
	//Representación de char en Character.
	Character variableCharacter1 = 'A';
	Character numeroCharacter1 = 2;
	
	//¡¡¡Caracteristicas que se deben tener en cuenta almomento de utilizar las variables dentro del lenguaje!!!
	// revisar el documento guia ya que son puros errores.
	
	//Constantes = Son numeros o textos que no cambian como en excel fijar una celda. Y para fijar se coloca al inicio la palabra "final".
	
	final int documento = 921474159;
	final char letraA = 'A', letraB = 'B', letraC = 'C';
	final String acronimo = "CC";
	final float pi = 3.1415F;
}
