package polimorfismo;

public class animal {
	private String nome;
	private int idade;
	private boolean som;
	
	public void emitirSom()
	{
		System.out.println("animal esta emitindo som");
	}
	public void movimento()
	{
		System.out.println("Animal esta se correndo");
	}
	public void petNome() {
		System.out.println(nome);
	}
	public void petIdade() {
		System.out.println(idade);
		
	}


}
