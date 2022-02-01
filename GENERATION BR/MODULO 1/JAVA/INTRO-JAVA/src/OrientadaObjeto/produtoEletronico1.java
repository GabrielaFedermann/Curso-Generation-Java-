package OrientadaObjeto;

public class produtoEletronico1 {

	public static void main(String[] args) {
		produtoEletronico p1 = new produtoEletronico();
		
		
		p1.voltagem= 220;
		p1.modelo="25A";
		p1.marca="Brastemp";
		p1.funcao="Batedeira";

		p1.status();

	}

}
