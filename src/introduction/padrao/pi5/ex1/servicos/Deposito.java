package introduction.padrao.pi5.ex1.servicos;

import java.math.BigDecimal;

public class Deposito implements Transacoes{
    @Override
    public void transacaoOK() {
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    public void transacaoNOK() {
        System.out.println("Deposito não realizado");
    }

    public void depositar(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) > 0){
            this.transacaoOK();
        } else {
            this.transacaoNOK();
        }
    }
}
