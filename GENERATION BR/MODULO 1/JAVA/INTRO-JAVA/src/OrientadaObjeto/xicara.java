package OrientadaObjeto;

public class xicara {
	String cor, tamanho,  material;
	int capacidade;
	String forma;
	boolean cheio;
	
	public void encher()
	{
		this.cheio=true;
	}
	public void esvaziar()
	{
		this.cheio=false;
	}
	public void escrever()
	{
	if (this.cheio=true)
		System.out.println(" Pare antes que transborde");
	else
		System.out.println("Pode colocar mais que ainda cabe!");
	}
	public void status()
	{
		System.out.println("a cor é "+cor);
		System.out.println("o tamanho é "+tamanho);
		System.out.println("a capacidade é de "+capacidade+ " mls");
		System.out.println("o material que a xícara foi feita é "+material);
		System.out.println("a forma da xicara é "+forma);
	}
}
