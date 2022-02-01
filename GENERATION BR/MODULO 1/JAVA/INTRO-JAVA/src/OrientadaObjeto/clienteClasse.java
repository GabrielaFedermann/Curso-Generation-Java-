package OrientadaObjeto;

public class clienteClasse {
		String nome, idade;
		boolean cliente;
		
		public void cadastrar()
		{
			this.cliente=false;
		}
		public void cadastrado()
		{
			this.cliente=true;
		}
		public void escrever()
		{
		
		if(this.cliente = false)
		System.out.println("Por favor, cadastre o cliente.");
		else 
			System.out.println("Cliente já cadastrado");
		}
		public void status()
		{
		System.out.println("Nome do cliente: "+nome);
		System.out.println("Idade do cliente: "+idade);
		escrever();
		}
	
}
