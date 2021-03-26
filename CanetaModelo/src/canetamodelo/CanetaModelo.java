package canetamodelo;

public class CanetaModelo {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC", "Vermelho", 0.4f);
		
		c1.status();
		
		Caneta c2 = new Caneta("NICK", "Azul", 0.7f);
		
		c2.status();
		
		//System.out.println("Tenho uam caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		
	}

}
