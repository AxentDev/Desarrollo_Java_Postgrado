package Ejemplos;

public class Ejemplo3Generics {

    // Método genérico para imprimir los elementos de un array.
    public <U> void printArray(U[] array) {
        for (U element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase.
        Ejemplo3Generics ejemplo = new Ejemplo3Generics();

        // Definir diferentes tipos de arrays.
        Integer[] arrayEnteros = { 1, 2, 3, 4, 5 };
        String[] arrayStrings = { "Hola", "Mundo", "Generics" };
        Double[] arrayDoubles = { 1.1, 2.2, 3.3 };

        // Llamar al método printArray con diferentes tipos de arrays.
        System.out.println("Array de Enteros:");
        ejemplo.printArray(arrayEnteros); // Imprime cada número en una línea nueva.

        System.out.println("\nArray de Strings:");
        ejemplo.printArray(arrayStrings); // Imprime cada cadena en una línea nueva.

        System.out.println("\nArray de Doubles:");
        ejemplo.printArray(arrayDoubles); // Imprime cada número en una línea nueva.
    }
}

