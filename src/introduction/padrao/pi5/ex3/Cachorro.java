package introduction.padrao.pi5.ex3;

public class Cachorro extends Animal implements Carnivoro{

    @Override
    public void emitirSom(){
        System.out.println("Arrrrrrrau!");
    }

    @Override
    public void comerAnimal() {
        this.comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Amo frango S2");
    }
}
