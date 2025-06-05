public class Livros extends Material{
    private int genero;

    public Livros(String titulo, String autor, int genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public int getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Livros:\n- Titulo = " + super.getTitulo() +
                "\n- Autor: " + super.getAutor() +
                "\n- Genero = " + this.genero;
    }
}
