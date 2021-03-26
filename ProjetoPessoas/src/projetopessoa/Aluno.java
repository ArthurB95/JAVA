package projetopessoa;

public class Aluno extends Pessoa {
	
	//ATRIBUTOS
	private int matricula;
	private String curso;

	//M�TODOS PERSONALIZADOS
	public void cancelarMatricula() {
		System.out.println("M�tricula cancelada!");
	}
	
	//M�TODOS ESPECIAIS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
