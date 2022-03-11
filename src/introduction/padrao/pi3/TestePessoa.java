package introduction.padrao.pi3;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaVazia = new Pessoa();
        Pessoa pessoaBasica = new Pessoa("Laura Rodrigues",15,"PB123");
        Pessoa pessoaCompleta = new Pessoa("Ana Silva",43,"PC321",65.4,1.67);
        //Qualquer outra forma de criar pessoas não vai complilar, uma vez que o construtor
        //estipula as unicas formas de referenciar um obj

        System.out.println(pessoaCompleta.toString());

        if (pessoaCompleta.ehMaiorIdade()){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        if (pessoaCompleta.calcularIMC() < 0){
            System.out.println("Abaixo do peso");
        } else if(pessoaCompleta.calcularIMC() == 0) {
            System.out.println("Peso Saudavel");
        } else {
            System.out.println("Sobrepeso");
        }
    }
}
