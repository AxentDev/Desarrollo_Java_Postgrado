package ClaseMath;

public class Ejercicio1 {

	public static void main(String args[]) {
		//nos piden calcular la potencia
		//identifico variables enteras
		int totalBase = 5;
		int totalExponente = 9;
		//ejecuto la funcion mtah.pow, ojo aca se eleva con la coma ",". OJO la funcion aplica solo con double.
		double potencia = Math.pow(totalBase, totalExponente);
		System.out.println("El resultado de la potencia es: " + potencia);
		
		
	}
}
