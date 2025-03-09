package Ejemplos;

// Clase genérica Box que puede almacenar cualquier tipo de valor.
class Box<T> {
    private T value;

    // Método para establecer el valor.
    public void setValue(T value) {
        this.value = value;
    }

    // Método para obtener el valor.
    public T getValue() {
        return value;
    }
}

public class Ejemplo2Generics {
    public static void main(String[] args) {
        // Crear un Box de tipo String.
        Box<String> stringBox = new Box<>();
        
        // Establecer un valor en la caja.
        stringBox.setValue("Hello Generics");
        
        // Imprimir el valor de la caja.
        System.out.println(stringBox.getValue()); // Imprime: Hello Generics
    }
}
