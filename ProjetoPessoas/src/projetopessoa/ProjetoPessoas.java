package projetopessoa;

public class ProjetoPessoas {

	public static void main(String[] args) {

		//PROGRAMA PRINCIPAL
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		 
		//p1.receberAumento(550.20); VAI DAR ERRO POIS MÉTODO NÃO FAZ 
		//p2.mudarTrabalho(); VAI DAR ERRO POIS MÉTODO NÃO FAZ PARTE 
		//p4.cancelarMatricula(); VAI DAR ERRO POIS MÉTODO NÃO FAZ PARTE 
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

	}

}
