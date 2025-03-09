package ClaseMath;

public class Ejercicio4 {
	
	public static void main(String args[]){
	
		double numeroUno = 1+ Math.random()*50;
		System.out.println("El numero uno es: "+numeroUno);
		double numeroDos = 1+ Math.random()*50;
		System.out.println("El numero dos es: "+numeroDos);
		
		double numeroRedUno = Math.round(numeroUno);
		System.out.println("El numero redondeado uno es: "+numeroRedUno);
		double numeroRedDos = Math.round(numeroDos);
		System.out.println("El numero redondeado dos es: "+numeroRedDos);
		
		double numeroRedAbaUno = Math.floor(numeroUno);
		System.out.println("El numero redondeado abajo uno es: "+numeroRedAbaUno);
		double numeroRedAbaDos = Math.floor(numeroDos);
		System.out.println("El numero redondeado abajo dos es: "+numeroRedAbaDos);
		
		double numeroRedArrUno = Math.ceil(numeroUno);
		System.out.println("El numero redondeado arriba uno es: "+numeroRedArrUno);
		double numeroRedArrDos = Math.ceil(numeroDos);
		System.out.println("El numero redondeado arriba dos es: "+numeroRedArrDos);
		
		double maxNumero = Math.max(numeroUno, numeroDos);
		System.out.println("El numero mayor es: "+maxNumero);
		
		
	}
	
}
