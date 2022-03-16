package introduction.padrao.pi6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteGaragem {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Ford","Fiesta", 1000));
        veiculos.add(new Veiculo("Ford","Focus", 1200));
        veiculos.add(new Veiculo("Ford","Explored", 2500));
        veiculos.add(new Veiculo("Fiat","Uno", 500));
        veiculos.add(new Veiculo("Fiat","Cronos",1000));
        veiculos.add(new Veiculo("Fiat","Torino", 1250));
        veiculos.add(new Veiculo("Chevrolet","Aveo", 1250));
        veiculos.add(new Veiculo("Chevrolet","Spin", 2500));
        veiculos.add(new Veiculo("Toyota","Corola", 1200));
        veiculos.add(new Veiculo("Toyota","Fortuner", 3000));
        veiculos.add(new Veiculo("Renault","Logan", 950));
        Garagem garagem = new Garagem(1,veiculos);

        System.out.println("Lista 0rdenada por preço");
        List<Veiculo> ordenadaPorPreco =
        veiculos.stream().sorted(Comparator.comparing(Veiculo::getPreco))
                .collect(Collectors.toList());
        ordenadaPorPreco.forEach(System.out::println);
        System.out.println("");

        System.out.println("Lista ordenada por marca");
        List<Veiculo> ordenadaPorMarca = veiculos.stream().sorted(Comparator.comparing(Veiculo::getMarca))
                .collect(Collectors.toList());
        ordenadaPorMarca.forEach(System.out::println);
        System.out.println("");

        System.out.println("Lista dos baratinhos");
        List<Veiculo> baratinhos = veiculos.stream().filter(veiculo ->
                veiculo.getPreco() <= 1000).collect(Collectors.toList());
        baratinhos.forEach(System.out::println);
        System.out.println("");

        System.out.println("Lista dos caros");
        List<Veiculo> caros = veiculos.stream().filter(veiculo ->
                veiculo.getPreco() > 1000).collect(Collectors.toList());
        caros.forEach(System.out::println);
        System.out.println("");

        double media = veiculos.stream().mapToDouble(Veiculo::getPreco).average().getAsDouble();
        System.out.println("Media: " + media);
    }
}
