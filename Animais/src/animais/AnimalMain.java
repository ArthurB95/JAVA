package animais;

public class AnimalMain {

	public static void main(String[] args) {

		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra s = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		m.locomover();
		r.locomover();
		p.locomover();
		
		c.locomover();
		k.locomover();
		
		c.emitirSom();
		k.emitirSom();
		
	}

}
