package animais;

public class Peixe extends Animal {
	
	private String corEscamada;

	@Override
	public void locomover() {
		System.out.println("Nadando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som!");
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha!");
	}

	public String getCorEscamada() {
		return corEscamada;
	}

	public void setCorEscamada(String corEscamada) {
		this.corEscamada = corEscamada;
	}

}
