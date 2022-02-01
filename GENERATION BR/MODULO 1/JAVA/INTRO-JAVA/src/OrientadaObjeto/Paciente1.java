package OrientadaObjeto;

public class Paciente1 {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		
		p1.nome= "Joana Jeovana";
		p1.sintomas = " dor de cabeça, enjoo, tosse, dificuldade para respirar.";
		p1.emergencia=true;
		p1.status();

	}

}
