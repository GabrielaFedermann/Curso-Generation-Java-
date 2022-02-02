package polimorfismo;

public class preguica extends animal{
	@Override
	public void emitirSom()
	{
		System.out.println("Esta em silencio agora");
	}
	@Override
	public void movimento()
	{
		System.out.println("Animal esta subindo arvore");
	}
	@Override
	public void petNome() {
		System.out.println("preguiça");
	}

}
