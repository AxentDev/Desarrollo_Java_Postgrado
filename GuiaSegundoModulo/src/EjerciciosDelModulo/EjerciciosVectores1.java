package EjerciciosDelModulo;

public class EjerciciosVectores1 
//Desarrollar un programa que dados dos grupos (Grupo A – Grupo B)
//cada uno con 10 estudiantes y una nota final de la materia por estudiante, determinar:
//- El promedio general de cada grupo.
//- El promedio general de ambos grupos.
//- El grupo con mejor promedio.
{
	public static void main(String args[])
	{
//********************************************************************************************************************
		double notaFinalGrupoA[] = {4.5,4.7,5.0,4.8,4.5,4.9,4.7,4.2,4.3,4.9};
		double notaFinalGrupoB[] = {4.6,4.5,5.0,4.4,4.3,4.9,4.8,4.7,4.6,4.5};
		double promedioA = 0, promedioB = 0, promedioGeneral =0, promedioFinalA = 0, promedioFinalB = 0;
//********************************************************************************************************************			
		for (int i = 0; i<notaFinalGrupoA.length; i++)
		{
			promedioA = promedioA + notaFinalGrupoA[i];
			promedioFinalA = promedioA/10;
		}
		System.out.println("El promedio general del Grupo A es: "+String.format("%.2f", promedioFinalA));
//********************************************************************************************************************		
		for (int i = 0; i<notaFinalGrupoB.length; i++)
		{
			promedioB = promedioB + notaFinalGrupoB[i];
			promedioFinalB = promedioB/10;
		}
		System.out.println("El promedio general del Grupo B es: "+String.format("%.2f", promedioFinalB));
//********************************************************************************************************************		
		promedioGeneral = promedioGeneral + ((promedioFinalA+promedioFinalB)/2);
		System.out.println("El promedio general de ambos grupos es: "+String.format("%.2f", promedioGeneral));
//********************************************************************************************************************		
		if(promedioFinalA>promedioFinalB)
		{
			System.out.println("El grupo A tiene mejor promedio con un total de: "+promedioFinalA);
		}
		else
		{
			System.out.println("El grupo B tiene mejor promedio con un total de: "+promedioFinalB);
		}
	}
}
