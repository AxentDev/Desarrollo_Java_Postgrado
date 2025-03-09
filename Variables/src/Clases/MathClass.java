package Clases;

public class MathClass {
	
	public static void main(String args[]){
		
		// Usando Math.PI
        double valorPi = Math.PI;
        System.out.println("El valor de Pi es: " + valorPi);

        // Usando Math.sqrt para obtener la raíz cuadrada
        double numero = 25.0;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        
        //Math.abs(x) = Devuelve el valor absoluto de un número.
        //Math.acos(x) = Devuelve el arco coseno de un número.
        //Math.acosh(x)= Devuelve el arco coseno hiperbólico de un número.
        //Math.asin(x) Devuelve el arco seno de un número
        //Math.atan(x) Devuelve el arco tangente de un número
        //Math.atan2(y, x) Devuelve el arco tangente del cociente de sus argumentos.
        //Math.cbrt(x) Devuelve la raíz cúbica de un número
        //Math.ceil(x) Devuelve el entero más pequeño mayor o igual que un número.
        //Math.cos(x) Devuelve el coseno de un número.
        //Math.cosh(x) Devuelve el coseno hiperbólico de un número.
        //Math.exp(x) Devuelve Ex, donde x es el argumento, y E es la constante de Euler (2.718...), la base de los logaritmos naturales.
        //Math.expm1(x) Devuelve ex - 1.
        //Math.floor(x) Devuelve el mayor entero menor que o igual a un número.
        //Math.hypot(x, y) Devuelve la hiponesusa o la raíz cuadrada de la suma de los cuadrados de sus argumentos.
        //Math.log(x) Devuelve el logaritmo natural (log, también ln) de un número.
        //Math.max(a, b) Devuelve el mayor de cero o más números
        //Math.min(a, b) Devuelve el más pequeño de cero o más números
        //Math.pow(x, y) Las devoluciones de base a la potencia de exponente, que es base exponent.
        //Math.random() Devuelve un número pseudoaleatorio entre 0 y 1
        //Math.round(x) Devuelve el valor de un número redondeado al número entero más cercano.
        //Math.sin(x) Devuelve el seno de un número.
        //Math.sinh(x) Devuelve el seno hiperbólico de un número.
        //Math.sqrt(x) Devuelve la raíz cuadrada positiva de un número.
        //Math.tan(x) Devuelve la tangente de un número.
        //Math.tanh(x) Devuelve la tangente hiperbólica de un número.
        //Math.E Devuelve el valor de E.
        //Math.PI Devuelve el valor de PI.
        
        System.out.println("Valor absoluto = " +Math.abs(-123));
        System.out.println("Hipotenusa = " +Math.hypot(15, 9));
        System.out.println("Logaritmo Natural = " +Math.log(3));
        System.out.println("Numero mayor = " +Math.max(4, 9));
        System.out.println("Numero menor = " +Math.min(4, 9));
        System.out.println("Potencia = " +Math.pow(5, 4));
        System.out.println("Numero aleatorio = " +Math.random()*100);
        System.out.println("Numero redondeado = " +Math.round(Math.random()*10));
        System.out.println("Raiz cuadrada = " +Math.sqrt(9));
        
	}


}
