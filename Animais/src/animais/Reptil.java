package animais;

public class Reptil extends Animal {
	
	private String corEscamada;

	@Override
	public void locomover() {
		System.out.println("Rastejando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de R�ptil!");
	}

	public String getCorEscamada() {
		return corEscamada;
	}

	public void setCorEscamada(String corEscamada) {
		this.corEscamada = corEscamada;
	}
	
	

}
