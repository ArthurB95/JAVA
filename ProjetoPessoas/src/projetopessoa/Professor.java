package projetopessoa;

public class Professor extends Pessoa {
	
	//ATRIBUTO
	private String especialidade;
	private float salario;
	
	//M�TODO PERSONALIZADO
	public void receberAumento(float aum){
		this.salario += aum;
	}
	
	//M�TODO ESPECIAIS
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
