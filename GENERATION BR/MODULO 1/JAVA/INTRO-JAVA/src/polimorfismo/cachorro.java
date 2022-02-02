package polimorfismo;

public class cachorro extends animal {
	@Override
	public void emitirSom()
	{
		System.out.println("Latido");
	}
	@Override
	public void petNome() {
		System.out.println("cachorro");
	}
	

}
