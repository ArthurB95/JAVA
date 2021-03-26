package projetopessoa;

public class Funcionario extends Pessoa {
	
	//ATRIBUTOS
	private String setor;
	private boolean trabalhando;
	
	//M�TODOS PERSONALIZADOS
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	//M�TODOS ESPECIAIS
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}	

}
