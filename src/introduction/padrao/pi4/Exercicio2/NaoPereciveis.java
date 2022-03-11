package introduction.padrao.pi4.Exercicio2;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + " - Preço: R$" + super.getPreco() +
                " - Tipo: " + this.getTipo();
    }
}
