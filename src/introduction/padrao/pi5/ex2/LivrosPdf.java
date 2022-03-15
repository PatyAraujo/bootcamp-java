package introduction.padrao.pi5.ex2;

public class LivrosPdf implements Impressora{
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private String genero;

    public LivrosPdf(String titulo, String autor, Integer numeroPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Imprindo PDF...\n" +
                "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Numero de Paginas: " + this.numeroPaginas + "\n" +
                "Genero: " + this.genero + "\n";
    }

    @Override
    public void imiprimir() {
        System.out.println(this);
    }
}
