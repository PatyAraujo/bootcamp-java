package introduction.padrao.pi4.Exercicio2;

public class Pereciveis extends Produto{

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + " - Preço: R$" + super.getPreco() +
                " - Dias para o vencimento: " + this.diasParaVencer;
    }

    @Override
    public double calcular(int quantidade){
        if (diasParaVencer == 1) {
            return super.calcular(quantidade)/4;
        } else if (diasParaVencer == 2){
            return super.calcular(quantidade)/3;
        } else if (diasParaVencer == 3){
            return super.calcular(quantidade)/2;
        } else {
            return super.calcular(quantidade);
        }
    }
}
