package polimorfismo;

public class cavalo extends animal{
	@Override
	public void emitirSom()
	{
		System.out.println("Relincho");
	}
	@Override
	public void petNome() {
		System.out.println("cavalo");
	}

}
