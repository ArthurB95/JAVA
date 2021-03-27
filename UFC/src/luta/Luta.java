package luta;

public class Luta {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];
				
		l[0] = 	new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = 	new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 2);
		l[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

		l[0].apresentar();
		l[0].ganharLuta();
		l[0].status();
		
		l[1].apresentar();
		l[1].perderLuta();
		l[1].status();
		
		System.out.println("------------------------------------------------------");
		
		Duelo UFC01 = new Duelo();
		
		UFC01.marcarLuta(l[0], l[1]);
		UFC01.lutar();
		l[0].status();
		l[1].status();
	}

}
