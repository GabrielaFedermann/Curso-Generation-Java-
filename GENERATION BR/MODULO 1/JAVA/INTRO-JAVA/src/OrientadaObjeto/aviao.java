package OrientadaObjeto;

public class aviao {
	String compania, destino, modelo;
	boolean decolar;
	
	public void transito()
	{
		this.decolar=false;
	}
	public void decolando()
	{
		this.decolar=true;
	}
	public void escrever()
	{
	
	if(this.decolar = false)
	System.out.println("Por favor, aguarde, avi�o em transito");
	else 
		System.out.println("V� em dire��o ao terminal, avi�o esta decolando");
	}
	public void status()
	{
		System.out.println("Avi�o da compania: "+compania);
		System.out.println("Avi�o de modelo: "+modelo);
		System.out.println("Avi�o com destino: "+destino);
		escrever();
	}
	

}
