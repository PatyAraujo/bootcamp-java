package introduction.padrao.pi5.ex1.clientes;

import introduction.padrao.pi5.ex1.servicos.Deposito;
import introduction.padrao.pi5.ex1.servicos.Transferir;

import java.math.BigDecimal;

public class Executivo {
   Deposito deposito = new Deposito();
   Transferir transferir = new Transferir();

   public void fazerDeposito(BigDecimal valor){
       deposito.depositar(valor);
   }

   public void fazerTransferencia(String conta, BigDecimal valor){
       transferir.transferir(conta,valor);
   }
}
