package introduction.padrao.pi2;

public class Corredor {
    static int identificador = 1;
    int id;
    String rg;
    String nome;
    String sobrenome;
    int idade;
    String numeroCelular;
    String numeroEmergencia;
    String grupoSanguineo;
    int tipoDaCorrida;

    public Corredor(String rg, String nome, String sobrenome, int idade, String numeroCelular, String numeroEmergencia,
                    String grupoSanguineo, int tipoDaCorrida) {
        this.id = identificador++;
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.tipoDaCorrida = tipoDaCorrida;
    }
}
