package introduction.padrao.pi5.ex1.servicos;

public class ConsultaSaldo implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Seu saldo é 1000 reais");
    }

    @Override
    public void transacaoNOK() {
        System.out.println("Não posso consultar se saldo");
    }

    public void consultarSaldo(boolean possoConsultar){
        if (possoConsultar){
            this.transacaoOK();
        } else {
            this.transacaoNOK();
        }
    }
}
