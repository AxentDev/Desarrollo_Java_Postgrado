package Ejemplos;

// Definición de la clase contenedora con un nombre diferente (por ejemplo, "EjemploGenerics").
public class EjemploGenerics 
{
	// Clase genérica Box definida dentro de la clase contenedora.
	class Box<T> 
	{
	    private T value; // Campo privado de tipo genérico T.

	    // Método para establecer el valor.
	    public void setValue(T value) {
	        this.value = value;
	    }

	    // Método para obtener el valor.
	    public T getValue() {
	        return value;
	    }
	}

	public static void main(String[] args) 
	{
		// Instanciar la clase contenedora para acceder a la clase interna.
		EjemploGenerics EjemploGenerics = new EjemploGenerics();
		Box<Integer> integerBox = EjemploGenerics.new Box<>(); // Crear un Box de tipo Integer.
		// Usar los métodos de la clase genérica.
		integerBox.setValue(123);
		System.out.println("Valor en la caja: " + integerBox.getValue()); // Imprime: Valor en la caja: 123
 }
}

