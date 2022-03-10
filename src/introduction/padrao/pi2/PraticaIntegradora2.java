package introduction.padrao.pi2;

import java.util.HashMap;
import java.util.Scanner;

public class PraticaIntegradora2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean sair = false;
        HashMap<Integer, Corredor> corridaCurta = new HashMap <Integer, Corredor> ();
        HashMap<Integer, Corredor> corridaMedia = new HashMap <Integer, Corredor> ();
        HashMap<Integer, Corredor> corridaLonga = new HashMap <Integer, Corredor> ();
        HashMap<String, Corredor> corrida = new HashMap <String, Corredor> ();
        
        while (!sair){
            mostrarOpcoes();
            int opcao = console.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Começando o cadastro!");
                    opcoesDeCorrida();
                    int tipoCorrida = console.nextInt();
                    System.out.println("Informe sua idade");
                    int idade = console.nextInt();
                    if (tipoCorrida == 3 && idade < 18) {
                        System.out.println("Infelizmente voce é muito novo para esse percurso");
                        System.out.println("Voce tem a opção de realizar percursos menores");
                        System.out.println("Digite o percurso desejado");
                        System.out.println("1- Circuito pequeno: 2 km pela selva e riachos.");
                        System.out.println("2- Circuito médio: 5 km pela selva, riachos e lama.");
                        System.out.println("3- Sair");
                        tipoCorrida = console.nextInt();
                        if (tipoCorrida == 3) {
                            break;
                        }
                    }
                    double precoInscricao = retornaPreco(tipoCorrida, idade);
                    System.out.println("O preço da sua inscrição é R$" + precoInscricao +
                            ". Deseja prosseguir?");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                    int continuar = console.nextInt();
                    if (continuar == 2) {
                        System.out.println("Voltando ao menu...");
                    } else if (continuar != 1) {
                        System.out.println("Opção não identificada. Voltando ao menu...");
                    }
                    System.out.println("Digite seu nome");
                    String nome = console.next();
                    System.out.println("Digite seu sobrenome");
                    String sobrenome = console.next();
                    System.out.println("Digite seu RG");
                    String rg = console.next();
                    if (corrida.containsKey(rg)) {
                        System.out.println("Voce ja se registrou em um percurso, voltando ao menu...");
                        break;
                    }
                    System.out.println("Digite seu numero de celular");
                    String numeroCelurar = console.next();
                    System.out.println("Digite seu numero do contato de emergencia");
                    String numeroEmergencia = console.next();
                    System.out.println("Digite seu grupo sanguineo");
                    String grupoSanguineo = console.next();
                    Corredor novoCorredor = new Corredor(rg, nome, sobrenome, idade, numeroCelurar, numeroEmergencia,
                            grupoSanguineo, tipoCorrida);
                    corrida.put(rg, novoCorredor);
                    if (tipoCorrida == 1) {
                        corridaCurta.put(novoCorredor.id, novoCorredor);
                    }
                    if (tipoCorrida == 2) {
                        corridaMedia.put(novoCorredor.id, novoCorredor);
                    }
                    if (tipoCorrida == 3) {
                        corridaLonga.put(novoCorredor.id, novoCorredor);
                    }
                    System.out.println("Parabéns voce foi inscrito! Seu numero é: " + novoCorredor.id
                            + " Aguarde o envio dos detalhes");
                    System.out.println("Deseja sair");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                    continuar = console.nextInt();
                    if (continuar == 1) {
                        sair = true;
                    }
                    break;
                case 2:
                    opcoesDeCorrida();
                    tipoCorrida = console.nextInt();
                    if (tipoCorrida == 1) {
                        corridaCurta.forEach((k, v) -> System.out.println(k + " - " + v.nome + " " + v.sobrenome));
                    } else if (tipoCorrida == 2) {
                        corridaMedia.forEach((k, v) -> System.out.println(k + " - " + v.nome + " " + v.sobrenome));
                    } else if (tipoCorrida == 3) {
                        corridaLonga.forEach((k, v) -> System.out.println(k + " - " + v.nome + " " + v.sobrenome));
                    } else {
                        System.out.println("Opção Invalida. Voltando ao menu...");
                    }
                    break;
                case 3:
                    System.out.println("Digite a inscricao a ser cancelada");
                    int id = console.nextInt();
                    if (corridaCurta.containsKey(id)) {
                        String rgCancelado = corridaCurta.get(id).rg;
                        corridaCurta.remove(id);
                        corrida.remove(rgCancelado);
                        System.out.println("Corrida cancelada com sucesso");
                    } else if (corridaMedia.containsKey(id)) {
                        String rgCancelado = corridaMedia.get(id).rg;
                        corridaMedia.remove(id);
                        corrida.remove(rgCancelado);
                        System.out.println("Corrida cancelada com sucesso");
                    } else if (corridaLonga.containsKey(id)){
                        String rgCancelado = corridaLonga.get(id).rg;
                        corridaLonga.remove(id);
                        corrida.remove(rgCancelado);
                        System.out.println("Corrida cancelada com sucesso");
                    } else {
                        System.out.println("Participante não incrito, voltando ao menu...");
                    }
                    break;
                case 4:
                    opcoesDeCorrida();
                    tipoCorrida = console.nextInt();
                    System.out.println("Informe sua idade");
                    idade = console.nextInt();
                    double preco = retornaPreco(tipoCorrida, idade);
                    if (preco > 0) {
                        System.out.println("O valor desse percursso é R$" + preco +
                                " para sua idade");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção selecionada é invalida, voltando ao menu...");
            }
        }
    }

    private static void mostrarOpcoes() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1- Cadastrar corredor");
        System.out.println("2- Listar participantes de uma categoria");
        System.out.println("3- Remover participante");
        System.out.println("4- Estimar valor");
        System.out.println("5- Sair");
    }

    private static void opcoesDeCorrida(){
        System.out.println("Digite o percurso desejado");
        System.out.println("1- Circuito pequeno: 2 km pela selva e riachos.");
        System.out.println("2- Circuito médio: 5 km pela selva, riachos e lama.");
        System.out.println("3- Circuito Avançado: 10 km pela selva, riachos, lama e escalada.");
    }

    private static double retornaPreco(int opcao, int idade){
        switch (opcao){
            case 1:
                if(idade <= 18){
                    return 1300.00;
                }
                return 1500.00;
            case 2:
                if(idade <= 18){
                    return 2000.00;
                }
                return 2300.00;
            case 3:
                if(idade <= 18){
                    System.out.println("Idade não permitida para esse percurso");
                    return -1;
                }
                return 2800.00;
            default:
                System.out.println("Opçao de corrida invalida");
                return -1;
        }
    }
}