package OrientadaObjeto;

public class Funcionario {
	String nome, funcao;
	int idade;
	boolean aposentadoria;
	
	public void aposentar()
	{
		this.aposentadoria=true;
	}
	public void ferias()
	{
		this.aposentadoria=false;
	}
	public void escrever()
	{
	
	if(this.aposentadoria = false)
	System.out.println("Por favor, gendar as férias do funcionario(a) "+nome);
	else 
		System.out.println("Funcionário(a) "+nome+" esta aposentado(a)!");
	}
	public void status()
	{
		System.out.println("Funcionário: " +nome);
		System.out.println("Idade: "+idade);
		System.out.println("Função: " +funcao);
	
		escrever();
	}	


}
