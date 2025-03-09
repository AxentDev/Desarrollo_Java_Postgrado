package GuiaTercerModulo;

public class Perro 
{

    String raza;
    String nombre;
    int edad;
    String encargada;


	public Perro(String nombre, int edad, String encargada) 
	{
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.encargada = encargada;
	}
	    public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}
	    public static void main1(String args[])
	    {
	    	Perro Firulais = new Perro();
	    	Perro Peluche = new Perro("Peluche", 9, "Yulied");
	    	Perro Poseidon = new Perro("Poseidon");
	    	
	    }

	public Perro() {
        raza = "Perro";
        nombre = "Bruno";
        edad = 3;
        encargada = "Evelin";
        
    }

    // Método setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para nombre
    public String getNombre() {
        return this.nombre;
    }

    public void Ladrar() {
        System.out.println("Guau!, guau!");
    }

    public void Pasear() {
        System.out.println("Ir al parque");
    }

    // Método main para ejecutar la clase
    public static void main(String[] args) {
        // Crear una instancia de la clase Perro
        Perro Firulais = new Perro();

        // Usar los métodos setter y getter para el nombre
        Firulais.setNombre("Firulais");
        System.out.println("El nombre del perro es: " + Firulais.getNombre());
    }
}
