package EjemploMap;

import java.util.HashMap;

public class EjemploHashMap 
{
	public static void main(String[] args)
	{
	// Crear un HashMap
	HashMap<String, Integer> mapa = new
	HashMap<>();
	// Agregar pares clave-valor
	mapa.put("Juan", 25);
	mapa.put("María", 31);
	// Recuperar valor por clave
	System.out.println(mapa.get("Juan")); // 25
	// Verificar si una clave existe
	System.out.println(mapa.containsKey("María")); // true }}
	}
}
