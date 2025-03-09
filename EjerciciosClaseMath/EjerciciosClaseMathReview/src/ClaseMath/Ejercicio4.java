package ClaseMath;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		double numero1 = 1+ (Math.random()*49);
		System.out.println("El numero es: " +numero1);
		double numero2 = 1+ (Math.random()*49);
		System.out.println("El numero es: " +numero2);
		
		
		double redondearNumero1 = Math.round(numero1);
		double redondearNumero2 = Math.round(numero1);
		
		double maximoNumero = Math.max(redondearNumero1, redondearNumero2);
		System.out.println("El mayor numero es: " +maximoNumero);
		
		
	

		
	}

}
