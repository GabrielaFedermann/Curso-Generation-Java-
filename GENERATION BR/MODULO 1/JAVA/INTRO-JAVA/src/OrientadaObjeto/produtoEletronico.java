package OrientadaObjeto;

public class produtoEletronico {
	String modelo, marca, funcao;
	int voltagem;
	boolean estoque;
	
	public void fora()
	{
		this.estoque=false;
	}
	public void emEstoque()
	{
		this.estoque=true;
	}
	public void escrever()
	{
	
	if(this.estoque = false)
	System.out.println("Por favor, aguarde,estamos buscando em outras lojas.");
	else 
		System.out.println("O produto se encontra em estoque");
	}
	public void status()
	{
		System.out.println("Função: " +funcao);
		System.out.println("Marca: " +marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Voltagem: "+voltagem+" volts");
		escrever();
	}	


}
