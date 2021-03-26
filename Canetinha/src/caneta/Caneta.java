package caneta;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		
		if(this.modelo == null) {
			System.out.println("Sua caneta não tem nome!");
		} else {
			System.out.println("Modelo: " + this.modelo);
		}
		
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}

}
