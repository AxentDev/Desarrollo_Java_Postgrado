package Clases;

public class OperadoresDeRelacion {
	
	public static void main(String args[]){
		
		// Aca todo se maneja por Boolean.
		// Las variables se nombre como igualQue ==, distintoQue !=, menorQue <, mayorQue >, menorIgualQue <=, mayorIgualQue >=.
		
		int a = 5;
		int b = 9;
		
		boolean igualQue = a == b;
		System.out.println("El resultado igual que es: " +igualQue);
		boolean distintoQue = a != b;
		System.out.println("El resultado igual que es: " +distintoQue);
		boolean menorQue = a < b;
		System.out.println("El resultado igual que es: " +menorQue);
		boolean mayorQue = a > b;
		System.out.println("El resultado igual que es: " +mayorQue);
		boolean menorIgualQue = a <= b;
		System.out.println("El resultado igual que es: " +menorIgualQue);
		boolean mayorIgualQue = a >= b;
		System.out.println("El resultado igual que es: " +mayorIgualQue);
				
	}

}
