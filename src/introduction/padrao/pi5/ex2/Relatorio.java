package introduction.padrao.pi5.ex2;

public class Relatorio implements Impressora{

    private String texto;
    private Integer numeroDePaginas;
    private String autor;
    private String revisor;

    public Relatorio(String texto, Integer numeroDePaginas, String autor, String revisor) {
        this.texto = texto;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString(){
        return "Imprindo Relatorio...\n" +
                "Texto: " + this.texto + "\n" +
                "Numero de Paginas: " + this.numeroDePaginas + "\n" +
                "Autor: " + this.autor + "\n" +
                "revisor: " + this.revisor + "\n";
    }

    @Override
    public void imiprimir() {
        System.out.println(this);
    }
}
