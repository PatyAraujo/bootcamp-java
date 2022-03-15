package introduction.padrao.pi5.ex3;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        System.out.println("Miau! E isso ai!");
    }

    @Override
    public void comerAnimal() {
        this.comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Amo peixe! S2");
    }
}
