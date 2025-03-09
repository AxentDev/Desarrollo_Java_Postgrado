package Clases;

public class OperadoresLogicos {
	
	public static void main(String args[]){
		
		// Aca todo se usa con Boolean.
		// Las variables se nombran: negacion (!), sumaLogica (|), sumaLogicaExclusiva (^), productoLogico (&), sumaLogicaCortocircuito (||), productoLogicoCortocircuito (&&).
		// Negacion (unitario) !: !(5 == 5): Usa dos operadores: Operador de igualdad ==: Compara si dos valores son iguales.Operador de negación !: Invierte el resultado de una expresión booleana. 5 == 5 evalúa a true.! invierte este valor o cambia la respuesta a lo contrario, por lo que !(5 == 5) da como resultado false.
		// Suma lógica (binario) |: (5==5) | (5 < 4): Devuelve true si al menos uno de los operandos es true. 5==5 es true, 5 <4 es false. Por lo tanto, el resultado de la expresión (5==5) | (5<4) es true.  
		// Suma lógica exclusiva ^: (5 == 5) ^ (5 < 4). 5 == 5: Esta comparación verifica el resultado es true, si uno es true y el otro es false. Y false si ambos son true o ambos son false. Por lo tanto, el resultado de la expresión (5 == 5) ^ (5 < 4) es true.
		// Producto lógico (binario) &: (5 == 5) & (5 < 4): Este operador devuelve true si ambos operandos son true, y false en cualquier otro caso. A diferencia del operador lógico AND (&&), el operador & siempre evalúa ambos operandos, incluso si el primero es false. 5 == 5 es true, 5 < 4 es false, true & false evalúa a false. Por lo tanto, el resultado de la expresión (5 == 5) & (5 < 4) es false.
		// Suma lógica cortocircuito ||: (5 == 5) || (5 < 4): Si la primera expresión es true, la segunda no se evalúa, ya que el resultado final será true independientemente del valor de la segunda expresión. Este comportamiento se denomina cortocircuito. Si la primera expresión es false, entonces se evalúa la segunda, y el resultado final dependerá de esta. Como el primer operando en este caso es true, no evalúa el segundo operando. 5 == 5 es true, 5 < 4 es false, true || false evalúa a true. Por lo tanto, el resultado de la expresión (5 == 5) || (5 < 4) es true.
		// Producto lógico cortocircuito &&: (5 == 5) && (5 < 4): El operador && solo devuelve true si ambas condiciones son verdaderas. Si alguna de ellas es false, el resultado completo será false.
		
		int a = 5;
		int b = a;
		int c = 4;
		
		boolean negacion = !(a==b);
		System.out.println(negacion);
		boolean negacion1 = !false;
		System.out.println(negacion1);
		boolean sumaLogica = (a==b)|(a<c);
		System.out.println(sumaLogica);
		boolean sumaLogicaExclusiva = (a==b)^(a<c);
		System.out.println(sumaLogicaExclusiva);
		boolean productoLogico = (a==b)&(a<c);
		System.out.println(productoLogico);
		boolean sumaLogicaCortocircuito = (a==b)||(a<c);
		System.out.println(sumaLogicaCortocircuito);
		boolean productoLogicoCortocircuito = (a==b)&&(a<c);
		System.out.println(productoLogicoCortocircuito);
	}

}
