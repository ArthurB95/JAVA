package pessoaprojeto;

public class Bolsista extends Aluno {
	
	//ATRIBUTO
	private float bolsa;
	
	//MÉTODOS PERSONALIZADOS
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome + "!");
	}
	
	//MÉTODOS ESPECIAIS
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	

	@Override
	public void pagarMensalidade() {
	    System.out.println(this.nome + " é bolsista! Pagamento com desconto de " + this.bolsa + "%");
	}
	
}
