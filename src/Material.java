package projeto_2fase;

public abstract class Material {

	protected String titulo;
	private String autor;

	public Material(String titulo, String autor) {
		this.setTitulo(titulo);
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Material:" + "\n- titulo='" + getTitulo() + "\n- autor='" + autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
