package GuiaSegundoModulo;

public class GuiaModuloDosDos {
	
	public static void main(String args[]) {
		
		// ||: Suma lógica cortocircuito ||: (5 == 5) || (5 < 4): Si la primera expresión es true, la segunda no se evalúa, ya que el resultado final será true independientemente del valor de la segunda expresión. Este comportamiento se denomina cortocircuito. Si la primera expresión es false, entonces se evalúa la segunda, y el resultado final dependerá de esta. Como el primer operando en este caso es true, no evalúa el segundo operando. 5 == 5 es true, 5 < 4 es false, true || false evalúa a true. Por lo tanto, el resultado de la expresión (5 == 5) || (5 < 4) es true.
		// &&: Producto lógico cortocircuito &&: (5 == 5) && (5 < 4): El operador && solo devuelve true si ambas condiciones son verdaderas. Si alguna de ellas es false, el resultado completo será false.
		// !: Usa dos operadores: Operador de igualdad ==: Compara si dos valores son iguales.Operador de negación !: Invierte el resultado de una expresión booleana
		
		//Evaluación de la primera fila
		
		// Se incian ambas variables P y Q, donde P y Q deben ser true o verdaderas.
		boolean p = true;
		boolean q = true;
		
		if (p && q) {
		
		// Ejecucion en caso que P y Q sean veraderas.
		
		System.out.println("P y Q tienen un valor true");
			
		
		}
		
		// Segunda condicion deonde P o Q tienen que ser true.
		
		if (p || q) {
			
		// Ejecucion en caso que P o Q sean veraderas.
			
		System.out.println("P o Q tienen un valor true");
		
		}
		
		// Tercera condicion donde P al ser true, agrega el operador "!", y lo converte en false (Sólo en ejecución de la condición, la variable P sigue siendo true).
		
		if(!p) {
			
		System.out.println("P tiene un valor true");
		}
		
		
		
	}

}
