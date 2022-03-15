package introduction.padrao.pi5.ex1.servicos;

import java.math.BigDecimal;

public class Pagamentos implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Pagamento realizado com sucesso!");
    }

    @Override
    public void transacaoNOK() {
        System.out.println("Pagamento não realizado =/");
    }

    public void pagar(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) > 0){
            this.transacaoOK();
        } else {
            this.transacaoNOK();
        }
    }
}
