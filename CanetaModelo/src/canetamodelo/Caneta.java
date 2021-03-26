package canetamodelo;

public class Caneta {
	
	//ATRIBUTOS
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	//MÉTODO CONSTRUTOR
	public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.destampar();
	}
	
	//MÉTODOS
	public void status() {
		System.out.println("-------------------------------------");
		
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void destampar() {
		this.tampada = true; 
	}
	
	public void tampar() {
		this.tampada = false;
	}

	//MÉTODOS GET AND SET
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	

}
