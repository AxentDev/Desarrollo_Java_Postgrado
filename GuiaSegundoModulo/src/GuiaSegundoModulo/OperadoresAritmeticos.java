package GuiaSegundoModulo;

public class OperadoresAritmeticos 
{
	public static void main(String args[])
	{
	
//****************************************************************************************************************************************************************
//1. Suma (+)
//Suma dos operandos.

	int a = 5;
	int b = 3;
	int suma = a + b;  // suma = 8
	
//****************************************************************************************************************************************************************
//2. Resta (-)
//Resta el segundo operando del primero.

	int resta = a - b;  // resta = 2
	
//****************************************************************************************************************************************************************	
//3. Multiplicación (*)
//Multiplica dos operandos.

	int multiplicacion = a * b;  // multiplicacion = 15
	
//****************************************************************************************************************************************************************	
//4. División (/)
//Divide el primer operando por el segundo. Ten en cuenta que si ambos operandos son enteros, el resultado será un entero (truncando el decimal).

	int divisionEntera = a / b;  // divisionEntera = 1
	double divisionDecimal = (double) a / b;  // divisionDecimal = 1.666...
	
//****************************************************************************************************************************************************************	
//5. Módulo (%)
//Devuelve el resto de la división del primer operando por el segundo.

	int modulo = a % b;  // modulo = 2 (5 mod 3 es 2)
	
//****************************************************************************************************************************************************************
//6. Incremento (++)
//Incrementa el valor de un operando en 1. Puede ser prefijo o sufijo. 
//Prefijo: ++ a (incrementa antes de usar el valor). 
//Sufijo: a++ (usa el valor antes de incrementarlo)
	
	int incrementoPrefijo = ++a;  // c = 6, incrementoPrefijo = 6
	int incrementoSufijo = a++;    // c = 7, incrementoSufijo = 6
	
//****************************************************************************************************************************************************************	
//7. Decremento (--)
//Decrementa el valor de un operando en 1. También puede ser prefijo o sufijo.

//Prefijo: --a
//Sufijo: a--

	int decrementoPrefijo = --a;  // d = 4, decrementoPrefijo = 4
	int decrementoSufijo = a--;    // d = 3, decrementoSufijo = 4
	
//****************************************************************************************************************************************************************	
//Ejemplo completo
//Aquí tienes un ejemplo que usa todos estos operadores:


	        int x = 10;
	        int y = 3;

	        System.out.println("Suma: " + (x + y));                // 13
	        System.out.println("Resta: " + (x - y));               // 7
	        System.out.println("Multiplicación: " + (x * y));     // 30
	        System.out.println("División: " + (x / y));            // 3
	        System.out.println("División decimal: " + ((double)x / y));  // 3.333...
	        System.out.println("Módulo: " + (x % y));              // 1

	        a++;  // Incremento
	        System.out.println("Incremento: " + a);               // 11

	        b--;  // Decremento
	        System.out.println("Decremento: " + b);               // 2
	    }
	}

//****************************************************************************************************************************************************************
//Resumen
//Suma, Resta, Multiplicación, División, Módulo: Operaciones básicas.
//Incremento y Decremento: Cambian el valor de la variable en 1, pueden ser prefijo o sufijo.

