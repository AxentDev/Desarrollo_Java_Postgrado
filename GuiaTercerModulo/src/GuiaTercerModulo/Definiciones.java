package GuiaTercerModulo;

public class Definiciones {
//Las clases en Java son básicamente una plantilla que sirve para crear	un objeto
	
//En Java, un objeto es una instancia de una clase que encapsula tanto datos (atributos) como comportamientos (métodos). 
//Los objetos son fundamentales en la programación orientada a objetos (OOP) y permiten modelar entidades del mundo real de una manera que es fácil de entender y manipular en código.
//Juan, Andrés,	Evelin y Nicol son objetos de la clase persona, ya que todos son personas.
	
//Setters: hacen referencia a la acción de «establecer», sirven para asignar un	valor inicial a un atributo, pero de forma explícita; además, el setter nunca retorna
//nada (siempre asigna) y solo permite dar acceso público a ciertos atributos que el usuario pueda modificar.
	
//Atributo: es una variable que se define dentro de una clase y que representa una característica o propiedad del objeto creado a partir de esa clase. 
//Los atributos se utilizan para almacenar datos o información sobre el estado del objeto. En otras palabras, los atributos son las propiedades que describen las características del objeto.
//En este ejemplo, los atributos de la clase Persona son nombre, edad, y altura. Cada objeto de la clase Persona tendrá su propia copia de estos atributos.
	
//Parametros: Variables definidas en la firma del método. Ejemplo: void saludar(String nombre) (donde nombre es un parámetro). Se utilizan para recibir datos en el método.
	
//Argumentos: Valores reales pasados al método. Ejemplo: saludar("Juan") (donde "Juan" es un argumento). Se utilizan al llamar al método.

//this: La palabra this ayuda a diferenciar el atributo de la clase y el parámetro, dado que sin este se estaría operando únicamente con el parámetro, dejando a un	lado los atributos.
	
//Objeto: es una instancia de una clase que encapsula tanto datos (atributos) como comportamientos (métodos).
	
//Metodo: En Java, un método es un bloque de código que realiza una tarea específica y que se puede invocar (o llamar) desde otras partes del programa.
//Ejemplo: Método que suma dos números y devuelve el resultado. public int sumar(int a, int b) { // 'a' y 'b' son parámetros return a + b; // Suma los parámetros y devuelve el resultado.

//Getters: Los getters (también conocidos como métodos de acceso o métodos "get") son métodos en programación orientada a objetos que se utilizan para obtener el valor de un atributo (o propiedad) de un objeto. 
//Su propósito principal es permitir el acceso controlado a los atributos de una clase, especialmente cuando esos atributos son privados.
//No hace falta usar this, dado que no se reciben parámetros que se relacionen con argumentos.
	
//Clase: En Java, una clase es una plantilla o modelo que define la estructura y el comportamiento de los objetos. A través de clases, se pueden crear objetos que encapsulan datos y funciones que operan sobre esos datos.
	
//Variable: En Java, una variable es un contenedor que se utiliza para almacenar datos que pueden ser manipulados y utilizados durante la ejecución de un programa. 
//Las variables tienen un nombre y un tipo, lo que les permite almacenar un valor específico y ser referenciadas en el código.
	
//Paso por valor: argumentos de tipo primitivo que contienen el valor exacto de estos.
//El paso por valor es un concepto en programación que se refiere a cómo se pasan los argumentos a las funciones o métodos. 
//En el caso de Java, que utiliza el paso por valor, esto significa que cuando se pasa una variable a un método, se pasa una copia del valor de la variable, no la variable misma.
	
//Paso por referencia: son argumentos de tipo objeto, arreglo, entre otros,	que no contienen los valores de estos, sino su respectiva dirección en memoria.
//El paso por referencia es un concepto en programación que se refiere a cómo se pasan los argumentos a las funciones o métodos. 
//En este enfoque, en lugar de pasar una copia del valor de la variable (como ocurre en el paso por valor), se pasa una referencia a la ubicación de memoria donde se almacena el objeto. 
//Esto permite que cualquier cambio realizado dentro del método afecte al objeto original.
//Ejemplo: VER EJEMPLO EN LA CLASE DE NOMBRE "CALCULADORA" CREADA EN ESTE MODULO.

//Constructores: Es un método que contiene las acciones que se realizarán por defecto al crear un objeto, en la mayoría de los casos, se inicializan los valores de los atributos en el constructor.
//Un constructor en Java es un método especial que se utiliza para inicializar objetos de una clase. 
//A diferencia de los métodos normales, el constructor tiene el mismo nombre que la clase y no tiene ningún tipo de retorno, ni siquiera void. 
//Los constructores se ejecutan automáticamente cuando se crea una instancia de una clase usando la palabra clave new.

//Constructor vacio: Un constructor vacío (o constructor por defecto) es un constructor que no tiene parámetros. 
//Se utiliza para crear un objeto sin pasar ningún valor durante su creación, y generalmente inicializa los atributos con valores predeterminados.
	
//Metodos Void: La utilidad de los métodos void radica en que son métodos que no cuentan con ningún tipo de retorno.
//En Java, la palabra clave void se utiliza para indicar que un método no devuelve ningún valor. 
//Específicamente, cuando un método está declarado con void, significa que su propósito es ejecutar alguna acción, pero no proporcionará ningún resultado o valor que pueda ser utilizado fuera del método.
//Cuando defines un método en Java, debes especificar su tipo de retorno, que puede ser cualquier tipo de dato, como int, String, double, etc. Sin embargo, si el método no debe devolver nada, se usa void.
	
//Métodos de Tipo: La utilidad de los métodos de tipo radica en que son métodos que cuentan	un retorno con base en el tipo de dato que fue declarado.
//En Java, los métodos de tipo o métodos estáticos (static methods) son aquellos que pertenecen a la clase en sí misma, y no a una instancia particular de esa clase. 
//Esto significa que puedes llamar a un método estático sin tener que crear un objeto de esa clase.

//Modificadores de acceso: En Java, los modificadores de acceso son palabras clave que controlan la visibilidad y el acceso a clases, variables, métodos y constructores. 
//Determinan desde dónde se puede acceder a estos elementos y quién tiene permiso para usarlos. 
//Los modificadores de acceso permiten implementar principios de encapsulación y control sobre cómo se usa y se modifica el código.
	
//Return: La palabra reservada return permite retornar valores dentro de los métodos, además de detener la ejecución del mismo. 
//Cualquier instrucción que se encuentre después de la ejecución de return NO será ejecutada. Es común encontrar métodos con múltiples sentencias return dentro de condicionales, 
//pero, una vez que el código ejecuta una sentencia return, lo que haya de allí hacia abajo no se ejecutará.
	
//Sobrecarga de métodos: Permite definir más de un método con el mismo nombre, con la condición de que no puede haber dos de ellos con el mismo número y tipo de parámetros.
	
//Objetos: Los objetos son ejemplares de una clase. Cuando se crea un objeto se debe especificar la clase a partir de la cual se creará. Esta acción de crear un objeto a
//partir de una clase se llama instanciar.
	
//Identidad: Es la propiedad que permite diferenciar un objeto y distinguirse de otros. Por lo general, esta propiedad es tal que da nombre al objeto.
	
//Comportamiento: el comportamiento de un objeto está directamente relacionado con su funcionalidad y determina las operaciones que este puede realizar. 
	
//Estado: el estado de un objeto se refiere al conjunto de atributos y sus valores en un instante de tiempo dado.
	
//Atributo: En Java, un atributo (también llamado campo o propiedad) es una variable que se declara dentro de una clase y representa el estado o las características de los objetos de esa clase. 
//Los atributos son usados para almacenar datos relacionados con un objeto y son parte de la definición de una clase.
	
//Set: Se establecen valores a los atributos por medio del método set. Debemos considerar que los atributos de un objeto serán diferentes al del otro, dado que cada uno es independiente del otro.

//Get: Se obtienen los valores de los atributos por medio del método get, se debe contemplar que los atributos de un objeto serán diferentes al del otro, dado que cada	uno es independiente del otro. 

//Instancia: En un lenguaje en el que cada objeto es creado a partir de una clase, un objeto es llamado una instancia de esa clase.
//Crear una instancia de una clase es entonces referido como instanciar la clase.
//Cuando creas una instancia, estás creando un objeto específico con sus propios valores para los atributos definidos por la clase.
	
//Operador (.): En casi todos los lenguajes de programación orientados a objeto, el	operador «punto» (.) es usado para referirse o «llamar» a un método	particular de un objeto.
	
//Static: Static: Los elementos estáticos (o miembros de clase) son aquellos que pertenecen	a la clase, en lugar de pertenecer a un objeto en particular.
	
//Herencia: La herencia es un mecanismo que facilita la definición de una clase a partir de la definición de otra ya existente. La herencia permite compartir automáticamente métodos y datos entre clases y objetos.
	
//Sobreescritura de métodos - polimorfismo: Es la forma por la cual una clase que hereda puede redefinir los métodos de su clase padre, de esta manera puede crear nuevos métodos con el mismo nombre de su superclase.
//Es decir, si existe una clase padre con el método saludar (), se puede crear en la clase hija un método que también se llame saludar (), pero con la implementación según la necesidad.

//Clases anidadas: Es una clase que se declara dentro de otra clase. Están definidas de forma normal, pero dentro de otra clase, o definidas dentro de un método, o dentro de una clase asignadas a un atributo, o
//pasadas como parámetro, o asignadas a	una variable local.
//Una clase anidada no existe independientemente de su clase adjunta. Por lo tanto, el alcance de una clase	anidada está limitado por su clase externa.

//Clases abstractas: En Java las clases abstractas son aquellas clases base (superclases) de las cuales no se permite crear objetos. Para ello, se utiliza la palabra clave abstract.
//En una clase abstracta pueden definirse métodos abstractos, que se caracterizan por el hecho de que no pueden ser implementados en la clase base.

//Polimórfica: En Java, el término polimorfismo se refiere a la capacidad de una entidad, como un objeto o método, de tomar múltiples formas. 
//Es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO) junto con la herencia, la encapsulación y la abstracción.
	
//Constructor: En Java, un constructor es un bloque especial de código que se utiliza para inicializar objetos de una clase. 
//Cuando creas una nueva instancia de una clase, el constructor es llamado automáticamente para asignar valores iniciales a los atributos del objeto. 
//El constructor tiene el mismo nombre que la clase y no tiene un tipo de retorno, ni siquiera void.
	
//Interfaces: Una interfaz en Java es una colección de métodos abstractos y propiedades	constantes. En las interfaces se especifica qué se debe hacer, pero no su implementación. 
//Serán las clases que implementen estas interfaces y describan la lógica del comportamiento de los métodos.
//Una interfaz es una especie de plantilla para la construcción de clases.
	
	
	
}
