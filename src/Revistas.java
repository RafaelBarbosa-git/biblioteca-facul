public class Revistas  extends Material{
    private int numeroDaEdicao;

    public Revistas(String titulo, String autor, int numeroDaEdicao) {
        super(titulo, autor);
        this.numeroDaEdicao = numeroDaEdicao;
    }

    public int getNumeroDaEdicao() {
        return numeroDaEdicao;
    }

    @Override
    public String toString() {
        return "Revistas:\n- Titulo = " + super.getTitulo() +
                "\n- Autor: " + super.getAutor() +
                "\n- numeroDaEdicao = " + this.numeroDaEdicao;
    }
}
