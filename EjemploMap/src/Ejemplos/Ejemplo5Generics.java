package Ejemplos;

public class Ejemplo5Generics {

    // Clase genérica `Box` que solo acepta tipos que extiendan `Number`.
    class Box<T extends Number> {
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase contenedora `Ejemplo5Generics`.
        Ejemplo5Generics ejemplo = new Ejemplo5Generics();

        // Crear instancias de `Box` con diferentes tipos de números.
        Box<Integer> integerBox = ejemplo.new Box<>();
        integerBox.setValue(123);  // `Box` de tipo `Integer`.
        System.out.println("Valor en integerBox: " + integerBox.getValue()); // Imprime: Valor en integerBox: 123

        Box<Double> doubleBox = ejemplo.new Box<>();
        doubleBox.setValue(456.78); // `Box` de tipo `Double`.
        System.out.println("Valor en doubleBox: " + doubleBox.getValue()); // Imprime: Valor en doubleBox: 456.78

        Box<Float> floatBox = ejemplo.new Box<>();
        floatBox.setValue(9.99f);  // `Box` de tipo `Float`.
        System.out.println("Valor en floatBox: " + floatBox.getValue()); // Imprime: Valor en floatBox: 9.99

        // Intentar con tipos no permitidos causará un error de compilación.
        // Box<String> stringBox = ejemplo.new Box<>();  // Esto NO es válido y causará un error de compilación.
    }
}
