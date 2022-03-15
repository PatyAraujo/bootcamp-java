package introduction.padrao.pi5.ex1.servicos;

import java.math.BigDecimal;

public class Transferir implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Transação realizada com sucesso!");
    }

    @Override
    public void transacaoNOK() {
        System.out.println("Transação não realizada!");
    }

    public void transferir(String conta, BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) > 0){
            this.transacaoOK();
        } else {
            this.transacaoNOK();
        }
    }
}
