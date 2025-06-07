package projeto_2fase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pesquisar_Excluir_Biblioteca {

	ArrayList<Livros> livros = new ArrayList<>();
	ArrayList<Revistas> revistas = new ArrayList<>();

	public void pesquisarMaterial(Scanner scanner) {
		System.out.print("Gostaria de pesquisar livro ou revista?\nDigite sua opção: ");
		String tipo = scanner.nextLine();

		System.out.print("Digite o número de páginas que deseja pesquisar: ");
		int NumeroDaEdicao = scanner.nextInt();
		scanner.nextLine();

		if (tipo.equalsIgnoreCase("Revista")) {
			boolean encontrado = false;
			for (Revistas revista : revistas) {
				if (revista.getNumeroDaEdicao() == NumeroDaEdicao) {
					System.out.println("Revista encontrada: " + revista.getTitulo());
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Nenhuma revista com esse número de páginas foi encontrada.");
			}
		} else if (tipo.equalsIgnoreCase("Livro")) {
			boolean encontrado = false;
			for (Livros livro : livros) {
				if (livro.getNumeroDaEdicao() == NumeroDaEdicao) {
					System.out.println("Livro encontrado: " + livro.getTitulo());
					encontrado = true;
				}
			}
			if (!encontrado) {
				System.out.println("Nenhum livro com esse número de páginas foi encontrado.");
			}
		} else {
			System.out.println("Tipo inválido. Digite 'Livro' ou 'Revista'.");
		}
	}

	public void excluirMaterial(Scanner scanner) {
		System.out.print("Gostaria de excluir um livro ou uma revista?\nDigite sua opção: ");
		String tipo = scanner.nextLine();

		System.out.print("Digite o número de páginas do material que deseja excluir: ");
		int numeroPaginas = scanner.nextInt();
		scanner.nextLine();

		boolean removido = false;

		if (tipo.equalsIgnoreCase("Revista")) {
			for (int i = 0; i < revistas.size(); i++) {
				if (revistas.get(i).getNumeroDaEdicao() == numeroPaginas) {
					System.out.println("Revista removida: " + revistas.get(i).getTitulo());
					revistas.remove(i);
					removido = true;
					break;
				}
			}
			if (!removido) {
				System.out.println("Nenhuma revista com esse número de páginas foi encontrada.");
			}

		} else if (tipo.equalsIgnoreCase("Livro")) {
			for (int i = 0; i < livros.size(); i++) {
				if (livros.get(i).getNumeroDaEdicao() == numeroPaginas) {
					System.out.println("Livro removido: " + livros.get(i).getTitulo());
					livros.remove(i);
					removido = true;
					break;
				}
			}
			if (!removido) {
				System.out.println("Nenhum livro com esse número de páginas foi encontrado.");
			}

		} else {
			System.out.println("Tipo inválido. Digite 'Livro' ou 'Revista'.");
		}
	}

}
