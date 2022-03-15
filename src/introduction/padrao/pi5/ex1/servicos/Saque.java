package introduction.padrao.pi5.ex1.servicos;

import java.math.BigDecimal;

public class Saque implements Transacoes{
    private BigDecimal SALDO = new BigDecimal(1000);

    @Override
    public void transacaoOK() {
        System.out.println("Saque realizado com sucesso!");
    }

    @Override
    public void transacaoNOK() {
        System.out.println("Não é possivel sacar mais que 1000 Reais");
    }

    public void sacar(BigDecimal valor){
        if (SALDO.compareTo(valor) > 0){
            this.transacaoOK();
        } else {
            this.transacaoNOK();
        }
    }
}
