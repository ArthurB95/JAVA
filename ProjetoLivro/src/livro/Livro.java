package livro;

public class Livro implements Publicacao {

	//ATRIBUTOS
	private String livro;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//MÉTODOS PERSONALIZADOS
	
	public String detalhes() {
		return "Livro: " + livro + ", Autor: " + autor + ", Total Páginas: " + totPaginas + ", Página Atual: " + pagAtual
				+ ", Aberto: " + aberto + ", Leitor: " + leitor.getNome() + ", Idade: " + leitor.getIdade() + ", Sexo: " + leitor.getSexo() + "]";
	}

	
	//CONSTRUTOR
	public Livro(String livro, String autor, int totPaginas, Pessoa leitor) {
		this.livro = livro;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	//MÉTODOS ESPECIAIS
	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	//INTERFACE
	@Override
	public void abrir() {
		this.aberto = true;
	}


	@Override
	public void fechar() {
		this.aberto = false;
	}


	@Override
	public void folhear(int p) {
		if(p > this.totPaginas) {
			System.out.println("O seu livro não possui esse número de páginas!");
		} else {
			this.pagAtual = p;
		}
	}


	@Override
	public void avancarPag() {
			this.pagAtual++;
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
