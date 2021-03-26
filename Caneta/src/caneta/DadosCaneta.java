package caneta;

public class DadosCaneta {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 90;
		
		c1.destampar(); 
		c1.status();
		c1.rabiscar();
		
		System.out.println("------------------------------------");
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "Dota";
		c2.cor = "Preta";
		
		c2.tampar();
		c2.status();
		c2.rabiscar();
		
	}

}
