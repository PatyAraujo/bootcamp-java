package introduction.padrao.pi3;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura,2));
        if (imc < 20){
            return -1;
        } else if (imc <= 25){
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){
        return this.idade >= 18;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", idade: " + this.idade + ", id:" + this.id + ", peso:"
                + this.peso + "Kg, Altura:" + this.altura + "m";
    }
}
