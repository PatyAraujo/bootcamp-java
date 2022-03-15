package introduction.padrao.pi5.ex3;

public class Vaca extends Animal implements Herbivoro{
    @Override
    public void emitirSom() {
        System.out.println("Muuuuuuuuuu!");
    }

    @Override
    public void comerAnimal() {
        this.comerPasto();
    }

    @Override
    public void comerPasto() {
        System.out.println("Go Vegan!");
    }
}
