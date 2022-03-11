package introduction.padrao.pi4;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            System.out.println(b / a);
        } catch (Exception e){
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println();
        }
    }
}
