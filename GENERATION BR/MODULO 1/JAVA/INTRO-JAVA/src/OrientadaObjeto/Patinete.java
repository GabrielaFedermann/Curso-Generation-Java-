package OrientadaObjeto;

public class Patinete {
	String cor;
	boolean movimento;
	
	public void frente() 
	{
		this.movimento=true;
	}
	public void parar()
	{
		this.movimento=false;
	}
	public void escrever()
	{
		if (this.movimento=true) {
			System.out.println("Patinete "+cor+" esta  andando para frente.");
		}
		else {
			
			System.out.println("Patinete "+cor+" esta parado.");
		}
	}
	public void status()
	{
		System.out.println("a cor do patinete é "+cor);
		System.out.println("O patinete esta em movimento? "+ movimento);
		escrever();
	}


}
