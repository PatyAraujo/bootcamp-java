package introduction.padrao.pi5.ex2;

import java.util.Date;

public class ExperienciaProfissional {
    private String empresa;
    private String cargo;
    private String descricao;
    private Integer dataInicio;
    private Integer dataFim;

    public ExperienciaProfissional(String empresa, String cargo, String descricao, Integer dataInicio, Integer dataFim) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Integer dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getDataFim() {
        return dataFim;
    }

    public void setDataFim(Integer dataFim) {
        this.dataFim = dataFim;
    }

    public String toString() {
        return "(" + this.dataInicio + " - " + this.dataFim + ")       " + this.cargo + "\n"
                + "                    " + this.empresa + "\n"
                + "                    " + this.descricao;
    }
}
