package GuiaSegundoModulo;

public class ElseIfPrimero 
{

	public static void main(String args[]) 
	{
	//if(false): primera condicion.
	//else if(true): Segunda condicion.
	//else: Tercera condicion.
	
	// EJERCICIO: realiza un algoritmo que permita determinar, según una velocidad X que en este caso es 101km/h, a que grupo de limites pertenece y si estoy infringiendo los limites de velocidad.
		
		int velocidad = 101;
		
		if (velocidad >= 0 && velocidad <=30)
		{
		System.out.println("Si esta en zonas escolares no excede el limite de velocidad");
		}
		else if (velocidad >= 31 && velocidad <=60)
		{
		System.out.println("Si esta en vias urbanas no excede el limite de velocidad");
		}
		else if (velocidad >= 61 && velocidad <=80) 
		{
		System.out.println("Si esta en vias rurales no excede el limite de velocidad");
		}
		else if (velocidad >= 81 && velocidad <=100) 
		{
		System.out.println("Si esta en rutas nacionales no excede el limite de velocidad");
		}
		else if (velocidad >= 101 && velocidad <=300)
		{
		System.out.println("Excede el limite de velocidad");
		}
	}
}
