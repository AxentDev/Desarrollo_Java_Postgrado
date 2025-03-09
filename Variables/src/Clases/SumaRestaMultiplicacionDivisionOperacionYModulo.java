package Clases;

public class SumaRestaMultiplicacionDivisionOperacionYModulo {

	public static void main(String args[]) 
	{
		double numero1 = 12.2;
		int numero2 = 2;
		double division;
		double suma, resta, multiplicacion;
		double modulo;
		float operacion;
		
		operacion = 9/3*5-3+8*2;
		System.out.println("El resultado de la operacion es: " +operacion);	
		resta = numero1-numero2;
		System.out.println("El resultado de la resta es: " +resta);	
		multiplicacion = numero1*numero2;
		System.out.println("El resultado de la multiplicacion es: " +multiplicacion);	
		division = numero1/numero2;
		System.out.println("El resultado de la division es: " +division);	
		modulo = numero1%numero2;
		System.out.println("El resultado del modulo es: " +modulo);
		suma = numero1+numero2;
		System.out.println("El resultado de la suma es: " +suma);
	}
	
}
