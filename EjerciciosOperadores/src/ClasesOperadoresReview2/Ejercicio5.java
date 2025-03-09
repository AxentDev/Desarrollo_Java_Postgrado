package ClasesOperadoresReview2;

public class Ejercicio5 {
	
	public static void main(String args[]) {
		
		int ladoCuadrado = 8;
		double areaCuadrado = ladoCuadrado*ladoCuadrado; 
		double perimetroCuadrado = ladoCuadrado+ladoCuadrado+ladoCuadrado+ladoCuadrado;
		System.out.println("El resultado del area del cuadrado es. "+areaCuadrado);
		System.out.println("El resultado del perimetro del cuadrado es. "+perimetroCuadrado);
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
		double areaTriangulo = (baseTriangulo*alturaTriangulo)/2; 
		double perimetroTriangulo = ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;
		System.out.println("El resultado del area del Triangulo es. "+areaTriangulo);
		System.out.println("El resultado del perimetro del Triangulo es. "+perimetroTriangulo);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		double areaRectangulo = (baseRectangulo*alturaRectangulo); 
		double perimetroRectangulo = (2*baseRectangulo)+(2*alturaRectangulo);
		System.out.println("El resultado del area del Rectangulo es. "+areaRectangulo);
		System.out.println("El resultado del perimetro del Rectangulo es. "+perimetroRectangulo);
		
	}

}
