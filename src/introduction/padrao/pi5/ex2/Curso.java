package introduction.padrao.pi5.ex2;

import java.util.Date;

public class Curso {
    private String nome;
    private String instituicao;
    private Integer cargaHoraria;
    private Integer anoInicio;
    private Integer anoConclusao;

    public Curso(String nome, String instituicao, Integer cargaHoraria, Integer anoInicio, Integer anoConclusao) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.cargaHoraria = cargaHoraria;
        this.anoInicio = anoInicio;
        this.anoConclusao = anoConclusao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Integer anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Integer getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(Integer anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String toString(){
        return this.anoInicio + " - " + this.anoConclusao + "       " + this.nome + " - " + this.instituicao + " - (" +
              this.cargaHoraria + "h)";
    }
}
