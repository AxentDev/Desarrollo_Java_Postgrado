package GuiaSegundoModulo;

public class GuiaModuloDosUno {
	
	public static void main(String args[]) {
		
		if (9<12 && 2<=4) {
			
			System.out.println("9 si es menor a 12");
			System.out.println("2 si es menor o igual a 4");
			
			// ||: Suma lógica cortocircuito ||: (5 == 5) || (5 < 4): Si la primera expresión es true, la segunda no se evalúa, ya que el resultado final será true independientemente del valor de la segunda expresión. Este comportamiento se denomina cortocircuito. Si la primera expresión es false, entonces se evalúa la segunda, y el resultado final dependerá de esta. Como el primer operando en este caso es true, no evalúa el segundo operando. 5 == 5 es true, 5 < 4 es false, true || false evalúa a true. Por lo tanto, el resultado de la expresión (5 == 5) || (5 < 4) es true.
			// &&: Producto lógico cortocircuito &&: (5 == 5) && (5 < 4): El operador && solo devuelve true si ambas condiciones son verdaderas. Si alguna de ellas es false, el resultado completo será false.
			// !: Usa dos operadores: Operador de igualdad ==: Compara si dos valores son iguales.Operador de negación !: Invierte el resultado de una expresión booleana.
		}
	}

}
