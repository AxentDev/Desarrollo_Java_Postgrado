package Ejemplos;

public class Ejemplo4Generics {

    // Definir la interfaz genérica Pair.
    interface Pair<K, V> {
        K getKey();    // Obtener la clave.
        V getValue();  // Obtener el valor.
    }

    // Implementación de la interfaz Pair.
    class OrderedPair<K, V> implements Pair<K, V> {
        private K key;
        private V value;

        // Constructor para inicializar clave y valor.
        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase contenedora para acceder a las clases internas.
        Ejemplo4Generics ejemplo = new Ejemplo4Generics();

        // Crear pares utilizando OrderedPair con diferentes tipos de datos.
        OrderedPair<String, Integer> par1 = ejemplo.new OrderedPair<>("Uno", 1);
        OrderedPair<String, String> par2 = ejemplo.new OrderedPair<>("Hola", "Mundo");
        OrderedPair<Integer, Double> par3 = ejemplo.new OrderedPair<>(123, 456.78);

        // Imprimir los pares.
        System.out.println("Par 1: Clave = " + par1.getKey() + ", Valor = " + par1.getValue());
        System.out.println("Par 2: Clave = " + par2.getKey() + ", Valor = " + par2.getValue());
        System.out.println("Par 3: Clave = " + par3.getKey() + ", Valor = " + par3.getValue());
    }
}

