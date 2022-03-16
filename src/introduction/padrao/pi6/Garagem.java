package introduction.padrao.pi6;

import java.util.List;

public class Garagem {
    private Integer id;
    private List<Veiculo> veiculos;

    public Garagem(Integer id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
