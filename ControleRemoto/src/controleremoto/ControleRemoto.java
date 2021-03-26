package controleremoto;

public class ControleRemoto implements Controlador {
	
	//ATRIBUTOS
	private double volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�TODOS ESPECIAIS
	
	
	
	//CONSTRUTOR
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	//M�TODOS ESPECIAIS
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	//M�TODOS ABSTRADOS
	@Override
	public void ligar() {

		this.setLigado(true);
	}

	@Override
	public void desligar() {
		
		this.setLigado(false);		
	}

	@Override
	public void abrirMenu() {

		System.out.println("-----MENU-----");
		
		System.out.println("Est� ligando? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {

		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {

		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Imposs�vel aumentar volume!");
		}
	}

	@Override
	public void menosVolume() {

		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Imposs�vel diminuir volume!");
		}
	}

	@Override
	public void ligarMudo() {

		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {

		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {

		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("N�o consegui reproduzir!");
		}
	}

	@Override
	public void pause() {

		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(false);
		} else {
			System.out.println("N�o consegui pausar!");
		}
	}

}
