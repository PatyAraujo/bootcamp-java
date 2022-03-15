package introduction.padrao.pi5.ex1.clientes;

import introduction.padrao.pi5.ex1.servicos.ConsultaSaldo;
import introduction.padrao.pi5.ex1.servicos.Pagamentos;
import introduction.padrao.pi5.ex1.servicos.Saque;

import java.math.BigDecimal;

public class Basico {
    ConsultaSaldo consultaSaldo = new ConsultaSaldo();
    Pagamentos pagamentos = new Pagamentos();
    Saque saque = new Saque();

    public void consultarSaldo(Boolean possoConsultar){
        consultaSaldo.consultarSaldo(possoConsultar);
    }

    public void pagarServico(BigDecimal pagamento){
        pagamentos.pagar(pagamento);
    }

    public void sacarDinheiro(BigDecimal valor){
        saque.sacar(valor);
    }
}
