package ClasesOperadoresReview;

public class Ejercicio5 {
	
	public static void main(String args[]) {
		
		double resultado =  (9/2)+8*2/1-(2+2)+(9/2)+8*2/1-(2+2)+(9/2)+8*2/1-(2+2);
		
		System.out.println("El resultado de la operacion es: "+resultado);
		
		
		int ladoCuadrado = 8;
		double areaCuadrado = ladoCuadrado*ladoCuadrado;
		double perimetroCuadrado = ladoCuadrado+ladoCuadrado+ladoCuadrado+ladoCuadrado;
		System.out.println("El resultado del area del cuadrado es: "+areaCuadrado);
		System.out.println("El resultado del perimetro del cuadrado es: "+perimetroCuadrado);

		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
				System.out.println("El resultado del area del triangulo es: "+areaTriangulo);
		
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
				
		double perimetroTriangulo = (baseTriangulo+ladoUnoTriangulo+ladoDosTriangulo);
		System.out.println("El resultado del perimetro del triangulo es: "+perimetroTriangulo);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		double perimetroRectangulo = 2*(baseRectangulo + alturaRectangulo);
				double areaRectangulo = baseRectangulo*alturaRectangulo;
		System.out.println("El resultado del area del rectangulo es: "+areaRectangulo);
		System.out.println("El resultado del perimetro del rectangulo es: "+perimetroRectangulo);
		
		
	}

}
