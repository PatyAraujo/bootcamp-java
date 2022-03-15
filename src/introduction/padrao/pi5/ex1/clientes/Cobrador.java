package introduction.padrao.pi5.ex1.clientes;

import introduction.padrao.pi5.ex1.servicos.ConsultaSaldo;
import introduction.padrao.pi5.ex1.servicos.Saque;

import java.math.BigDecimal;

public class Cobrador {
    Saque saque = new Saque();
    ConsultaSaldo consultaSaldo = new ConsultaSaldo();

    public void sacarDinheiro(BigDecimal valor){
        saque.sacar(valor);
    }

    public void consultarSaldo(Boolean possoConsultar){
        consultaSaldo.consultarSaldo(possoConsultar);
    }
}
