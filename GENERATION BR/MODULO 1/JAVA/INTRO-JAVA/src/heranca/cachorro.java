package heranca;

public class cachorro extends animal {
	
		public void correr(boolean ir)
		{
			if(ir==true) {
				System.out.println("Cachorro pode correr.");
			}
			else
			{
				System.out.println("Cachorro não pode correr.");
			}
		}

}
