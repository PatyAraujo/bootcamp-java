package introduction.padrao.pi5.ex3;

import java.util.ArrayList;
import java.util.List;

public class TesteDaBicharada {
    public static void main(String[] args) {
        Cachorro bailey = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        bailey.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
        bailey.comerCarne();
        gato.comerCarne();
        vaca.comerPasto();

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(vaca);
        animais.add(bailey);

        animais.stream().forEach(a -> a.comerAnimal());
    }
}
