import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    //ArrayList<Material> materiais = new ArrayList<>();
    ArrayList<Livros> livros = new ArrayList<>();
    ArrayList<Revistas> revistas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String loop;
    public String pergunta(){
        System.out.print("Digite sua opção: ");
        String tipo = scanner.nextLine();
        return tipo;
    }
    public String nome(){
        System.out.print("Digite o nome do material que deseja excluir: ");
            String nome = scanner.nextLine();
            return nome;
    }
    public void listarMateriais() {
        System.out.println("Gostaria de listar os livros ou as revistas?");
        do {
            String tipo = pergunta();
            if (tipo.equalsIgnoreCase("revistas")) {
                if (this.revistas.isEmpty()) {
                    System.out.println("Nenhuma revista cadastrado.");
                } else {
                    System.out.println("Lista de revistas da Biblioteca:");
                    int indice = 0;
                    for (Revistas m : this.revistas) {
                        indice ++;
                        System.out.println(indice + "°:\n");
                        System.out.println("- Titulo = " + m.getTitulo());
                        System.out.println("- Autor = " + m.getAutor() + "\n_______");
                    }
                }
                loop = "opção válida";
            } else if (tipo.equalsIgnoreCase("livros")) {
                if (this.livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    System.out.println("Lista de livros da Biblioteca:");

                    for (Livros m : this.livros) {
                        System.out.println(m.toString());
                    }
                }
                loop = "opção válida";
            } else {
                loop = "Opção inválida! Digite 'Livros' ou 'Revistas'.";
            }
        }while (loop.equals("Opção inválida! Digite 'Livros' ou 'Revistas'."));
    }
    public void pesquisarMaterial(Scanner scanner) {
        System.out.println("Gostaria de excluir um livro ou uma revista?");
        do {
            String tipo = pergunta();
            String nome = nome();
		    if (tipo.equalsIgnoreCase("Revista")) {
                loop = "opção válida";
			    boolean encontrado = false;
			    for (Revistas revista : revistas) {
				    if (revista.getTitulo().equalsIgnoreCase(nome)) {
					    System.out.println("Revista encontrada: " + revista.toString());
					    encontrado = true;
				    }
			    }
			    if (!encontrado) {
				    System.out.println("Nenhuma revista com esse nome foi encontrada.");
			    }
		    } else if (tipo.equalsIgnoreCase("Livro")) {
                loop = "opção válida";
			    boolean encontrado = false;
			    for (Livros livro : livros) {
				    if (livro.getTitulo().equalsIgnoreCase(nome)) {
					    System.out.println("Livro encontrado: " + livro.toString());
					    encontrado = true;
				    }
			    }
			    if (!encontrado) {
				    System.out.println("Nenhum livro com esse nome foi encontrado.");
			    }
		    } else {
                loop = "Opção inválida! Digite 'Livro' ou 'Revista'.";
			    System.out.println(loop);
		    }
        }while (loop.equals("Opção inválida! Digite 'Livro' ou 'Revista'."));
	}

	public void excluirMaterial(Scanner scanner) {

		System.out.println("Gostaria de excluir um livro ou uma revista?");
        do {
            String tipo = pergunta();
            String nome = nome();

            boolean removido = false;

            if (tipo.equalsIgnoreCase("Revista")) {
                loop = "opção válida";
                for (int i = 0; i < revistas.size(); i++) {
                    if (revistas.get(i).getTitulo().equalsIgnoreCase(nome)) {
                        revistas.remove(i);
                        System.out.println("Revista excluida com sucesso!");
                        removido = true;
                        break;
                    }
                }
                if (!removido) {
                    System.out.println("Nenhuma revista com esse número de páginas foi encontrada.");
                }

            } else if (tipo.equalsIgnoreCase("Livro")) {
                loop = "opção válida";
                for (int i = 0; i < livros.size(); i++) {
                    if (livros.get(i).getTitulo().equalsIgnoreCase(nome)) {
                        livros.remove(i);
                        System.out.println("Livro excluido com sucesso!");
                        removido = true;
                        break;
                    }
                }
                if (!removido) {
                    System.out.println("Nenhum livro com esse nome foi encontrado.");
                }

            } else {
                loop = "Opção inválida! Digite 'Livro' ou 'Revista'.";
			    System.out.println(loop);
            }
        }while (loop.equals("Opção inválida! Digite 'Livro' ou 'Revista'."));
	}

}