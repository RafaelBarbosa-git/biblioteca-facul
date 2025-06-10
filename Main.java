package projeto_2fase;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Bem-Vindo!");
		int opcao = 0;
		do {
			opcao = biblioteca.menu(opcao, scanner);
			switch (opcao) {
			case 1:
				biblioteca.adicionarMaterial(scanner);
				break;
			case 2:
				biblioteca.pesquisarMaterial(scanner);
				break;
			case 3:
				biblioteca.excluirMaterial(scanner);
				break;
			case 4:
				biblioteca.listarMateriais(scanner);
				break;
			case 5:
				System.out.println("Obrigado por ter usado nosso sistema!");
				break;
			default:
				System.out.println("ERRO: Opção inválida!");
				break;
			}
		} while (opcao != 5);

	}
}