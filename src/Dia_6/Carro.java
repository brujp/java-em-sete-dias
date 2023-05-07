package Dia_6;

public class Carro {

    private String marca;
    private String modelo;
    private double valorDoCarro;
    private int anoFabricacao;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorDoCarro() {
        return valorDoCarro;
    }

    public void setValorDoCarro(double valorDoCarro) {
        double taxaDeJuros = 10.0 / 100.0;
        this.valorDoCarro = valorDoCarro + (valorDoCarro * taxaDeJuros);
    }

}
