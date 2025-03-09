package GuiaTercerModulo;

public class ClarineteSobreescrituraMetodos extends InstrumentoSobreescrituraMetodos 
{
	@Override
	public void tocar()
	{
		super.tocar();//La palabra super hace el llamado al método tocar de la superclase, hace las veces de this, pero ya no hace referencia al objeto o clase actual, sino a su clase	padre, en este caso, instrumento.
		System.out.println("Tocando el clarinete");
	}
	public static void main(String args[])
	{
		ClarineteSobreescrituraMetodos clarinetenegro = new ClarineteSobreescrituraMetodos();
		clarinetenegro.tocar();
	}
	
}
