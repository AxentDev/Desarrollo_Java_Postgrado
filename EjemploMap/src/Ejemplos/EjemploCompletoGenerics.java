package Ejemplos;
import java.util.ArrayList;
import java.util.List;

public class EjemploCompletoGenerics 
{
	public static void main(String[] args) 
	{
		// Uso de una clase genérica
	    Box<Integer> integerBox = new Box<>();
	    integerBox.setValue(10);
	    System.out.println("Valor en Box: " + integerBox.getValue());

	    // Uso de un método genérico
	    List<String> stringList = new ArrayList<>();
	    stringList.add("Generics");
	    stringList.add("in");
	    stringList.add("Java");
	    printList(stringList);
	}
	// Método genérico con un parámetro de tipo
	public static <E> void printList(List<E> list) 
	{
	    for (E element : list) 
	    {
	        System.out.println(element);
	    }
    }
}



