package polimorfismo;

public interface fazendaFeliz  {

		public static void main(String[] args) {
			animal ani=new animal();
			cachorro cach = new cachorro();
			cavalo cav = new cavalo();
			preguica preg = new preguica();
			
			ani.petNome();
			ani.petIdade();
			ani.emitirSom();
			ani.movimento();
		
			cach.petNome();
			cach.petIdade();
			cach.emitirSom();
			cach.movimento();
			
			cav.petNome();
			cav.petIdade();
			cav.emitirSom();
			cav.movimento();
			
			preg.petNome();
			preg.petIdade();
			preg.emitirSom();
			preg.movimento();
			

		}


}
