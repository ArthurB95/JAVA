package gafanhotos;

public class Video implements AcoesVideo {
	
	//ATRIBUTOS
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//CONSTRUTOR
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
	}
	
	@Override
	public void pausa() {
		this.reproduzindo = false;
	}
	
	@Override
	public void like() {
		this.curtidas++;
	}
	
	@Override
	public String toString() {
		return "Video: " + titulo + ", Avalia��o: " + avaliacao + ", Views: " + views + ", Curtidas: " + curtidas
				+ ", Reproduzindo: " + reproduzindo;
	}

	//M�TODOS ESPECIAIS
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {
		int novaAvaliacao;
		novaAvaliacao = ((this.avaliacao + avaliacao) / this.views);
		this.avaliacao = novaAvaliacao;
	}
	
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}	

}
