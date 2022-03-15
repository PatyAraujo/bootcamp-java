package introduction.padrao.pi6.ex1;

import java.math.BigDecimal;

public class Veiculo {
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo(String marca, String modelo, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return "Modelo: " +  this.modelo + " - Marca: " + this.marca + " - Preco: " + this.preco;
    }
}
