package gafanhotos;

public class Gafanhoto extends Pessoa {

	//ATRIBUTOS
	private String login;
	private int totAssistido;
	
    //CONSTRUTOR
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
	}

	//MÉTODOS PERSONALIZADOS
	public void viuMaisUm() {
		
	}

	@Override
	public String toString() {
		return "Gafanhoto => " + super.toString() + ", Login: " + login + ", Total Assistido: " + totAssistido;
	}

	//MÉTODOS ESPECIAIS
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
}
