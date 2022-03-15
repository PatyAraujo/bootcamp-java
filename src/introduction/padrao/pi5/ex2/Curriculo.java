package introduction.padrao.pi5.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curriculo implements Impressora{
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<Curso> cursos;
    private List<ExperienciaProfissional> experienciaProfissionais;

    public Curriculo(String nome, String endereco, String telefone, List<Curso> cursos, List<ExperienciaProfissional>
            experienciaProfissionais, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cursos = cursos;
        this.experienciaProfissionais = experienciaProfissionais;
    }

    public Curriculo() {
        this.cursos = new ArrayList<>();
        this.experienciaProfissionais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<ExperienciaProfissional> getExperienciaProfissionais() {
        return experienciaProfissionais;
    }

    public void setExperienciaProfissionais(List<ExperienciaProfissional> experienciaProfissionais) {
        this.experienciaProfissionais = experienciaProfissionais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        String cabecalho = "----------------------------------------------------------------\n"
                + "Dados Pessoais: \n"
                + "Nome: " + this.nome + "\n"
                + "Telefone: " + this.telefone + "\n"
                + "Endereco: " + this.endereco + "\n"
                + "Email: " + this.email + "\n"
                + "----------------------------------------------------------------\n";
        String academico = "";
        if (this.cursos.size() > 0){
            academico = "Informações Academicas: \n" +
            cursos.stream().map(curso -> curso.toString() + "\n").collect(Collectors.joining())
            + "----------------------------------------------------------------\n";
        }
        String experiencias = "";
        if (this.experienciaProfissionais.size() > 0) {
            experiencias = "Experiencias Profissionais: \n"
                    + experienciaProfissionais.stream().map(experienciaProfissional ->
                    experienciaProfissional.toString() + "\n").collect(Collectors.joining())
            + "----------------------------------------------------------------";
        }
        return cabecalho + academico + experiencias;
    }

    @Override
    public void imiprimir() {
        System.out.println(this);
    }
}
