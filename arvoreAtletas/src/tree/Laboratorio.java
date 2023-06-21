package tree;

import java.util.Scanner;

public class Laboratorio {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		TreeJogadores jogadores = new TreeJogadores();

		jogadores.add(new Jogador("Toni Kroos", 33, 8, 1.83f, Position.valueOf(6)));
		jogadores.add(new Jogador("Ayrton Lucas", 25, 6, 1.80f, Position.valueOf(5)));
		jogadores.add(new Jogador("Thibaut Courtois", 31, 1, 1.99f, Position.valueOf(1)));
		jogadores.add(new Jogador("Rodri Hernández", 26, 16, 1.91f, Position.valueOf(7)));
		jogadores.add(new Jogador("Éder Militão", 25, 3, 1.86f, Position.valueOf(2)));
		jogadores.add(new Jogador("Harry Maguire", 30, 5, 1.94f, Position.valueOf(3)));
		jogadores.add(new Jogador("Vinícius Jr", 22, 20, 1.76f, Position.valueOf(10)));
		jogadores.add(new Jogador("Baixinho Romário", 57, 11, 1.67f, Position.valueOf(11)));
		jogadores.add(new Jogador("Alexander-Arnold", 24, 66, 1.75f, Position.valueOf(4)));
		jogadores.add(new Jogador("De Arrascaeta", 29, 14, 1.74f, Position.valueOf(8)));
		jogadores.add(new Jogador("Lionel Messi", 35, 10, 1.69f, Position.valueOf(9)));

		jogadores.inOrder();
		jogadores.preOrder();
		jogadores.postOrder();
	}


}
