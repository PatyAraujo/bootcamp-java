package introduction.padrao.pi4.Exercicio2;

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        Produto apontador = new NaoPereciveis("Apntador",1.50,"Papelaria");
        Produto banana = new Pereciveis("Banana", 1.0,3);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(apontador);
        produtos.add(banana);
        double total = 0;

        System.out.println("Produtos Adicionados ao carrinho");
        for (Produto produto : produtos){
            System.out.println(produto.toString());
            System.out.println("Subtotal: R$" + produto.calcular(5));
            total += produto.calcular(5);
        }
        System.out.println("TOTAL: R$" + total);
    }
}
