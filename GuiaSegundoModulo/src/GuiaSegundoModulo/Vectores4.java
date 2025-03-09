package GuiaSegundoModulo;

public class Vectores4 
{
	//Desarrollar un ejercicio que, dado un vector de cinco nombres, cambie todas las letras de los nombres por números, de manera que el nombre termine estando compuesto por solo números.
	public static void main(String args[])
	{
		String nombres[] = {"JUAN", "EVELIN", "ANA", "MARK", "DIEGO"};//Nombres de almacenamiento.
		char caracteres[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//Caracteres del abecedario.
		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};//Numeros del abecedario.
		
		int x = 0;//Variable para administrar el ciclo while.
		String nombreAuxiliar = "";//Variable de almacenamiento de campos numericos.
		while (x < 5)//Codigo while con tamaño de 5 porque son 5 nombres.
		{
			for (int j = 0; j < nombres[x].length(); j++)//recorre los caracteres de cada nombre.
			{
				for (int k=0; k < caracteres.length; k++)//recorre los caracteres de cada letra del abecedario.
				{
					if(nombres[x].charAt(j) == caracteres[k])//condicional para determinar qué carácter del nombre le equivale qué número ya establecido.
					{
						nombreAuxiliar = nombreAuxiliar+numeros[k];
					}
					
				}
			}
			nombres[x] = nombreAuxiliar;
			System.out.println(nombres[x]);
			nombreAuxiliar = "";
			x++;
			
		}
		
		//La condicional opera gracias al funcionamiento de los tres ciclos, de la siguiente forma:
		//nombres[x]: representa el valor de un nombre determinado por la iteración	del ciclo while.
		//nombres[x].charAt(j): representa los caracteres del nombre que se	encuentra en iteración (recordemos: charAt permite recorrer todos los caracteres de un string, en este caso, por medio de un índice).
		//caracteres[k]: representa los caracteres definidos en el vector del abecedario.
		//La operación de concatenación que representa el funcionamiento correcto del ejercicio es la siguiente:
		//nombreAuxiliar = nombreAuxiliar+numeros[k];
		//La variable va concatenando (no sumando) todos los valores que conforman un nombre hasta llegar al final del recorrido.
		//Finalmente, se reemplaza el nombre de la iteración actual con el nombre creado a partir de números nombres[x] = nombreAuxiliar;
		//Se imprime el resultado del nombre nuevo:System.out.println(nombres[x]);
		//Se reinicia la variable auxiliar para la próxima iteración:nombreAuxiliar = "";
		//Se realiza el incremento para las próximas iteraciones: x++;

	}

}
