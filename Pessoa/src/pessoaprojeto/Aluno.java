package pessoaprojeto;

public class Aluno extends Pessoa {

	//ATRIBUTOS
	private int Matricula;
	private String curso;
	
	//M�TODOS PERSONALIZADOS
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}

	//M�TODOS ESPECIAIS
	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
