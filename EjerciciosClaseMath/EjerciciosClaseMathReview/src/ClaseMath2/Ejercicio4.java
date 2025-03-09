package ClaseMath2;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		double numero1 = 1+ Math.random()*50;
		System.out.println("El numero 1 es: "+ numero1);
		double numero2 = 1+ Math.random()*50;
		System.out.println("El numero 2 es: "+ numero2);
		
		double redondearNumero1Metodo1 = Math.round(numero1);
		System.out.println("El numero redondeado por el metodo 1 es: " + redondearNumero1Metodo1);
		double redondearNumero1Metodo2 = Math.floor(numero1);
		System.out.println("El numero redondeado por el metodo 2 es: " + redondearNumero1Metodo2);
		double redondearNumero1Metodo3 = Math.ceil(numero1);
		System.out.println("El numero redondeado por el metodo 3 es: " + redondearNumero1Metodo3);
		
		double redondearNumero2Metodo1 = Math.round(numero2);
		System.out.println("El numero redondeado por el metodo 1 es: " + redondearNumero2Metodo1);
		double redondearNumero2Metodo2 = Math.floor(numero2);
		System.out.println("El numero redondeado por el metodo 2 es: " + redondearNumero2Metodo2);
		double redondearNumero2Metodo3 = Math.ceil(numero2);
		System.out.println("El numero redondeado por el metodo 3 es: " + redondearNumero2Metodo3);
		
		double numeroMayorMetodo1 = Math.max(redondearNumero1Metodo1, redondearNumero2Metodo1);
		System.out.println("El numero mayor por el metodo1 es: " + numeroMayorMetodo1);
		double numeroMayorMetodo2 = Math.max(redondearNumero1Metodo2, redondearNumero2Metodo2);
		System.out.println("El numero mayor por el metodo1 es: " + numeroMayorMetodo2);
		double numeroMayorMetodo3 = Math.max(redondearNumero1Metodo3, redondearNumero2Metodo3);
		System.out.println("El numero mayor por el metodo1 es: " + numeroMayorMetodo3);
	}

}
