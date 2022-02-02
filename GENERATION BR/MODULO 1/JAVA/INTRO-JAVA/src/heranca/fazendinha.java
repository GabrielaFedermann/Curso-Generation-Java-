package heranca;

public class fazendinha extends animal {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro();	
		
		dog.setNome("cahorro");
		dog.setIdade(7);
		dog.setSom(true);

		System.out.println("O animal é um "+dog.getNome());
		System.out.println(" Cachorro possui "+dog.getIdade()+ " anos.");
		System.out.println(" O cachorro emite som? " +dog.isSom());
		dog.correr(true);
		
		
		Cavalo cav = new Cavalo();
		
		cav.setNome("cavalo");
		cav.setIdade(2);
		cav.setSom(true);

		System.out.println("\n O animal é um "+cav.getNome());
		System.out.println(" Cavalo possui "+cav.getIdade()+ " anos");
		System.out.println("O cavalo emite som? " +cav.isSom());
		cav.correr(true);

	
		preguica preg = new preguica();
		
		preg.setNome("preguiça");
		preg.setIdade(4);
		preg.setSom(true);	
		
		System.out.println("\nO animal é uma "+preg.getNome());
		System.out.println("Preguiça possui "+ preg.getIdade()+ " anos");
		System.out.println("A preguiça emite som? " +preg.isSom());
		preg.subir(true);
	}

}
