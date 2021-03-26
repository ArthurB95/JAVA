package animal;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void reagir(String frase) {
		if(frase == "Toma Comida" || frase == "Olá" || frase == "Cheguei") {
			System.out.println("Abanar o rabo e latir!");
		} else {
			System.out.println("Rosnar! Gggrrrrrrrrrrr!");
		}
	}
	
	public void reagir(int hora, int minuto) {
		if(hora < 12) {
			System.out.println("Abanar o rabo!");
		} else if (hora >= 18) {
			System.out.println("Ignorar e latir!");
		} else {
			System.out.println("Abanar o rabo e latir!");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("Abanar o rabo e latir!");
		} else {
			System.out.println("Rosnar! Gggrrrrrrrrrrr!");
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar o rabo!");
			} else {
				System.out.println("Latir!");
				this.emitirSom();
			}
		} else {
			if(peso < 10) {
				System.out.println("Rosnar!");
			} else {
				System.out.println("Ignorar!");
			}
		}
	}
	
}
