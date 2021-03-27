package gafanhotos;

public class Main {

	public static void main(String[] args) {

		Video v[] = new Video[5];
 		v[0] = new Video("Aula 1 de POO");
 		v[1] = new Video("Aula 2 de PHP");
 		v[2] = new Video("Aula 3 de JAVA");
 		
 		Gafanhoto g[] = new Gafanhoto[2];
 		g[0] = new Gafanhoto("Arthur", 25, "M", "Arthurzinho");
 		g[1] = new Gafanhoto("Luiza", 40, "F", "Luizinha");
 		
 		Visualizacao vis[] = new Visualizacao[5];
 		vis[0] = new Visualizacao(g[0], v[2]); //ARTHUR ASSISTE A JAVA
 		vis[0].avaliar();
 		System.out.println(vis[0].toString());
 		
 		vis[1] = new Visualizacao(g[0], v[1]); //ARTHUR ASSISTE PHP
 		vis[0].avaliar(87.0f);
 		System.out.println(vis[0].toString());
 		
 		System.out.println("VÍDEOS\n-----------------------------------");
 		System.out.println(v[0].toString());
 		System.out.println(v[1].toString());
 		System.out.println(v[2].toString());
 		System.out.println("GAFANHOTOS\n-----------------------------------");
 		System.out.println(g[0].toString());
 		System.out.println(g[1].toString());

	}

}
