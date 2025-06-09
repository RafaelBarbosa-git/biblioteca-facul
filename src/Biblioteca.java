import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    //ArrayList<Material> materiais = new ArrayList<>();
    ArrayList<Livros> livros;
    ArrayList<Revistas> revistas;
    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.revistas = new ArrayList<>();
    }

    String loop;

    public int menu(int opcao, Scanner scanner) {
		System.out.print("\nO que você deseja?\n____________\n1) Adicionar Novo Material"
				+ "\n2) Pesquisar Material por Título" + "\n3) Excluir Material pelo Título"
				+ "\n4) Listar Material\n5) Sair do Sistema"
				+ "\n____________\nDigite o número da opção que deseja: "); // menu
		opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}


    public String pergunta(Scanner scanner){
        System.out.print("Digite sua opção: ");
        String tipo = scanner.nextLine();
        return tipo;
    }
    public String nome(Scanner scanner){
        System.out.print("Digite o nome do material que deseja excluir: ");
            String nome = scanner.nextLine();
            return nome;
    }
    public void listarMateriais(Scanner scanner) {
        System.out.println("Gostaria de listar os livros ou as revistas?");
        do {
            String tipo = pergunta(scanner);
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
                        System.out.println("- Autor = " + m.getAutor() + "\n___");
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
                System.out.println(loop);
            }
        }while (loop.equals("Opção inválida! Digite 'Livros' ou 'Revistas'."));
    }
    void pesquisarMaterial(Scanner scanner) {
        System.out.println("Gostaria de excluir um livro ou uma revista?");
        do {
            String tipo = pergunta(scanner);

		    if (tipo.equalsIgnoreCase("Revista")) {
                loop = "opção válida";
                if (revistas.isEmpty()){
                    System.out.println("A lista ainda está vazia!");
                }
                else {

                    boolean encontrado = false;
                    String nome = nome(scanner);
                    for (Revistas revista : revistas) {
                        if (revista.getTitulo().equalsIgnoreCase(nome)) {
                            System.out.println("Revista encontrada: " + revista.toString());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nenhuma revista com esse nome foi encontrada.");
                    }
                }
		    } else if (tipo.equalsIgnoreCase("Livro")) {
                loop = "opção válida";
                if (livros.isEmpty()){
                    System.out.println("A lista ainda está vazia!");
                }
                else {
                    boolean encontrado = false;
                    String nome = nome(scanner);
                    for (Livros livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(nome)) {
                            System.out.println("Livro encontrado: " + livro.toString());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nenhum livro com esse nome foi encontrado.");
                    }
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
            String tipo = pergunta(scanner);


            boolean removido = false;

            if (tipo.equalsIgnoreCase("Revista")) {
                loop = "opção válida";
                if (revistas.isEmpty()){
                    System.out.println("Operação inválida! A lista ainda está vazia.");
                }
                else {
                    String nome = nome(scanner);
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
                }
            } else if (tipo.equalsIgnoreCase("Livro")) {
                loop = "opção válida";
                if (livros.isEmpty()){
                    System.out.println("Operação inválida! A lista ainda está vazia.");
                }
                else {
                    String nome = nome(scanner);
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
                }
            } else {
                loop = "Opção inválida! Digite 'Livro' ou 'Revista'.";
			    System.out.println(loop);
            }
        }while (loop.equals("Opção inválida! Digite 'Livro' ou 'Revista'."));
	}

}