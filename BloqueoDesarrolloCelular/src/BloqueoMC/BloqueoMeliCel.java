package BloqueoMC;

import java.util.HashSet;
import java.util.Scanner;

public class BloqueoMeliCel 
{
	
	    public static void main(String[] args) 
	    {
	        // Lista de números autorizados
	        HashSet<String> numerosAutorizados = new HashSet<>();
	        numerosAutorizados.add("+573001234567");
	        numerosAutorizados.add("+573112345678");
	        numerosAutorizados.add("+573212345678");

	        // Entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número que intenta contactar: ");
	        String numeroLlamante = scanner.nextLine();

	        // Verificar el número
	        String resultado = verificarNumero(numeroLlamante, numerosAutorizados);
	        System.out.println(resultado);

	        scanner.close();
	    }

	    /**
	     * Verifica si el número es conocido o desconocido.
	     * No bloquea números que empiezan por "609".
	     * 
	     * @param numeroLlamante El número que intenta contactar
	     * @param numerosAutorizados La lista de números autorizados
	     * @return Mensaje indicando si el número está autorizado o bloqueado
	     */
	    public static String verificarNumero(String numeroLlamante, HashSet<String> numerosAutorizados) 
	    {
	        if (numeroLlamante.startsWith("609")) 
	        {
	            return "Número permitido. Empieza por '609'.";
	        } else if (numerosAutorizados.contains(numeroLlamante)) 
	        {
	            return "Número autorizado. Permitir la llamada/mensaje.";
	        } 
	        else 
	        {
	            return "Número desconocido. Bloquear llamada/mensaje.";
	        }
	    }
}



