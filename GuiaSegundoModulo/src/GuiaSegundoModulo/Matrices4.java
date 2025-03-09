package GuiaSegundoModulo;

public class Matrices4 {
	public static void main(String args[])
	{
		//Con base en el ejercicio anterior, realizar las siguientes operaciones:
		//1. Suma de todos los valores.
		//2. Resta de todos los valores.
		//3. Multiplicación de todos los valores.
		//4. Raíz cuadrada de la suma de todos los valores.
		//5. División de la multiplicación por la suma
		
		//DESARROLLO
		//Primero se deben declarar las variables en las que se van a almacenar las	operaciones que se realizarán basándose en la matriz:
		int numeros[][] = new int [5][4];
		//Una variable entera para la suma inicializada en 0 (para poder realizar la acumulación en base a la matriz).
		//Una variable entera para la resta inicializada en 0 (para poder realizar la acumulación en base a la matriz).
		int suma = 0, resta = 0;
		//Una variable entera para la multiplicación inicializada en 1 (para poder realizar la acumulación en base a la matriz).
		//Se inicia en 1 dado que, si se hace en 0, los resultados de las multiplicaciones serían 0.
		int multiplicacion = 1;
		//Una variable de coma flotante para la división.
		double division;
		//Una variable de coma flotante para la raiz.
		double raiz;
					
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				numeros[i][j] = (int) Math.ceil(Math.random()*100);
			}
			
		}
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				suma = suma + numeros[i][j];
				resta = resta - numeros[i][j];
				multiplicacion = multiplicacion * numeros[i][j];
				System.out.print(numeros[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		division = multiplicacion/suma;
		raiz = Math.sqrt(suma);
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+multiplicacion);
		System.out.println("La division es: "+division);
		System.out.println("La raiz cuadrada es: "+raiz);
	}
}
