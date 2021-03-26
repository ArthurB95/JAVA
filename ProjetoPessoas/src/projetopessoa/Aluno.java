package projetopessoa;

public class Aluno extends Pessoa {
	
	//ATRIBUTOS
	private int matricula;
	private String curso;

	//MÉTODOS PERSONALIZADOS
	public void cancelarMatricula() {
		System.out.println("Mátricula cancelada!");
	}
	
	//MÉTODOS ESPECIAIS
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
