package OrientadaObjeto;

public class contaBancaria {
	String nome;
	int agencia, operacao, conta, valor;
	boolean extrato;

	public void saque() {
		this.extrato = true;
	}

	public void emprestimo() {
		this.extrato = false;
	}

	public void escrever()
	{
		if (this.extrato = true) 
		{
			System.out.println(nome + ", voc� possui R$" + valor + " em sua conta, estamos preparando o saque.");
		}
		 else 
		 {
			System.out.println(nome + ", voc� n�o possui saldo suficiente, vamos preparar seu empr�stimo");
		 }
	}

	public void status() 
	{
		System.out.println(" Querido(a) " + nome);
		System.out.println(" Sua conta " + conta + " na agencia" + agencia + " opera��o " + operacao
				+ ", com conta de numero " + conta);
		System.out.println(" possui R$" + valor+",00");
		System.out.println(" Querido(a) " + nome);
		escrever();
	}
}

