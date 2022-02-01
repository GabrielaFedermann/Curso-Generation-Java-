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
	System.out.println("Por favor, aguarde, avião em transito");
	else 
		System.out.println("Vá em direção ao terminal, avião esta decolando");
	}
	public void status()
	{
		System.out.println("Avião da compania: "+compania);
		System.out.println("Avião de modelo: "+modelo);
		System.out.println("Avião com destino: "+destino);
		escrever();
	}
	

}
