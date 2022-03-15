package introduction.padrao.pi5.ex2;

import introduction.padrao.pi5.ex2.util.GeradorCurriculo;

import java.util.ArrayList;
import java.util.List;

public class TesteImpressora {
    public static void main(String[] args) {
        Curriculo cvAna = GeradorCurriculo.gerarCurriculoAna();
        Curriculo cvAndre = GeradorCurriculo.gerarCurriculoAndre();
        LivrosPdf harry = new LivrosPdf("Harry Potter", "JK",300, "Aventura");
        Relatorio relatorio = new Relatorio("Esse exercicio ficou top",1,"Paty Araujo", "Paty Araujo");
        List<Impressora> listaDaImpressora = new ArrayList<>();
        listaDaImpressora.add(cvAna);
        listaDaImpressora.add(harry);
        listaDaImpressora.add(cvAndre);
        listaDaImpressora.add(relatorio);
        listaDaImpressora.stream().forEach(li -> li.imiprimir());
    }
}
