package introduction.padrao.pi5.ex1;

import introduction.padrao.pi5.ex1.clientes.Basico;
import introduction.padrao.pi5.ex1.clientes.Cobrador;
import introduction.padrao.pi5.ex1.clientes.Executivo;
import introduction.padrao.pi5.ex1.util.PodeAcessar;

import java.math.BigDecimal;

public class TesteBanco {
    public static void main(String[] args) {
        System.out.println("TESTE EXECUTIVO:");
        Executivo executivo = new Executivo();
        executivo.fazerDeposito(BigDecimal.valueOf(1000));
        executivo.fazerDeposito(BigDecimal.valueOf(-1000));
        executivo.fazerTransferencia("0215",BigDecimal.valueOf(1000));
        executivo.fazerTransferencia("0215",BigDecimal.valueOf(-1000));
        System.out.println("TESTE BASICO");
        Basico basico = new Basico();
        basico.consultarSaldo(PodeAcessar.PODE_ACESSAR.isPermissao());
        basico.consultarSaldo(PodeAcessar.NAO_PODE_ACESSAR.isPermissao());
        basico.pagarServico(new BigDecimal(123));
        basico.pagarServico(new BigDecimal(-3));
        basico.sacarDinheiro(new BigDecimal(34));
        basico.sacarDinheiro(new BigDecimal(1600));
        System.out.println("TESTE COBRADORES");
        Cobrador cobrador = new Cobrador();
        cobrador.consultarSaldo(PodeAcessar.PODE_ACESSAR.isPermissao());
        cobrador.consultarSaldo(PodeAcessar.NAO_PODE_ACESSAR.isPermissao());
        cobrador.sacarDinheiro(new BigDecimal(34));
        cobrador.sacarDinheiro(new BigDecimal(1600));
    }
}
