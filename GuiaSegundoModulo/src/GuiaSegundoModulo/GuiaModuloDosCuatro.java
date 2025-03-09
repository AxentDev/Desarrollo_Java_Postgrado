package GuiaSegundoModulo;

public class GuiaModuloDosCuatro {
	
	public static void main(String args[]) {
		
		//Evaluación de la tercera fila
		
		// Se incian ambas variables P y Q, donde P y Q deben ser true o verdaderas.
		boolean p = false;
		boolean q = false;
					
		if (p && q) {
					
		// Ejecucion en caso que P y Q sean true.
				
		System.out.println("P y Q tienen un valor true");	
						
		}
						
		// Segunda condicion deonde P o Q tienen que ser true.
						
		if (p || q) {
							
		// Ejecucion en caso que P o Q sean true.
							
		System.out.println("P o Q tienen un valor true");
						
		}
						
		// Tercera condicion donde P al ser true, agrega el operador "!", y lo converte en false (Sólo en ejecución de la condición, la variable P sigue siendo true).
						
		if(!p) {
							
		System.out.println("P tiene un valor true");
		}
		
	}

}
