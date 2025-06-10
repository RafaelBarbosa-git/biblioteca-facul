package projeto_2fase;

public class Livros extends Material {
	private int genero;

	public Livros(String titulo, String autor, int genero) {
		super(titulo, autor);
		this.genero = genero;

	}

	public int getGenero() {
		return genero;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Livros:\n- Titulo = " + super.getTitulo() + "\n- Autor: " + super.getAutor() + "\n- Genero = "
				+ this.genero;
	}

}
