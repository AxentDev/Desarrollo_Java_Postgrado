package ClasesOperadores;

public class Ejercicio6 {
	
	public static void main(String args[]){
		
		//Crear una variable entera llamada “ladoCuadrado” de valor 8.
		int ladoCuadrado = 8;
		//Calcular el área y el perímetro del cuadrado a partir de la variable anteriormente creada.
		//Procedo a calcular el area.
		double areaCuadrado = ladoCuadrado * ladoCuadrado;
		System.out.println("El resultado del area del cuadrado es: "+areaCuadrado);
		//Procedo a calcular el perimetro.
		double perimetroCuadrado = ladoCuadrado + ladoCuadrado + ladoCuadrado + ladoCuadrado;
		System.out.println("El resultado del perimetro del cuadrado es: "+perimetroCuadrado);
				
		//Crear una variable entera llamada “baseTriangulo” de valor 9.
		int baseTriangulo = 9;
		//Crear una variable entera llamada “alturaTriangulo” de valor 8.
		int alturaTriangulo = 8;
		//Crear dos variables enteras llamadas “ladoUnoTriangulo” y	“ladoDosTriangulo” de valor 8 ambas.
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
		//Calcular el área y el perímetro del triángulo a partir de variables anteriormente creadas.
		//Procedo a calcular el area.
		double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
		System.out.println("El resultado del area del triangulo es: "+areaTriangulo);
		//Procedo a calcular el perimetro.
		double perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;
		System.out.println("El resultado del perimetro del triangulo es: "+perimetroTriangulo);
		
		//Crear una variable entera llamada “baseRectangulo” de valor 8.
		int baseRectangulo = 8;
		//Crear una variable entera llamada “alturaRectangulo” de valor 6.
		int alturaRectangulo = 6;
		//Calcular el área y el perímetro del rectángulo a partir de variables anteriormente creadas.
		//Procedo a calcular el area.
		double areaRectangulo = baseRectangulo*alturaRectangulo;
		System.out.println("El resultado del area del rectangulo es: "+areaRectangulo);
		//Procedo a calcular el perimetro.
		double perimetroRectangulo = 2*(baseRectangulo + alturaRectangulo);
		System.out.println("El resultado del perimetro del rectangulo es: "+perimetroRectangulo);
		
	}

}
