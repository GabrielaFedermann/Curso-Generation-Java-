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
		System.out.println("a cor � "+cor);
		System.out.println("o tamanho � "+tamanho);
		System.out.println("a capacidade � de "+capacidade+ " mls");
		System.out.println("o material que a x�cara foi feita � "+material);
		System.out.println("a forma da xicara � "+forma);
	}
}
