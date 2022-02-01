package OrientadaObjeto;

public class Paciente {
	String nome, sintomas;
	boolean emergencia;

	public void preferencial() {
		this.emergencia = true;
	}

	public void aguarde() {
		this.emergencia = false;

	}

	public void escrever()
	{
		if (this.emergencia=true)
		{
			System.out.println("Paciente "+nome+" é uma emergencia!");
		}
		else
		{
			System.out.println("Paciente "+nome+" não é emergencia, pode esperar.");
		}
		

	}
		public void status() 
		{
			System.out.println ("Paciente: "+nome);
			System.out.println("Sintomas "+sintomas);
			escrever();
		}
		
}
